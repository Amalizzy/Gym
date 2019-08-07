import java.util.Calendar;

public class GymArray {

    private Member[] members;

    private int numberOfAddedMembers = 0;

    public GymArray(int numberOfMembers) {

        this.members = new Member[numberOfMembers];
    }

    public void addMember(Member newMember) {

        numberOfAddedMembers++;
        members[numberOfAddedMembers - 1] = newMember;
    }

    public void printMembers() {

        for (int i = 0; i < members.length; i++) {

            if (members[i] != null) {

                System.out.println(members[i].getData());

            }
        }
    }

    public void printMembersOfAge() {

        int year = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < members.length; i++) {
            if(members[i] != null) {

                if (year - members[i].birthYear > 18) {

                    System.out.println(members[i].getData());

                }
            }
        }



    }




}

