public class Employe {

    public String name;
    public String surname;
    public PositionType position;

    public enum PositionType {
        MANAGER,
        SALES,
        WAREHOUS
    }

    public Employe(String name, String surname, PositionType position){

        this.name = name;
        this.surname = surname;
        this.position = position;
    }
}
