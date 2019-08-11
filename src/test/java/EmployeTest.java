import org.testng.annotations.Test;

public class EmployeTest {


    @Test
    public void testAddEmploye(){

        Store store = new Store();

        Employe pero = new Employe("Pero", "Peric", Employe.PositionType.MANAGER );
        store.addEmploye(pero);

        Employe marko = new Employe("Marko", "Markovic", Employe.PositionType.SALES );
        store.addEmploye(marko);

        Employe jovan = new Employe("Jovan", "Jovanovic", Employe.PositionType.WAREHOUS );
        store.addEmploye(jovan);
    }
}
