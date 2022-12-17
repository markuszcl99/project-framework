package com.markus.project.service.impl;

import com.markus.project.common.core.domain.entity.Users;
import com.markus.project.mapper.UsersMapper;
import com.markus.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: markus
 * @date: 2022/12/17 4:30 PM
 * @Description:
 * @Blog: http://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> getAllUsers() {
        return usersMapper.getAllUsers();
    }
}
