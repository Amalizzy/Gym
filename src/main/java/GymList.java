import java.util.ArrayList;
import java.util.List;

public class GymList {

    private ArrayList<Member> members;

    private ArrayList<Equipment> equipments;



    public GymList(){

        this.members = new ArrayList<Member>();
        this.equipments = new ArrayList<Equipment>();
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

    public List<Member> getMembersOfAge(){

        List<Member> membersOfAge = new ArrayList<Member>();


        for (Member member: members) {
            if(member.IsOfAge()){

                membersOfAge.add(member);

            }

        }

        return membersOfAge;
    }

    public void addEquipment(Equipment newEquipment){

        equipments.add(newEquipment);
    }

    public int summariseEquipment() {

        int summary = 0;

        for (Equipment equipment : equipments) {

            summary = summary + equipment.price;
        }

        return summary;
    }



}
