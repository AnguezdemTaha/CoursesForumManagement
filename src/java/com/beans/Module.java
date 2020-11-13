/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author lm
 */
public class Module {
    private int module_id;
    private String module_name ;
    private String module_year ;
    private Branch module_branch ;

    public Module() {
    }

    public Module(int module_id, String module_name, String module_year, Branch module_branch) {
        this.module_id = module_id;
        this.module_name = module_name;
        this.module_year = module_year;
        this.module_branch = module_branch;
    }

    public int getModule_id() {
        return module_id;
    }

    public void setModule_id(int module_id) {
        this.module_id = module_id;
    }
    
    
    

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getModule_year() {
        return module_year;
    }

    public void setModule_year(String module_year) {
        this.module_year = module_year;
    }

    public Branch getModule_branch() {
        return module_branch;
    }

    public void setModule_branch(Branch module_branch) {
        this.module_branch = module_branch;
    }

    
    
}
