package com.example.demo.service.Service;

import com.example.demo.Dao.entity.User;
import com.example.demo.utils.ResponseResult;

/**
 * @author ChuYang
 * @version 1.0
 */
public interface LoginService {
    ResponseResult login(User user);
    ResponseResult logout();

}
