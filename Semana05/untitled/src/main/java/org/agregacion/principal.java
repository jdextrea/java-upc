package org.agregacion;

import java.util.ArrayList;
import java.util.List;
public class principal {
    public static void main(String args[]) {
        //Crear los estudiantes
        Student s1 = new Student("Jose",1,"INF");
        Student s2 = new Student("Maria",2,"INF");
        Student s3 = new Student("Melissa",1,"IND");
        Student s4 = new Student("Adela",2,"IND");
        //Creamos la lista de estudiantes de INF.
        List<Student> inf_students = new ArrayList<Student>();
        inf_students.add(s1);
        inf_students.add(s2);
        //Creamos la lista de estudiantes de IND.
        List<Student> ind_students = new ArrayList<Student>();
        ind_students.add(s3);
        ind_students.add(s4);
        //Crear los departamentos
        Department inf = new Department("INF",inf_students);
        Department ind = new Department("IND",ind_students);

        List<Department> departments = new ArrayList<Department>();
        departments.add(inf);
        departments.add(ind);

        Institute institute = new Institute("Cibertec",departments);
        System.out.println(institute.getTotalStudiantesEnInstituto());
    }
}
