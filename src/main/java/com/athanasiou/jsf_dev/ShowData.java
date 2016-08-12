/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.athanasiou.jsf_dev;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author costas
 */
@ManagedBean(name = "showData", eager = true)
@SessionScoped

public class ShowData implements Serializable {

    private static final long serialVersionUID = 1L;

    public String data = "1";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String showResult() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params
                = fc.getExternalContext().getRequestParameterMap();
        data = params.get("username");
        return "showData";
    }
    public void attributeListener(ActionEvent event){
      data = (String)event.getComponent().getAttributes().get("username");	
   }
}
