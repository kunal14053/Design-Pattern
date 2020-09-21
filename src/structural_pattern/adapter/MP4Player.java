package structural_pattern.adapter;

public class MP4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Wrong Selection");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
