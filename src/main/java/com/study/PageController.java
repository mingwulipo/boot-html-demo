package com.study;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lipo
 * @date 2020/7/14
 */
@Controller
public class PageController {
    /**
     * 页面跳转，页面必须在templates目录下才可以
     * @param model
     * @return
     */
    @RequestMapping("/goAdd")
    public String goAdd(Model model){
        model.addAttribute("name", "lipo");
        model.addAttribute("divImg", "<div style='position: absolute;border:1px solid red;top:"
                + 100 + "px;left: " + 85 + "px;width: " + 45 + "px;height:" + 45 + "px;'></div>");

        List<User> list = new ArrayList<>();
        list.add(new User(1, "aa", 2));
        list.add(new User(2, "bb", 3));
        model.addAttribute("userList", list);

        return "add";
    }
}
