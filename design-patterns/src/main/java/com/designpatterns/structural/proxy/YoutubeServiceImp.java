package com.designpatterns.structural.proxy;

public class YoutubeServiceImp implements YoutubeService{

    @Override
    public Video getVideo(String url) {
        return new Video();
    }
}
