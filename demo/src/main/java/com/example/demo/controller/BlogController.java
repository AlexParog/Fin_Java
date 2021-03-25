package com.example.demo.controller;

import com.example.demo.model.Blog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {

    private List<Blog> data;

    @GetMapping("/get/{id}")
    public ResponseEntity<Blog> get(@PathVariable Long id) {
        try {
            for (Blog i : this.data) {
                Long ID = i.getId();
                if (ID.equals(id)) {
                    return new ResponseEntity<>(i, HttpStatus.OK);
                }
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/post")
    ResponseEntity<Boolean> createNewsForBlog(@RequestParam Long id, @RequestParam String name, @RequestParam String text,
                                              @RequestParam LocalDate dateOfCreation, @RequestParam LocalDate expirationDate,
                                              @RequestParam String tag, @RequestParam String author) {
        try {
            this.data.add(new Blog(id, name, text, dateOfCreation, expirationDate, tag, author));
            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }

    @PutMapping("/put")
    ResponseEntity<Boolean> putNewsForBlog(@RequestParam Long id, @RequestParam String name, @RequestParam String text,
                                           @RequestParam LocalDate dateOfCreation, @RequestParam LocalDate expirationDate,
                                           @RequestParam String tag, @RequestParam String author) {
        try {
            int index = -1;
            for (Blog news : this.data) {
                Long ID = news.getId();
                if (ID.equals(id)) {
                    index = data.indexOf(news);
                }
            }

            if (index != -1) {
                data.remove(index);
                data.add(new Blog(id, name, text, dateOfCreation, expirationDate, tag, author));
                return new ResponseEntity<>(true, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
