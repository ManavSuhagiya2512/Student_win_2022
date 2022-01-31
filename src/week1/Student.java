/*
 Date: 1/31/2022
 Comment: This is comment
 Merge 1
 */
package week1;

/**
 *
 * @author manav
 */
public class Student {

    private String studentId;
    private String studentName;
    private String Address;

    public Student(String studentId, String studentName,String Address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.Address=Address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

}
