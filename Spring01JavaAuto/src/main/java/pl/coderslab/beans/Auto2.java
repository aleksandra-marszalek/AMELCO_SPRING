package pl.coderslab.beans;


import org.springframework.stereotype.Component;

@Component
public class Auto2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Auto2() {
        name = "auto2";
    }
}
