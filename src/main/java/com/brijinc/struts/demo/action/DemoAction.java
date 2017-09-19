package com.brijinc.struts.demo.action;

import com.brijinc.struts.demo.model.DemoUser;
import com.opensymphony.xwork2.ActionSupport;

/**
 * This is a Struts 2 based controller. This class intercepts the incoming
 * request and display a welcome message to the user.
 * 
 * @author Raj Khanna, BRIJ INc
 * @since 01-SEP-2017
 * @version 1.0
 *
 */
public class DemoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * The model class that stores the message to display in the view.
	 */
	private DemoUser userInfo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	/**
	 * 
	 */
	public String execute() {
		this.userInfo = new DemoUser();

		return SUCCESS;
	}

	public DemoUser getUserInfo() {
		return this.userInfo;
	}

}
