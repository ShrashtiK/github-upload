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
 * @struts.form name="studentAssignSubmissionMasterForm"
 */
public class StudentAssignSubmissionMasterForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** facultyId property */
	private String SubmissionFile;

	/** studentId property */
	private int studentId;
private String studentName;
private String lecturDate;
	/** submissionDate property */
	private String submissionDate;

	/** assignmentId property */
	private int assignmentId;

	/** lecturerId property */
	private int lecturerId;

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
	public String getSubmissionFile() {
		return SubmissionFile;
	}

	/** 
	 * Set the facultyId.
	 * @param facultyId The facultyId to set
	 */
	public void setSubmissionFile(String SubmissionFile) {
		this.SubmissionFile = SubmissionFile;
	}

	/** 
	 * Returns the studentId.
	 * @return int
	 */
	public int getStudentId() {
		return studentId;
	}

	/** 
	 * Set the studentId.
	 * @param studentId The studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/** 
	 * Returns the submissionDate.
	 * @return String
	 */
	public String getSubmissionDate() {
		return submissionDate;
	}

	/** 
	 * Set the submissionDate.
	 * @param submissionDate The submissionDate to set
	 */
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	/** 
	 * Returns the assignmentId.
	 * @return int
	 */
	public int getAssignmentId() {
		return assignmentId;
	}

	/** 
	 * Set the assignmentId.
	 * @param assignmentId The assignmentId to set
	 */
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	/** 
	 * Returns the lecturerId.
	 * @return int
	 */
	public int getLecturerId() {
		return lecturerId;
	}

	/** 
	 * Set the lecturerId.
	 * @param lecturerId The lecturerId to set
	 */
	public void setLecturerId(int lecturerId) {
		this.lecturerId = lecturerId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLecturDate() {
		return lecturDate;
	}

	public void setLecturDate(String lecturDate) {
		this.lecturDate = lecturDate;
	}
}