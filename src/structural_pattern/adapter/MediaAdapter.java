package structural_pattern.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer=null;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc"))
            advanceMediaPlayer=new VLCPlayer();
        if(audioType.equalsIgnoreCase("mp4"))
            advanceMediaPlayer=new MP4Player();

    }

    @Override
    public void play(String audioType, String fileName) {
        if(advanceMediaPlayer==null){
            System.out.println("We don't support this feature right now");
        }else if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else{
            advanceMediaPlayer.playMp4(fileName);
        }

    }
}
