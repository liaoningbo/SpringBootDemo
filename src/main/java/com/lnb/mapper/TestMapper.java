package com.lnb.mapper;

import com.lnb.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestMapper {
    List<User> getAll();
}
