package com.lnb.service;

import com.lnb.mapper.TestMapper;
import com.lnb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public List<User> getAll() {
        List<User> list = testMapper.getAll();
        return list;
    }
}
