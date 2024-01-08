package com.example.demo.post;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
@Controller
@CrossOrigin("*")
public class PostContorller {
    private PostService postService;
    PostContorller(){
        this.postService = new PostService();
    }
    @GetMapping("/csr/json")
    @ResponseBody
    public List<Post> findAll(){
        return postService.findAll();
    }
    // 사용자에게 화면(+data) return
    @GetMapping("/ssr")
    public String findAllSsr(Model model){// model이 key이고 posts가 vlaue임
        List<Post> posts = postService.findAll(); //DB에서 조회한 post
        model.addAttribute("posts", posts); //왼쪽 데이터를 우측 posts에 담는거
        return "post_list"; //화면 지칭
    }
}