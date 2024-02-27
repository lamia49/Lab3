import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<User>userList = new ArrayList<>();
    private ArrayList<Media>mediaList=new ArrayList<>();

    public Store() {
        this.userList = userList;
        this.mediaList = mediaList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(ArrayList<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public void addUser(User user){

        userList.add(user);
    }
    public void addMedia(Media media){

        mediaList.add(media);
    }

    public void displayUsers(){
        for(User user:userList){
            System.out.println(user);
        }
    }

    public void displayMedia(){
        for(Media media:mediaList){
            System.out.println(media);
        }
    }

    public Book serchBook(String title){
        for(Media media: mediaList){
            if(media.getTitle().equals(title)){
                return (Book) media;
            }
        }
        return null;
    }
}
