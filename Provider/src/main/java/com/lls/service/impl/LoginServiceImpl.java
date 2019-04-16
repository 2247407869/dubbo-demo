package com.lls.service.impl;

import com.lls.bean.LoginResult;
import com.lls.bean.User;
import com.lls.service.LoginCheckService;
import com.lls.service.LoginService;

/**
 * Package:com.lls.provider
 * User: lls
 * Date: 15/9/16
 * Time: 下午3:37
 * Desc:
 *
 *
 */
public class LoginServiceImpl implements LoginService {

    private LoginCheckService loginCheckService;

    public LoginResult login(User user) {
        LoginResult loginResult;
        try {
            loginCheckService.check(user);
            loginResult = loginSuccess();
        } catch (Exception e) {
            loginResult = loginError();
        }
        return loginResult;
    }

    public void setLoginCheckService(LoginCheckService loginCheckService) {
        this.loginCheckService = loginCheckService;
    }

    private LoginResult loginSuccess() {
        return new LoginResult("0000", "成功啦");
    }

    private LoginResult loginError() {
        return new LoginResult("9999", "错误啦");
    }
}
