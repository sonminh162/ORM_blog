package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name="blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String author;
    private String tag;
    private String content;

    public Blog(){}

    public Blog(String author,String tag,String content){
        this.author = author;
        this.tag = tag;
        this.content = content;
    }

    @Override
    public String toString(){
        return String.format("Customer[id=%d,author='%s',tag='%s',content='%s']",id,author,tag,content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
