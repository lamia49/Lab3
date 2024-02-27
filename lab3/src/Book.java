import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Media {
    private int stock;
    private ArrayList<Reviwe>reviwe=new ArrayList<>();

    public Book(String title, String autuer, String ISBN, int price, int stock) {
        super(title, autuer, ISBN, price);
        this.stock = stock;
        this.reviwe = reviwe;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public ArrayList<Reviwe> getReviwe() {
        return reviwe;
    }

    public void setReviwe(ArrayList<Reviwe> reviwe) {
        this.reviwe = reviwe;
    }

    public void addReviwe(Reviwe r){

        reviwe.add(r);
    }

    public double avarRating(){
        int count=0;
        int temp=0;
       for(  Reviwe r: reviwe){
           temp+=r.getRating();
       }

       double ava=temp/reviwe.size();
        return ava;
    }

    public void Purches(User user){

        if(getStock()>0) {
            this.stock--;
            user.getShoppingcart().add(this);
        }else{
        System.out.println("the stock is empty");}
    }
    public boolean isBestseller() {
        return avarRating()>=4.5;

    }


    public void restock(int quantity){
    this.stock+=quantity;
    }

    @Override
    public String mediaType() {
        if(avarRating()>=4.5)
        return "bestsaller";
        else
            return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviwe=" + reviwe +
                "} " + super.toString();
    }
}
