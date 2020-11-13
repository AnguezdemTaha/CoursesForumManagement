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
public class Feedback {
    private int feedback_id;
    private String feedback_note;
    private Date feedback_date;
   
    
    private Course feedback_course;
    private User feedback_user;

    public Feedback() {
    }

    public Feedback(int feedback_id, String feedback_note, Date feedback_date, Course feedback_course, User feedback_user) {
        this.feedback_id = feedback_id;
        this.feedback_note = feedback_note;
        this.feedback_date = feedback_date;
        this.feedback_course = feedback_course;
        this.feedback_user = feedback_user;
    }

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getFeedback_note() {
        return feedback_note;
    }

    public void setFeedback_note(String feedback_note) {
        this.feedback_note = feedback_note;
    }

    public Date getFeedback_date() {
        return feedback_date;
    }

    public void setFeedback_date(Date feedback_date) {
        this.feedback_date = feedback_date;
    }

    public Course getFeedback_course() {
        return feedback_course;
    }

    public void setFeedback_course(Course feedback_course) {
        this.feedback_course = feedback_course;
    }

    public User getFeedback_user() {
        return feedback_user;
    }

    public void setFeedback_user(User feedback_user) {
        this.feedback_user = feedback_user;
    }

    
    

    
    
    
    
}
