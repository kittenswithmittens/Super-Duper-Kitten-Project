/**
 * Sound Class
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;


import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Sound {

    /**
     * sound list
     */
    public static final Sound[] sounds = {
        new Sound("Sad-cat.mp3"), new Sound("KittensinMittens.mp3")
    };

    /**
     * mediaPlayer
     */
    MediaPlayer mediaPlayer;

    /**
     * sound constructor
     * @param name
     */
    private Sound(String name) {
    	name = "src\\application\\sound\\" + name;
    	Media sound = new Media(new File(name).toURI().toString());
    	mediaPlayer = new MediaPlayer(sound);

    }

    /**
     * play sound function
     */
    public void play() {
        new Thread() {
            public void run() {
            	mediaPlayer.setVolume(.025); //volume set
                mediaPlayer.play();
            }
        }.start();
    }

}