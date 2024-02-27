import java.util.List;

public class Movie extends Media{
    private int duration;

    public Movie(String title, String autuer, String ISBN, int price, int duration) {
        super(title, autuer, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

public void watch(User user){
        user.getShoppingcart().add(this);
}

public void RecommendSimller(List<Movie> moviercatalog){
        for(Movie movie:moviercatalog){
            if(movie.getAutuer().equals(this.getAutuer())){
                System.out.println("this movie is simller "+movie.getTitle());
            }
        }}
    @Override
    public String mediaType() {
        if(duration>=120) {
            return "long Movie";
        }else{
            return "Movie";
            }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}
