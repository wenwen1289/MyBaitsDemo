package com.xiangwen.controller;

import com.github.pagehelper.PageInfo;
import com.xiangwen.model.ClassModel;
import com.xiangwen.model.ClassNew;
import com.xiangwen.model.User;
import com.xiangwen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser")
    public int addUser(User user){
        int res=userService.insertSelective(user);
        return res;
    }
    @RequestMapping("/findUsers")
    public PageInfo<User> findUsers(int startPage, int pageSize){
        PageInfo<User> pageInfo=userService.findListUser(startPage,pageSize);
        return pageInfo;
    }
    @RequestMapping("/findUserById")
    public User findUserById(int id){
        User user=userService.findUserById(id);
        return user;
    }
    @RequestMapping("/findClassById")
    public ClassModel findClassModelById(int id){
        ClassModel model=userService.findClassById(id);
        return  model;
    }
    @RequestMapping("/findClassById2")
    public ClassModel findClassModelById2(int id){
        ClassModel model=userService.findClassById2(id);
        return  model;
    }
    @RequestMapping("/findClassById3")
    public ClassNew findClassModelById3(int id){
        ClassNew model=userService.findClassNewById(id);
        return  model;
    }
    @RequestMapping("/findClassById4")
    public ClassNew findClassModelById4(int id){
        ClassNew model=userService.findClassNewById2(id);
        return  model;
    }
}
