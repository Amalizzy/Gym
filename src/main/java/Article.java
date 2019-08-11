import java.util.Calendar;
import java.util.Date;

public class Article {

    public String name;
    public int price;
    public Date expiryDate;


    public Article(String name, int price, Date expiryDate){

        this.name = name;

        this.price = price;

        this.expiryDate = expiryDate;
    }

    public boolean isExpired(){

        Date today = Calendar.getInstance().getTime();

       return expiryDate.after(today);

    }
}
