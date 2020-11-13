
package com.beans;


public class Student extends User{
    
    private String student_year;
    private Branch student_branch;

    public Student(String student_year, Branch student_branch, String nom, String prenom, String telephone, String email, String password, String type, String accepted) {
        super(nom, prenom, telephone, email, password, type, accepted);
        this.student_year = student_year;
        this.student_branch = student_branch;
    }

    public Student(String student_year, Branch student_branch) {
        this.student_year = student_year;
        this.student_branch = student_branch;
    }

    public Student() {
    }

    public String getStudent_year() {
        return student_year;
    }

    public void setStudent_year(String student_year) {
        this.student_year = student_year;
    }

    public Branch getStudent_branch() {
        return student_branch;
    }

    public void setStudent_branch(Branch student_branch) {
        this.student_branch = student_branch;
    }

   
    
    
    
}
