package training.demo.web.portlet;

import training.demo.service.StudentLocalServiceUtil;
import training.demo.web.constants.TrainingDemoWebPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author sudha
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=TrainingDemoWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TrainingDemoWebPortletKeys.TRAININGDEMOWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TrainingDemoWebPortlet extends MVCPortlet {
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse) {
		String name= ParamUtil.getString(actionRequest,"name");
		String email= ParamUtil.getString(actionRequest,"email");
		String mobileno=ParamUtil.getString(actionRequest,"mobileno");
		System.out.println("Name wooo"+name);
		System.out.println("email "+email);
		System.out.println("Mobile no "+mobileno);

		StudentLocalServiceUtil.addStudentDetails(name, mobileno, email);
		
	}
	public void editStudent(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
		long studentId=ParamUtil.getLong(actionRequest, "studentId" );
		String name= ParamUtil.getString(actionRequest,"name");
		String email= ParamUtil.getString(actionRequest,"email");
		String mobileno=ParamUtil.getString(actionRequest,"mobileno");
		System.out.println("Id: "+studentId);
		System.out.println("Name wooo"+name);
		System.out.println("email "+email);
		System.out.println("Mobile no "+mobileno);
		StudentLocalServiceUtil.editStudentDetails(studentId, name, mobileno, email);
		

	}
}