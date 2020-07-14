package com.study;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lipo
 * @date 2020/7/14
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public Object list() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "aa", 2));
        list.add(new User(2, "bb", 3));
        return list;
    }
}
