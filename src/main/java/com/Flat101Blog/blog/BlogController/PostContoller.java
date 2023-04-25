package com.Flat101Blog.blog.BlogController;

import com.Flat101Blog.blog.BlogEntity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PostContoller {

    PostContoller postcontroller;
@Autowired
    public PostContoller(PostContoller postcontroller) {
        this.postcontroller = postcontroller;
    }

    public void addPost(@RequestBody Post post)
    {
        postcontroller.addPost(post);
    }
}
