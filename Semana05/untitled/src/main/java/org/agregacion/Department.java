package org.agregacion;

import java.util.List;

public class Department {

    private String nameDpto;
    private List<Student> Student;
    public Department(String nameDpto, List<org.agregacion.Student> student) {
        this.nameDpto = nameDpto;
        Student = student;
    }

    public List<org.agregacion.Student> getStudent() {
        return Student;
    }

}
