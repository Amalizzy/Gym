import java.util.ArrayList;

public class App {

    public static void main(String [ ] args){

        GymList gymList = new GymList();

        Member pero = new Member("Pero", "Peric", 1985);
        gymList.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 1982);
        gymList.addMember(marko);

        ArrayList<Member> members = gymList.getMembers();

        for (Member member: members) {

            System.out.println(member.getData());


        }






    }






}
