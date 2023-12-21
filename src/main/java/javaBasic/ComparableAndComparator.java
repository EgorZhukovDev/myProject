package javaBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Tom", "Alchemy");
        Student student2 = new Student(2,"Olga", "Mathematics");
        Student student3 = new Student(3,"Bob", "Physic");

        List<Student> students = Arrays.asList(student1, student2, student3);
        System.out.println("стандартный вывод List " + students);

        Collections.sort(students);
        System.out.println("Collections.sort вывод List " + students);

        Collections.sort(students,new StudentDeptComparator());
// печатаем список, отсортированный по кафедрам студентов
        System.out.println("отсортированный по кафедрам " + students);

        Collections.sort(students,new StudentNameComparator());
// печатаем список, отсортированный по именам студентов
        System.out.println("отсортированный по именам " + students);

// сортируем список по имени и названию кафедры
        Collections.sort(students,new StudentNameComparator().thenComparing(new StudentDeptComparator()));
        System.out.println("отсортированный по именам и названию кафедры" + students);
    }
}

class Student implements Comparable<Student>{

    private Integer id;
    private String name;
    private String department;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Student(Integer id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
class StudentDeptComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getDepartment().compareTo(s2.getDepartment());
    }
}

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
