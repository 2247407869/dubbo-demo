package com.lls;

import com.lls.bean.LoginResult;
import com.lls.bean.User;
import com.lls.service.LoginService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Package:com.lls.provider
 * User: lls
 * Date: 15/9/16
 * Time: 下午4:10
 * Desc:
 *
 *
 */
public class LoginServiceTest {

    static ApplicationContext applicationContext;

    @BeforeClass
    public static void initSpring(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-local.xml");
    }

    @Test
    public void testLocalCallService(){
        LoginService loginService = applicationContext.getBean(LoginService.class);
        LoginResult loginResult = loginService.login(null);
        assertEquals("9999", loginResult.getResponseCode());
        LoginResult loginResultSuccess = loginService.login(new User("shuwei", "111"));
        assertEquals("0000", loginResultSuccess.getResponseCode());
    }

    @AfterClass
    public static void destroySpring(){
        ((AbstractApplicationContext)applicationContext).destroy();
    }
    
}
