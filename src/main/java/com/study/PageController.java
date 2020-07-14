package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipo
 * @date 2020/7/14
 */
@Controller
public class PageController {
    @RequestMapping("/hello")
    public String index(){
        return "index";
    }
}
