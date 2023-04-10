package org.agregacion;

import java.util.List;

public class Institute {
    private String nameInstitute;
    private List<Department> departments;

    public Institute(String nameInstitute, List<org.agregacion.Department> departments) {
        this.nameInstitute = nameInstitute;
        this.departments = departments;
    }

    public int getTotalStudiantesEnInstituto() {
        int nroEstudiantes = 0;
        List<Student> students;
        for (Department dept : departments) {
            students = dept.getStudent();
            for (Student s: students) {
                nroEstudiantes++;
            }
        }
        return nroEstudiantes;
    }

}
