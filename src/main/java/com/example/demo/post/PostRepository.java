package com.example.demo.post;

import java.util.*;

public class PostRepository {
    List<Post> posts;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1,"title", "hello java world1", "honggildong1"));
        this.posts.add(new Post(2,"title", "hello java world2", "honggildong2"));
        this.posts.add(new Post(3,"title", "hello java world3", "honggildong3"));
        this.posts.add(new Post(4,"title", "hello java world4", "honggildong4"));
    }
    List<Post> findAll(){
        return this.posts;
    }
}