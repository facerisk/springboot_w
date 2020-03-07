package com.lpl.springMVC4.web.nb4_5;

import com.lpl.springMVC4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {
    @RequestMapping(value = "/convert",produces = {"application/x-wisely"})
    public @ResponseBody
    DemoObj convert(@RequestBody DemoObj demoObj) {
        System.out.println(demoObj.getId()+"--"+demoObj.getName());
        return demoObj;
    }
}
