package edu.miu.restclientdemo.model;

import lombok.Data;

@Data
public class Review {
    private String title;
    private String comment;
    private int rating;

}
