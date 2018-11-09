package application;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Sound {

    public static final Sound[] sounds = {
        new Sound("eagle.mp3")
    };

    MediaPlayer mediaPlayer;

    private Sound(String name) {
    	name = "sounds\\" + name;
    	Media sound = new Media(new File(name).toURI().toString());
    	mediaPlayer = new MediaPlayer(sound);

    }

    public void play() {
        new Thread() {
            public void run() {
                mediaPlayer.play();
            }
        }.start();
    }

}