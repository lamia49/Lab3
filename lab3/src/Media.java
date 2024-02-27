public class Media {
    private String title;
    private String autuer;
    private String ISBN;
    private int price;

    public Media(String title, String autuer, String ISBN, int price) {
        this.title = title;
        this.autuer = autuer;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String mediaType(){

     return "Media";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutuer() {
        return autuer;
    }

    public void setAutuer(String autuer) {
        this.autuer = autuer;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                ", autuer='" + autuer + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
