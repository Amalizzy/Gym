import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

    public String getSubstringForLastTwoCharachters(String string){
        int number = 2;
        return string.substring(string.length()-number, string.length());

    }

    public String getSubstringForProvidedNumber(String string, int number){

        return string.substring(string.length()-number,string.length() );
    }


    public Date increaseDate(Date currentDate, int numberOfDays){

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.println(dateFormat.format(currentDate));

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        // manipulate date

        c.add(Calendar.DATE, numberOfDays); //same with c.add(Calendar.DAY_OF_MONTH, 1);

        // convert calendar to date
        Date currentDatePlusOne = c.getTime();

        System.out.println(dateFormat.format(currentDatePlusOne));

        return currentDatePlusOne;


    }



}
