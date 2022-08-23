package org.example;


//Step 1 : Added Dependency
//Step 2: Created this class for BEAN where we introduced setter methods for setter injection
//Step 3: Created xml based configuration file config.xml where we created bean and inject setter
//Step 4: Pull Object by bean from main method
//Resource: https://learncodewithdurgesh.com/course/spring-framework-tutorial-learn-code-with-durgesh/184/

import org.springframework.stereotype.Component;

//------------ This is BEAN Class--------------
@Component
public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
