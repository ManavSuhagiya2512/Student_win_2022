/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author manav
 */
public class Studentlist {

    public static void main(String[] args) {
        Student[] studentList = new Student[4];
        studentList[0] = new Student("1", "Manav Suhagiya");
        studentList[1] = new Student("2", "John Doe");
        studentList[2] = new Student("3", "abc");

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getStudentName());
            System.out.println(studentList[i].getStudentId());
        }
    }
}
