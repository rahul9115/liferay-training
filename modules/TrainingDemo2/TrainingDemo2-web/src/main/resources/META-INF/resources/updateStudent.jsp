<%@page import="training.demo.service.StudentLocalServiceUtil"%>
<%@page import="training.demo.model.Student"%>
<%@ include file="init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
long studentId=ParamUtil.getLong(request, "studentId" );
Student studentDetails=StudentLocalServiceUtil.getStudent(studentId);
String name=studentDetails.getName();
String email=studentDetails.getEmail();
String mobileno=studentDetails.getMobileNo();
%>
<center>
<h3>Student Details</h3>

</center>
<portlet:actionURL  name="editStudent"var="editStudentURL">
<portlet:param name="studentId" value="<%= String.valueOf(studentId) %>"/>


</portlet:actionURL>

<form action="<%= editStudentURL %>" method="post">
<div class="form-group">
<label>Name</label>
<input class="form-control" type="text" value="<%=name %>" name="<portlet:namespace/>name" placeholder="Enter first name" required></input>
</div>

<div class="form-group">
<label>Email</label>
<input class="form-control" type="email" value="<%=email %>"  name="<portlet:namespace/>email" placeholder="Enter email" required></input>
</div>

<div class="form-group">
<label>Mobile Number</label>
<input class="form-control" type="number" value="<%=mobileno %>" name="<portlet:namespace/>mobileno" placeholder="Enter number" required></input>
</div>


<button class="btn btn-primary" type="submit">Submit Test</button>
</form>