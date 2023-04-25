package com.Flat101Blog.blog.BlogController;


import com.Flat101Blog.blog.BlogEntity.User;
import com.Flat101Blog.blog.BlogService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {


    UserService userservice;
     @Autowired
    public UserController(UserService userservice)
    {
        this.userservice = userservice;
    }

    @PostMapping("/user")
    public User CreateUser(@RequestBody User user)
        {
            return userservice.CreateUser(user);
        }


        @DeleteMapping("/deleteuser/{id}")
        public String deleteUser(@PathVariable int id)
        {
            return userservice.DeleteUser(id);
            //System.out.println();
        }

        @GetMapping("/all")
        public List<User> getAll()
        {
            return userservice.GetAllUser();
        }

        @GetMapping("/userbyid/{id}")
       public Optional getUserById(@PathVariable int id)
        {
            return userservice.GetUserById(id);
        }

}
