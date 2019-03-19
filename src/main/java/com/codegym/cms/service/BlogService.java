package com.codegym.cms.service;

import com.codegym.cms.model.Blog;

public interface BlogService {
    java.util.List<Blog> findAll();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);
}
