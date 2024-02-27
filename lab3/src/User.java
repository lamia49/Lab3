import java.util.ArrayList;

public class User {
    private String UserName;
    private String Email;
    private ArrayList<Media>madiaList=new ArrayList<Media>();
    private ArrayList<Media>shoppingcart=new ArrayList<Media>();


//    private List<Media> purchased;
//    private List<Media> shoppingCart;

    public User(String userName, String email) {
        UserName = userName;
        Email = email;

    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ArrayList<Media> getMadiaList() {
        return madiaList;
    }

    public void setMadiaList() {
        this.madiaList = madiaList;
    }

    public ArrayList<Media> getShoppingcart() {
        return shoppingcart;
    }

    public void setShoppingcart(ArrayList<Media> shoppingcart) {
        this.shoppingcart = shoppingcart;
    }

    public void addToCart(Media media){
        this.shoppingcart.add(media);
    }

    public void removeFromCart(Media media){
        shoppingcart.remove(media);
    }

    public void checkout(){
        for(Media media:shoppingcart){
            if (media instanceof Book) {
                Book book = (Book) media;
                if (book.getStock() > 0) {
                    book.Purches(this);
                    madiaList.add(book);
                } else {
                    System.out.println("out of stock");
                }
            } else {
                madiaList.add(media);
            }
        }
        shoppingcart.clear();
        }




    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", Email='" + Email + '\'' +
                ", madiaList=" + madiaList +
                ", shoppingcart=" + shoppingcart +
                '}';
    }

}
