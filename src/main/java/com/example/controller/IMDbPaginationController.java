package com.example.controller;

import com.example.model.Imdbs;
import com.example.repository.ImdbsRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class IMDbPaginationController {
    public static final Logger logger = (Logger) LoggerFactory.getLogger(IMDbPaginationController.class);

    @Autowired
    private ImdbsRepo imdbsRepo;

    @GetMapping(value = "/imdb")
    public Page<Imdbs> findAll(@RequestParam int page, @RequestParam int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return imdbsRepo.findAll(pageRequest);
    }
}
