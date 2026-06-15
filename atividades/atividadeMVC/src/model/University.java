package model;

public class University {

    private String name;

    public University(String name) {
        this.name = name;
    }

    // Transforma uma Person em um Student matriculado
    public Student enrollStudent(Person person, Course course) {
        Student student = new Student();
        student.setId(person.getId()); // Herda ID e atributos base
        student.setName(person.getName());
        student.setAge(person.getAge());

        // Geração de matrícula Hogwarts
        student.setEnrollmentNumber("HOG-" + (1000 + (int)(Math.random() * 9000)));
        student.setCourse(course);

        System.out.println(this.name + " System: The Sorting Hat has placed " + person.getName() + " in " + course.getName() + "!");
        return student;
    }

}
