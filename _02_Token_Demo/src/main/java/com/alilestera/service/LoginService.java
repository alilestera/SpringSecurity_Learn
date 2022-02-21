package com.alilestera.service;

import com.alilestera.domain.ResponseResult;
import com.alilestera.domain.User;

/**
 * @author Alilestera
 * @date 2/22/2022
 */
public interface LoginService {
    ResponseResult login(User user);
}
