package com.Flat101Blog.blog.BlogRepository;

import com.Flat101Blog.blog.BlogEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    public boolean existsByEmail(String email);

    public boolean existsById(int id);
}
