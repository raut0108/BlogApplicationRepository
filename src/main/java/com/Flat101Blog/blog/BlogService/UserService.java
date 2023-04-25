package com.Flat101Blog.blog.BlogService;

<<<<<<< HEAD
public interface UserService {

=======
import com.Flat101Blog.blog.BlogEntity.User;

import java.util.List;

public interface UserService {

      public void CreateUser(User uobj);
      public void DeleteUser(int id);

      public List<User> GetAllUser();
      public User GetUserById(int id);
      public User UpdateUser(int id);

>>>>>>> 3261b6d8237d01c3d229ec1003f7e75bf585aabe
}
