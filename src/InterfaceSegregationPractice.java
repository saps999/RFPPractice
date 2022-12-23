interface Mp3Player {
    void mp3();
}

interface VideoPlayer {
    void video();
}

interface MultiMedia extends Mp3Player, VideoPlayer {
}

class Mp3 implements Mp3Player {

    @Override
    public void mp3() {
        System.out.println("Playing Songs....");
    }
}

class Video implements VideoPlayer {

    @Override
    public void video() {
        System.out.println("Playing Videos....");
    }
}

class MultiMediaPlay implements MultiMedia {
    private Mp3Player playingMp3;
    private VideoPlayer playingVideo;

    public MultiMediaPlay(Mp3Player playingMp3, VideoPlayer playingVideo) {
        this.playingMp3 = playingMp3;
        this.playingVideo = playingVideo;
    }

    @Override
    public void mp3() {
        playingMp3.mp3();
        // System.out.println("Playing Songs in Multimedia....");
    }

    @Override
    public void video() {
        playingVideo.video();
        //System.out.println("Playing Videos in Multimedia....");
    }
}

public class InterfaceSegregationPractice {
    public static void main(String[] args) {
//        System.out.println("Mp3 player running....");
//        Mp3 mp3 =new Mp3();
//        mp3.mp3();
//
//        System.out.println("\nVideo player running....");
//        Video video =new Video();
//        video.video();

        System.out.println("\nMultiMedia player running....");
        MultiMediaPlay multiMediaPlay = new MultiMediaPlay(new Mp3(), new Video());
        multiMediaPlay.mp3();
        multiMediaPlay.video();
    }
}
