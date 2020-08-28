package com.lnb.controller;

import com.lnb.model.User;
import com.lnb.response.Response;
import com.lnb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public Object test(){
        return "test";
    }

    @RequestMapping("/getAll")
    public Object getAll(){
        List<User> list = testService.getAll();
        return Response.getSuccessResponse(list);
    }
}
