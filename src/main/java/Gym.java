public class Gym {

    private Member[] members;

    private int numberOfAddedMembers = 0;

    public Gym(int numberOfMembers){

        this.members = new Member[numberOfMembers];
    }

    public void addMember(Member newMember){

        numberOfAddedMembers++;
        members[numberOfAddedMembers-1] = newMember;
    }

    public void printMembers(){

        for(int i=0; i<members.length; i++){

            if(members[i] != null) {

                System.out.println(members[i].name + " " + members[i].surname + " " + members[i].birthYear);

            }
        }
    }

    public void printMembersOfAge(){


    }



}
