package com.lls.service;


import com.lls.bean.LoginResult;
import com.lls.bean.User;

/**
 * Package:com.lls.provider
 * User: lls
 * Date: 15/9/16
 * Time: 下午5:17
 * Desc:
 *
 *
 */
public interface LoginService {

    public LoginResult login(User user);

}
