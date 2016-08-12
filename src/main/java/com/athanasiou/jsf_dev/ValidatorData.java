/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.athanasiou.jsf_dev;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author costas
 */

@ManagedBean(name = "validatorData", eager = true)
@SessionScoped
public class ValidatorData implements Serializable {

   private static final long serialVersionUID = 1L;

   private String name;
  
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }  
   private int age;
  
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }  
   private double salary;
 
   public double getSalary() {
      return salary;
   }
   public void setSalary(double salary) {
      this.salary = salary;
   }
   
   private String password;
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }  
}
