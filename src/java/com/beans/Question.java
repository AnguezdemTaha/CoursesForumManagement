/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.util.Date;

/**
 *
 * @author lm
 */
public class Question {
    private int question_id;
    private String question_content;
    private Date question_date;
    private String question_accepted;
    
    private Course question_course;
    private User question_user;

    public Question() {
    }

    public Question(int question_id, String question_content, Date question_date, String question_accepted, Course question_course, User question_user) {
        this.question_id = question_id;
        this.question_content = question_content;
        this.question_date = question_date;
        this.question_accepted = question_accepted;
        this.question_course = question_course;
        this.question_user = question_user;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_content() {
        return question_content;
    }

    public void setQuestion_content(String question_contenu) {
        this.question_content = question_contenu;
    }

    public Date getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(Date question_date) {
        this.question_date = question_date;
    }

    public String getQuestion_accepted() {
        return question_accepted;
    }

    public void setQuestion_accepted(String question_accepted) {
        this.question_accepted = question_accepted;
    }

    public Course getQuestion_course() {
        return question_course;
    }

    public void setQuestion_course(Course question_course) {
        this.question_course = question_course;
    }

    public User getQuestion_user() {
        return question_user;
    }

    public void setQuestion_user(User question_user) {
        this.question_user = question_user;
    }

    

    
    
    
    
}
