package com.xiangwen.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiangwen.mapper.ClassModerMapper;
import com.xiangwen.mapper.UserMapper;
import com.xiangwen.model.ClassModel;
import com.xiangwen.model.ClassNew;
import com.xiangwen.model.Teacher;
import com.xiangwen.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private  ClassModerMapper classModerMapper;
    public int insertSelective(User record){
        int res=userMapper.insert(record);
        log.info("新增res:"+res+",userId:"+record.getUserId());
        return record.getUserId();
    }
    public PageInfo<User> findListUser(int startPage,int pageSize){
        PageHelper.startPage(startPage, pageSize);
        List<User> users=userMapper.findListUser();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo;
    }
    public User findUserById(int id){
       User user=userMapper.selectByPrimaryKey(id);
        return user;
    }
    public ClassModel findClassById(int id){
        ClassModel classModel=classModerMapper.findById(id);
        return  classModel;
    }
    public ClassModel findClassById2(int id){
        ClassModel classModel=classModerMapper.findByIdTwo(id);
        return  classModel;
    }
    public ClassNew findClassNewById(int id){
        ClassNew classModel=classModerMapper.findNewClass(id);
        return  classModel;
    }
    public ClassNew findClassNewById2(int id){
        ClassNew classModel=classModerMapper.findNewClassTwo(id);
        return  classModel;
    }
}
