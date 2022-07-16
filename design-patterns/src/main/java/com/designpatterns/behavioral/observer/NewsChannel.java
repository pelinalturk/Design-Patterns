package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Channel{
    private List<String>newsList = new ArrayList<>();

    @Override
    public void update(String news) {
        newsList.add(news);
    }

    @Override
    public void printNews() {
        for(String news : newsList){
            System.out.println(news);
        }
    }
}
