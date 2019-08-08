import java.util.Calendar;

public class Member {

    public String name;
    public String surname;
    public int birthYear;


    public Member(String name, String surname, int birthYear){

        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String getData(){

        return  name +  " " + surname + " " + birthYear;
    }

    public boolean IsOfAge(){

        int year = Calendar.getInstance().get(Calendar.YEAR);

        if(year-birthYear>18){

            return true;
        }else{

            return false;
        }


    }

}
