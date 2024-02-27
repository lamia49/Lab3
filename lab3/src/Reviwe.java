public class Reviwe {
private String useName;
private int rating;
private String comment;

    public Reviwe(String useName, int rating, String comment) {
        this.useName = useName;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Reviwe{" +
                "useName='" + useName + '\'' +
                ", rating='" + rating + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
