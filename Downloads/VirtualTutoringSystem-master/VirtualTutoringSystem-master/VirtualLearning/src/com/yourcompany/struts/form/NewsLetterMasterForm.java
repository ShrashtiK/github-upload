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
 * @struts.form name="newsLetterMasterForm"
 */
public class NewsLetterMasterForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** facultyId property */
	private int facultyId;
private String FacultyName;
	/** letterUploadedFile property */
	private String letterUploadedFile;

	/** newsLetterId property */
	private int newsLetterId;

	/** newsdate property */
	private String newsdate;

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
	 * Returns the facultyId.
	 * @return int
	 */
	public int getFacultyId() {
		return facultyId;
	}

	/** 
	 * Set the facultyId.
	 * @param facultyId The facultyId to set
	 */
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	/** 
	 * Returns the letterUploadedFile.
	 * @return String
	 */
	public String getLetterUploadedFile() {
		return letterUploadedFile;
	}

	/** 
	 * Set the letterUploadedFile.
	 * @param letterUploadedFile The letterUploadedFile to set
	 */
	public void setLetterUploadedFile(String letterUploadedFile) {
		this.letterUploadedFile = letterUploadedFile;
	}

	/** 
	 * Returns the newsLetterId.
	 * @return int
	 */
	public int getNewsLetterId() {
		return newsLetterId;
	}

	/** 
	 * Set the newsLetterId.
	 * @param newsLetterId The newsLetterId to set
	 */
	public void setNewsLetterId(int newsLetterId) {
		this.newsLetterId = newsLetterId;
	}

	/** 
	 * Returns the newsdate.
	 * @return String
	 */
	public String getNewsdate() {
		return newsdate;
	}

	/** 
	 * Set the newsdate.
	 * @param newsdate The newsdate to set
	 */
	public void setNewsdate(String newsdate) {
		this.newsdate = newsdate;
	}

	public String getFacultyName() {
		return FacultyName;
	}

	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}
}