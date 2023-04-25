package com.Flat101Blog.blog.BlogRepository;

import com.Flat101Blog.blog.BlogEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends JpaRepository<User,Integer>{
}
