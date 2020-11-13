/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lm
 */
public class Course {
    
    private int course_id ;
    //int id_prof ;
    //int id_module ;
    private String  course_name;
    private String cours_content ;//fichier
    private Date course_date ;
    private String course_file;
    
    private Teacher course_teacher;
    private ArrayList<Module> Course_modules;//exm php cours is studyed by 2 classes soo its for 2 modles different

    public Course(int course_id, String course_name, String cours_content, Date course_date, String course_file, Teacher course_teacher, ArrayList<Module> Course_modules) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.cours_content = cours_content;
        this.course_date = course_date;
        this.course_file = course_file;
        this.course_teacher = course_teacher;
        this.Course_modules = Course_modules;
    }

    

    
    public Course() {
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCours_content() {
        return cours_content;
    }

    public void setCours_content(String cours_content) {
        this.cours_content = cours_content;
    }

    public Date getCourse_date() {
        return course_date;
    }

    public void setCourse_date(Date course_date) {
        this.course_date = course_date;
    }

    public String getCourse_file() {
        return course_file;
    }

    public void setCourse_file(String course_file) {
        this.course_file = course_file;
    }

    public Teacher getCourse_teacher() {
        return course_teacher;
    }

    public void setCourse_teacher(Teacher course_teacher) {
        this.course_teacher = course_teacher;
    }

    public ArrayList<Module> getCourse_modules() {
        return Course_modules;
    }

    public void setCourse_modules(ArrayList<Module> Course_modules) {
        this.Course_modules = Course_modules;
    }

    

    
    
    
    
    

    
    
    
    
    
}
