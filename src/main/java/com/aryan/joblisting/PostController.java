package com.aryan.joblisting;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepo srepo;

    @RequestMapping(value= "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/");
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }

    @GetMapping("/allPosts/{text}")
    public List<Post>search(@PathVariable String text){
        return srepo.findByText(text);
    }


    @PostMapping("/postJob")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }


}
