import java.util.ArrayList;

public class AcadmicBook extends Book{

    private String subject;


    public AcadmicBook(String title, String autuer, String ISBN, int price, int stock) {
        super(title, autuer, ISBN, price, stock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String mediaType() {
        if(avarRating()>=4.5)
            return "bestacadmicbook";
        else
            return "acadmicbook";
    }

    @Override
    public String toString() {
        return "AcadmicBook{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
