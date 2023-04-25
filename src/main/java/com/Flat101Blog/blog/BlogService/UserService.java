package com.Flat101Blog.blog.BlogService;

import com.Flat101Blog.blog.BlogEntity.User;

import java.util.List;

public interface UserService {

      public void CreateUser(User uobj);
      public void DeleteUser(int id);

      public List<User> GetAllUser();
      public User GetUserById(int id);
      public User UpdateUser(int id);

}
