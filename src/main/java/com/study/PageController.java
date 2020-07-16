package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lipo
 * @date 2020/7/14
 */
@Controller
public class PageController {
    @RequestMapping("/goAdd")
    public String goAdd(Model model){
        model.addAttribute("name", "lipo");
        return "add";
    }
}
