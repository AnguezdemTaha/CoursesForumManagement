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
public class Answer {
    private int answer_id;
    private String answer_content;
    private Date answer_date;
    private String answer_accepted;
    
    private Question answer__question;
    private User answer__user;
    

    public Answer() {
    }

    public Answer(int answer_id, String answer_content, Date answer_date, String answer_accepted, Question answer__question, User answer__user) {
        this.answer_id = answer_id;
        this.answer_content = answer_content;
        this.answer_date = answer_date;
        this.answer_accepted = answer_accepted;
        this.answer__question = answer__question;
        this.answer__user = answer__user;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer_content() {
        return answer_content;
    }

    public void setAnswer_content(String answer_content) {
        this.answer_content = answer_content;
    }

    public Date getAnswer_date() {
        return answer_date;
    }

    public void setAnswer_date(Date answer_date) {
        this.answer_date = answer_date;
    }

    public String getAnswer_accepted() {
        return answer_accepted;
    }

    public void setAnswer_accepted(String answer_accepted) {
        this.answer_accepted = answer_accepted;
    }

    public Question getAnswer__question() {
        return answer__question;
    }

    public void setAnswer__question(Question answer__question) {
        this.answer__question = answer__question;
    }

    public User getAnswer__user() {
        return answer__user;
    }

    public void setAnswer__user(User answer__user) {
        this.answer__user = answer__user;
    }

    

    
    
    
}
