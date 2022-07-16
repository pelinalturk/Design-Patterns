package com.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedYoutubeService implements YoutubeService{

    private final YoutubeService youtubeService;

    public CachedYoutubeService(YoutubeService youtubeService) {
        this.youtubeService = youtubeService;
    }

    @Override
    public Video getVideo(String url) {
        Map<String, Video> cache = new HashMap<>();
        if(cache.containsKey( url)){
            return cache.get(url);
        }
        Video video = youtubeService.getVideo(url);
        cache.put(url, video);
        System.out.println(url);
        return video;
    }
}
