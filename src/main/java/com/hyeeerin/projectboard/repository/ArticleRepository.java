package com.hyeeerin.projectboard.repository;

import com.hyeeerin.projectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}