/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yourcompany.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 12-11-2008
 * 
 * XDoclet definition:
 * @struts.form name="StudentMasterForm"
 */
public class StudentMasterForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** phone property */
	private String phone;

	/** dor property */
	private String dor;

	/** studentlastname property */
	private String studentlastname;

	/** address property */
	private String address;

	/** studentfirstname property */
	private String studentfirstname;

	/** image property */
	private String image;

	/** dob property */
	private String dob;

	/** email property */
	private String email;

	/** studentid property */
	private int studentid;

	/** studentmiddlename property */
	private String studentmiddlename;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the phone.
	 * @return String
	 */
	public String getPhone() {
		return phone;
	}

	/** 
	 * Set the phone.
	 * @param phone The phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/** 
	 * Returns the dor.
	 * @return String
	 */
	public String getDor() {
		return dor;
	}

	/** 
	 * Set the dor.
	 * @param dor The dor to set
	 */
	public void setDor(String dor) {
		this.dor = dor;
	}

	/** 
	 * Returns the studentlastname.
	 * @return String
	 */
	public String getStudentlastname() {
		return studentlastname;
	}

	/** 
	 * Set the studentlastname.
	 * @param studentlastname The studentlastname to set
	 */
	public void setStudentlastname(String studentlastname) {
		this.studentlastname = studentlastname;
	}

	/** 
	 * Returns the address.
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/** 
	 * Set the address.
	 * @param address The address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/** 
	 * Returns the studentfirstname.
	 * @return String
	 */
	public String getStudentfirstname() {
		return studentfirstname;
	}

	/** 
	 * Set the studentfirstname.
	 * @param studentfirstname The studentfirstname to set
	 */
	public void setStudentfirstname(String studentfirstname) {
		this.studentfirstname = studentfirstname;
	}

	/** 
	 * Returns the image.
	 * @return String
	 */
	public String getImage() {
		return image;
	}

	/** 
	 * Set the image.
	 * @param image The image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/** 
	 * Returns the dob.
	 * @return String
	 */
	public String getDob() {
		return dob;
	}

	/** 
	 * Set the dob.
	 * @param dob The dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/** 
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/** 
	 * Set the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * Returns the studentid.
	 * @return int
	 */
	public int getStudentid() {
		return studentid;
	}

	/** 
	 * Set the studentid.
	 * @param studentid The studentid to set
	 */
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	/** 
	 * Returns the studentmiddlename.
	 * @return String
	 */
	public String getStudentmiddlename() {
		return studentmiddlename;
	}

	/** 
	 * Set the studentmiddlename.
	 * @param studentmiddlename The studentmiddlename to set
	 */
	public void setStudentmiddlename(String studentmiddlename) {
		this.studentmiddlename = studentmiddlename;
	}
}