package com.example.springbootunittests;

import com.example.springbootunittests.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class) // @RunWith: integrate spring with junit
//@SpringBootTest(classes = {SpringBootUnitTestsApplication.class}) // @SpringBootTest: this class is spring boot test.
@ContextConfiguration(classes = {SpringBootUnitTestsApplication.class})
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        Assert.assertEquals(userService.getUser(), "Tom");
    }
}


