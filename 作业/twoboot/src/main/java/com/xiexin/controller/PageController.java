package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {  ///page/studentList
    @RequestMapping("/sessionlog")
    public String sessionlog(){
        return "sessionlog";
    }
    @RequestMapping("/syslog")
    public String syslog(){
        return "syslog";
    }
}
