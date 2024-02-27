public class Main {
    public static void main(String[] args) {
Store store=new Store();
        User user1=new User("lamia94","lamia@hotmail.com");
        User user2=new User("lama4","lama@hotmail.com");

  Book b1=new Book("java","michel","3435dzd",200,1);
  Book b2=new Book("1084","gorg","7890",70,2);
  Music m1=new Music("almaazem","abduljalel","13hf",50,"muhammed abdo" );
  Music m2=new Music("ham alsuhub","bder bin abdlmahsen","13hf",40,"muhammed abdo" );
  Movie movie1=new Movie("intterstelr","mechel","j32434",70,60);
  Movie movie2=new Movie("pray","mechel","jfgg4",60,120);
  store.addUser(user1);
  store.addUser(user2);
  store.addMedia(b1);
  store.addMedia(b2);
  store.addMedia(m1);
  store.addMedia(m2);
  store.addMedia(movie2);
  store.addMedia(movie1);
  user1.addToCart(b1);
  user2.addToCart(b2);
  Reviwe r1=new Reviwe("lamia",5,"amazing");
  b1.addReviwe(r1);
  store.displayMedia();
  System.out.println(b1.isBestseller());
  Book serch=store.serchBook("java");
  System.out.println(serch);




    }
}