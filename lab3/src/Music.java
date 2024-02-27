import org.w3c.dom.stylesheets.MediaList;

import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;


    public Music(String title, String autuer, String ISBN, int price, String artist) {
        super(title, autuer, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void lisnt(User user){
        user.getShoppingcart().add(this);

    }

    public  ArrayList<Music>playlist(){
        for(Music music:playlist()){
            if (music.equals(this.getArtist())){
                System.out.println("this song is similir. ");
            }
        }
        return playlist();
    }



    @Override
    public String mediaType() {
        if (getPrice() >= 10) {
            return "Music Premium";
        }else{
            return "Music";}
        }
    }