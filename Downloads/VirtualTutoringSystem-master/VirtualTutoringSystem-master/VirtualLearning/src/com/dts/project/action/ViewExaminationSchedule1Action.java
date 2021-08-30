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

import com.dts.core.util.CoreList;
import com.dts.project.dao.ExaminationScheduleDao;

/** 
 * MyEclipse Struts
 * Creation date: 02-04-2009
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 * @struts.action-forward name="viewExaminationSchedule" path="/ViewExaminationSchedule1.jsp"
 */
public class ViewExaminationSchedule1Action extends Action {
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
		ExaminationScheduleDao dao=new ExaminationScheduleDao();
		CoreList cl=dao.ViewExaminationSchedule();
        request.setAttribute("cl", cl);
		return mapping.findForward("viewExaminationSchedule");
	}
}