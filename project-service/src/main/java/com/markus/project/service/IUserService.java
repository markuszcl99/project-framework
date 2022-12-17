package com.markus.project.service;

import com.markus.project.common.core.domain.entity.Users;

import java.util.List;

/**
 * @author: markus
 * @date: 2022/12/17 4:29 PM
 * @Description:
 * @Blog: http://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public interface IUserService {

    public List<Users> getAllUsers();
}
