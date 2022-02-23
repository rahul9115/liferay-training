<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="training.demo.search.container.model.Student"%>
<%@page import="training.demo.search.container.service.StudentLocalServiceUtil"%>
<%@ include file="init.jsp" %>

<%@page import="java.util.List" %>
<div class="container">
<center>
<h3>Student Details</h3>

</center>

<% 
 List<Student> studentlist=StudentLocalServiceUtil.getStudents(-1,-1);

PortletURL iteratorURL=renderResponse.createRenderURL();

iteratorURL.getRenderParameters().setValue("mvdPath", "/view.jsp");
%>
<portlet:renderURL var="addStudent">
<portlet:param name="mvcPath" value="/addStudent.jsp"/>
</portlet:renderURL>


<a href="<%=addStudent %>" class="btn btn-primary btn-default">Add Student</a> 
<br>
<liferay-ui:search-container emptyResultsMessage="No Files Found" var="studentSearchContainer" 
	delta="5" total="<%=studentlist.size() %>" iteratorURL="<%=iteratorURL %>">
<liferay-ui:search-container-results results="<%=ListUtil.subList(studentlist, studentSearchContainer.getStart(), studentSearchContainer.getEnd()) %>">

</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="training.demo.search.container.model.Student" modelVar="studentDetails">
	<liferay-ui:search-container-column-text value="<%=String.valueOf(studentDetails.getStudentId()) %>" name="Id"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text value="<%=studentDetails.getName() %>" name="Name" ></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text value="<%=studentDetails.getEmail() %>" name="Email" ></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text value="<%=studentDetails.getMobileNo() %>" name="MobileNo"></liferay-ui:search-container-column-text>

	<liferay-ui:search-container-column-jsp path="/fileAction.jsp" name="Actions"></liferay-ui:search-container-column-jsp>
	

</liferay-ui:search-container-row>
<liferay-ui:search-iterator paginate="true" searchContainer="<%=studentSearchContainer %>" />


</liferay-ui:search-container>

</div>