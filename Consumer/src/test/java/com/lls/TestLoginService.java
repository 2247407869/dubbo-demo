package com.lls;

import com.lls.service.ECardService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Package:com.lls.provider
 * User: lls
 * Date: 15/9/16
 * Time: 下午5:24
 * Desc:
 *
 *
 */
public class TestLoginService {

    static ApplicationContext applicationContext;

    @BeforeClass
    public static void initSpring() {
        applicationContext = new ClassPathXmlApplicationContext(
                "classpath:spring-local.xml",
                "classpath:spring-services.xml");
    }

    @Test
    public void registServices() throws InterruptedException {
        ECardService eCardService = applicationContext.getBean(ECardService.class);
        assertEquals("AAAA", eCardService.getCard("shuwei", "111"));
    }

    @AfterClass
    public static void destroySpring() {
        ((AbstractApplicationContext) applicationContext).destroy();
    }

}
