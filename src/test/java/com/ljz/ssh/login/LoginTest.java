package com.ljz.ssh.login;

import com.ljz.ssh.controller.AppController;
import com.ljz.ssh.model.User;
import com.ljz.ssh.service.UserProfileService;
import com.ljz.ssh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ljz.ssh.configuartion.AppConfig;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@WebAppConfiguration
public class LoginTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserProfileService userProfileService;
    @Autowired
    private AppController appController;

    @Test
    public void login() {
        System.out.println(appController.loginPage());
    }

    @Test
    public void listUsers() {
        List<User> users = userService.findAllUsers();
        System.out.println(users);
    }
}
