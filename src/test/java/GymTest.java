import org.junit.Test;

public class GymTest {

    @Test
    public void testAddAndPrintMembers(){

        Gym gym = new Gym(10);

        Member pero = new Member("Pero", "Peric", 1985);
        gym.addMember(pero);

        Member marko = new Member("Marko", "Markovic", 1982);
        gym.addMember(marko);

        gym.printMembers();

    }



}
