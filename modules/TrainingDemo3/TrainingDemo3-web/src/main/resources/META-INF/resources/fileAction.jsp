<%@page import="training.demo.search.container.service.StudentLocalService"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="training.demo.search.container.model.Student"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@ include file="init.jsp" %>
<%
SearchContainer serachContainer=(SearchContainer) request.getAttribute("liferay-ui:search-searchContainer");
ResultRow row=(ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
Student  studenDetails=(Student) row.getObject();
%>
<portlet:renderURL  var="updateStudentURL">
<portlet:param name="studentId" value="<%= String.valueOf(studenDetails.getStudentId()) %>"/>
<portlet:param name="mvcPath" value="/updateStudent.jsp"/>
</portlet:renderURL>

<liferay-ui:icon-menu>
	<liferay-ui:icon image="edit" url="<%=updateStudentURL %>" label="true" message="edit"/>
	
</liferay-ui:icon-menu>