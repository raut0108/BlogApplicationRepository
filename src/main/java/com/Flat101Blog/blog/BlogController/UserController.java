package com.Flat101Blog.blog.BlogController;


import com.Flat101Blog.blog.BlogEntity.User;
import com.Flat101Blog.blog.BlogService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

     UserService userservice;

     @Autowired
    public UserController(UserService userservice)
    {
        this.userservice = userservice;
    }

    public void CreateUser(@RequestBody User user)
        {
               userservice.CreateUser(user);
        }



}
