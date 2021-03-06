/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dts.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dts.project.dao.StudentExaminationMasterDao;
import com.yourcompany.struts.form.StudentExaminationMasterForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-28-2009
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="success" path="/StudentExaminationMaster.jsp"
 * @struts.action-forward name="failure" path="/StudentExaminationMaster.jsp"
 */
public class StudentExaminationMasterAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		StudentExaminationMasterForm studentExaminationMasterForm=(StudentExaminationMasterForm)form;
		StudentExaminationMasterDao studentExaminationMasterDao=new StudentExaminationMasterDao();
		boolean flag=studentExaminationMasterDao.insertStudentExaminationMaster(studentExaminationMasterForm);
		if(flag)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
	}
}