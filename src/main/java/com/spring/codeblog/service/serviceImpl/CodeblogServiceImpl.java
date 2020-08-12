package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import com.spring.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    CodeBlogRepository codeBlogRepository;

    @Autowired
    public CodeblogServiceImpl(CodeBlogRepository codeBlogRepository) {
        this.codeBlogRepository = codeBlogRepository;
    }

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).orElseThrow();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
}
