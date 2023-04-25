package com.Flat101Blog.blog.BlogService;

import com.Flat101Blog.blog.BlogEntity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

      public User CreateUser(User uobj);
      public String DeleteUser(int id);

      public List<User> GetAllUser();
      public Optional GetUserById(int id);
      public User UpdateUser(int id);

}
