/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author opiskun
 */
@Controller("calcmethod")
@Scope("session")
public class CalcMethodController implements Serializable{

    private List<String> methods = new ArrayList<String>(0) {
        {
            add("hello1");
            add("hello2");
            add("hello3");
        }
    };
    private String method = new String();

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String addMethod(String method1) {
        System.out.println("added  = " + method1);
        methods.add(method);
        return null;
    }

    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }
    
}
