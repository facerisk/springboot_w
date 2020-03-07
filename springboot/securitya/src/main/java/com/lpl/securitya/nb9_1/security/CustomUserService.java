package com.lpl.securitya.nb9_1.security;


import com.lpl.securitya.nb9_1.dao.SysUserRepository;
import com.lpl.securitya.nb9_1.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class CustomUserService implements UserDetailsService {
    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        SysUser user =
                sysUserRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在！");
        }

        return user;
    }
}
