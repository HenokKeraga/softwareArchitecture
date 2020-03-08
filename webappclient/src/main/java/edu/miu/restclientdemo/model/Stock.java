package edu.miu.restclientdemo.model;

import lombok.Data;


@Data
public class Stock {

    private Integer stockId;
    private Integer amount;
    private String location;

}
