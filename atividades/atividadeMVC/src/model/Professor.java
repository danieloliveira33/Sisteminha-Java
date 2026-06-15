package model;

public class Professor {

    private String name;
    private String registration;

    public Professor(String name, String registration) {
        this.name = name;
        this.registration = registration;
    }
    public String getName() { return name; }
    public String getRegistration() { return registration; }

}
