package com.kakao.cafe.domain;

import com.kakao.cafe.controller.ArticleDto;

public class Article {

    private int id;
    private final String writer;
    private final String title;
    private final String contents;

    public Article(ArticleDto form) {
        writer = form.getWriter();
        title = form.getTitle();
        contents = form.getContents();
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
