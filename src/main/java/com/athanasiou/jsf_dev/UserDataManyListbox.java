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
@ManagedBean(name = "userDataManyListbox", eager = true)
@SessionScoped
public class UserDataManyListbox implements Serializable {

   private static final long serialVersionUID = 1L;

   public String[] data = {"1","2","3"};

   public String[] getData() {
      return data;
   }

   public void setData(String[] data) {
      this.data = data;
   }
}