package controller;

import dao.StudentDAO;
import model.Student;
import model.Course;
import java.util.List;

    public class StudentController {
        private StudentDAO dao;

        public StudentController() {
            dao = new StudentDAO();
        }

        public void createStudent(Student student) {
            dao.insert(student);
        }

        public List<Student> getAllStudents() {
            return dao.listAll();
        }

        public void updateStudent(int id, String name, int age) {
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            dao.update(s);
        }

        public void deleteStudent(int id) {
            dao.delete(id);
        }
    }
