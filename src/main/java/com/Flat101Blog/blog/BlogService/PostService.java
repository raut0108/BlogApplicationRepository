package com.Flat101Blog.blog.BlogService;

import com.Flat101Blog.blog.BlogEntity.Post;

import java.util.List;


public interface PostService  {



       public void AddPost(Post post);
       public Post UpdatePost(Post post);
       public void DeletePostById(int id);
       public List<Post> GetAllPost();
       public Post GetPost(String s);

}
