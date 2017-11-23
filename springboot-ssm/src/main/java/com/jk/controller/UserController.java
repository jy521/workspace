package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.User;
import com.jk.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by yy on 2017/11/15.
 */
@RestController
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> userList(){
        List<User> list = userService.userList();
        return list;
    }
    @RequestMapping("/base/json")
    public void exchangeJson(HttpServletRequest request, String callback, Integer id, String name, String pwd, HttpServletResponse response) {
        System.out.println("id:" + id + " name:" + name + " pwd:" + pwd);
        List<User> userBOs = userService.userList();
        String json = JSON.toJSONStringWithDateFormat(userBOs, "yyyy-MM-dd HH:mm:ss");
        json=callback+"("+json+")";
        super.outString(json, response);
    }

}
