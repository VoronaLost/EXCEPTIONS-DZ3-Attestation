package dz3;

public class Record {
    private String family;
    private String name;
    private String surname;
    private String birthday;
    private int number;
    private char sex;

    public Record(String family, String name, String surname, String birthday, int number, char sex){
        this.family = family;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.number = number;
        this.sex = sex;
    }

    public String getFamily() {
        return this.family;
    }

    public String toString() {
        return String.format("%s %s %s %s %d %s", this.family, this.name, this.surname, this.birthday, this.number, this.sex);
    }
}
