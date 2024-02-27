import java.util.ArrayList;

public class Noval extends Book{

    private String gener;

    public Noval(String title, String autuer, String ISBN, int price, int stock, String gener) {
        super(title, autuer, ISBN, price, stock);
        this.gener = gener;
    }

    @Override
    public String mediaType() {
        if(avarRating()>=4.5)
            return "bestNoval";
        else
            return "Noval";
    }

    @Override
    public String toString() {
        return "Noval{" +
                "gener='" + gener + '\'' +
                "} " + super.toString();
    }
}
