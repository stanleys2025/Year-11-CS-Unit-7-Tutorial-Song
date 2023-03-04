import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList();

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }



    public int howMany(ArrayList<String> users){
        int newListeners = 0;
        users.replaceAll(String::toLowerCase);
        for(String user : users){
            if(!listeners.contains(user)){
                newListeners++;
                listeners.add(user);
            }
        }
        return newListeners;
    }



}
