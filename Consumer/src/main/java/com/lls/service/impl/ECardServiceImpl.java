package com.lls.service.impl;



import com.lls.bean.LoginResult;
import com.lls.bean.User;
import com.lls.service.ECardService;
import com.lls.service.LoginService;

import java.util.Objects;

/**
 * Package:com.lls.provider
 * User: lls
 * Date: 15/9/16
 * Time: 下午5:15
 * Desc:
 *
 *
 */
public class ECardServiceImpl implements ECardService {

    private LoginService loginService;

    public String getCard(String username, String password) {
        LoginResult loginResult = loginService.login(new User(username, password));
        if (Objects.equals("0000", loginResult.getResponseCode())) {
            return "AAAA";
        }
        return "BBBB";
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
