package com.Flat101Blog.blog.BlogService;

import com.Flat101Blog.blog.BlogEntity.Post;
import com.Flat101Blog.blog.BlogRepository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImple implements PostService {


    @Autowired
    PostRepository ps;

    @Override
    public void AddPost(Post post) {

    }

    @Override
    public Post UpdatePost(Post post) {
        return null;
    }

    @Override
    public void DeletePostById(int id) {

    }

    @Override
    public List<Post> GetAllPost() {
        return null;
    }

    @Override
    public Post GetPost(String s) {
        return null;
    }
}
