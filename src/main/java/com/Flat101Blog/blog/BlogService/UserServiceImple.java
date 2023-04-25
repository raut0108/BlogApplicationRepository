package com.Flat101Blog.blog.BlogService;

import com.Flat101Blog.blog.BlogEntity.User;
import com.Flat101Blog.blog.BlogRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    UserRepository userrepo;



//
//    public UserServiceImple(UserRepository userrepo) {
//        this.userrepo = userrepo;
//    }

    @Override
    public User CreateUser(User uobj) {

        return !userrepo.existsByEmail(uobj.getEmail()) ? userrepo.save(uobj) : new User();


    }


    @Override
    public String DeleteUser(int id) {

        if(userrepo.existsById(id))
        {
            userrepo.deleteById(id);
         return "user Deleted";
        }

        else
            return "No user exists";



    }

    @Override
    public List<User> GetAllUser() {
        List<User> lst= userrepo.findAll();
        return lst;
    }

    @Override
    public Optional GetUserById(int id) {

       Optional u= userrepo.existsById(id) ? userrepo.findById(id) : Optional.of(new User());
        return u;
    }

    @Override
    public User UpdateUser(int id) {
        return null;
    }
}
