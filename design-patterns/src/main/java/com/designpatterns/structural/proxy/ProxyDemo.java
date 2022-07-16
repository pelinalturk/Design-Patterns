package com.designpatterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        YoutubeService youtubeService = new YoutubeServiceImp();
        YoutubeService cachedYoutubeService = new CachedYoutubeService(youtubeService);
        cachedYoutubeService.getVideo("video url");
    }
}
