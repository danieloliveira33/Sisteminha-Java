package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private String name;
    // Relação de Composição: O Curso contém suas Disciplinas
    private List<Subject> subjects;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public List<Subject> getSubjects() { return subjects; }

}
