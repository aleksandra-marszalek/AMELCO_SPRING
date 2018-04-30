package pl.coderslab.beans;

public class Customer {

//    id - atrybut ten powinien trzymać numer identyfikacyjny,
//    firstName - atrybut określający imię klienta,
//    lastName - atrybut określający nazwisko klienta,

    private int id;
    private String firstName;
    private String lastName;
    public String pseudonym;

    public Customer() {

    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
