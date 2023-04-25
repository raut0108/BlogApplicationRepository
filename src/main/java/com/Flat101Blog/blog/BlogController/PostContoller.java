package com.Flat101Blog.blog.BlogController;

import com.Flat101Blog.blog.BlogEntity.Post;
import com.Flat101Blog.blog.BlogService.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostContoller {


    PostService postservice;

    @Autowired
    public PostContoller(PostService postservice) {
        this.postservice = postservice;
    }


    @PostMapping("/post")
     public void AddPost1(@RequestBody Post post)
     {
         postservice.AddPost(post);
     }




}
