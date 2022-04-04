interface audioPlayer{
    void play();
    void pause();
    void stop();
    void resume();
}
class MyMusic implements audioPlayer {
    public void play(){
        System.out.println("play:||");
    }
    public void pause(){
        System.out.println("pause:|>");
    }
    public void stop(){
        System.out.println("stop:|=|");
    }
    public void resume(){
        System.out.println("resume: >>>>>>");
    }
}
public class Question5 {
    public static void main(String[] args) {
        audioPlayer m = new MyMusic();
        System.out.println("Song: XYZ");
        m.play();
        m.pause();
    }
}