/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.athanasiou.jsf_dev;


/**
 *
 * @author costas
 */
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userDataListbox", eager = true)
@SessionScoped
public class UserDataListbox implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String data = "1";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}