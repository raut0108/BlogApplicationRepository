package com.Flat101Blog.blog.BlogService;

import com.Flat101Blog.blog.BlogEntity.Post;

import java.util.List;

public interface PostService {

    public void addPost(Post post);
    public void updatePost(Post post);
    public void deletePostById(int pid);
    public List<Post> getAllPost();
    public Post getPost(String s);
}
