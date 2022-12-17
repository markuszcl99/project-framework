package com.markus.project.mapper;

import com.markus.project.common.core.domain.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: markus
 * @date: 2022/12/17 4:19 PM
 * @Description: UsersMapper
 * @Blog: http://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
@Mapper
public interface UsersMapper {
    /**
     * 查询所有用户
     */
    public List<Users> getAllUsers();
}
