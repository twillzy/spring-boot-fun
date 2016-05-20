package com.h2demo.service;

import com.h2demo.H2demoApplication;
import com.h2demo.domain.Author;
import com.h2demo.domain.Post;
import com.h2demo.repository.AuthorRepository;
import com.h2demo.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class LoadDataService {

    private static final Logger logger = LoggerFactory.getLogger(H2demoApplication.class);

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public LoadDataService(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @PostConstruct
    public void loadData() {
        logger.info("Loading data begins..........");
        
        Author author = new Author("Will", "Tan");
        authorRepository.save(author);

        Post post = new Post("Title 1");
        post.setBody("Body 1");
        post.setPostedOn(new Date());
        post.setAuthor(author);
        postRepository.save(post);
    }
}
