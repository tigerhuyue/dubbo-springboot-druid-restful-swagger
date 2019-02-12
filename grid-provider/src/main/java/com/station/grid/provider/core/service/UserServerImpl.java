package com.station.grid.provider.core.service;

import com.alibaba.dubbo.config.annotation.Service;

//import com.station.grid.provider.core.domain.entity.Users;
import com.station.grid.dao.entity.Users;
//import com.station.grid.provider.core.domain.repository.UsersRepository;
import  com.station.grid.dao.repository.UsersRepository;
import com.station.grid.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import  com.alibaba.fastjson.*;
import java.util.List;

@Service
public class UserServerImpl implements UserService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public String getUserName(String id) {
        Users users=new Users();
        users.setUserid(id);
        users.setAge(10);
        users.setUsername("wamg");
        usersRepository.save(users);
        List<Users> list=usersRepository.findAll();
        String str= JSON.toJSONString(list);
        return str;
    }
}
