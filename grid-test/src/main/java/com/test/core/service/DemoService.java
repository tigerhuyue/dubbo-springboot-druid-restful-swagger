package com.test.core.service;

import com.station.grid.dao.entity.Users;
import com.station.grid.dao.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    UsersRepository usersRepository;
    public  void test ()
    {
        List<Users> list=usersRepository.findAll();
    }

}
