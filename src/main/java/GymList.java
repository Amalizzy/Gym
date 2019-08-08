import java.util.ArrayList;

public class GymList {

    private ArrayList<Member> members;

    public GymList(){

        this.members = new ArrayList<Member>();
    }

    public void addMember(Member newMember){

        members.add(newMember);

    }


    public ArrayList<Member> getMembers(){

        return members;

//        for (Member member: members) {
//
//            System.out.println(member.getData());
//        }
    }

    public ArrayList<Member> getMembersOfAge(){

        ArrayList<Member> membersOfAge = new ArrayList<Member>();


        for (Member member: members) {
            if(member.IsOfAge()){

                membersOfAge.add(member);

            }

        }

        return membersOfAge;
    }





}
