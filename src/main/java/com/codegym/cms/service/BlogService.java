package com.codegym.cms.service;

import com.codegym.cms.model.Blog;
import com.codegym.cms.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository BlogRepository;

    @Override
    public List<Blog> findAll() {
        return BlogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return BlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        BlogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        BlogRepository.remove(id);
    }
}