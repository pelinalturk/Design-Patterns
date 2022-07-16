package com.designpatterns.structural.facade;

public class Facade {
     class Video {
        String name;
        String codecType;

        public Video(String name){
            this.name = name;
            this.codecType = name.substring(name.indexOf(".") + 1);
        }
    }

    abstract class Codec {
        String type;
        abstract void decode(Video vide);
    }

     class Mp4Codec extends Codec {
        String type = "mp4";

        @Override
        void decode(Video vide) {
            System.out.println("Decoding Mp4");
        }
    }

     class VlcCodec extends Codec{
        String type = "vlc";

        @Override
        void decode(Video vide) {
            System.out.println("Decoding Vlc");
        }
    }

     class CodecFactory {
        Codec getCodec(String type){
            switch (type) {
                case "mp4" : return new Mp4Codec();
                case "vlc" : return new VlcCodec();
                default: throw new IllegalArgumentException();
            }
        }
    }

     class BitReader {
        Video convert(Video video, Codec codec){
            System.out.println("Converting video");
            codec.decode(video);
            return video;
        }
    }

     class AudioFixer {
        Video fix(Video video){
            System.out.println("Fixing audio");
            return video;
        }
    }

     class ConvertVideo {
        public void convertVideo(String fileName){
            Video video = new Video(fileName);
            CodecFactory codecFactory = new CodecFactory();
            Codec codec = codecFactory.getCodec(video.codecType);
            BitReader bitReader = new BitReader();
            Video convertVideo = bitReader.convert(video, codec);

            AudioFixer audioFixer = new AudioFixer();
            Video finalVideo = audioFixer.fix(convertVideo);
        }
    }
}
