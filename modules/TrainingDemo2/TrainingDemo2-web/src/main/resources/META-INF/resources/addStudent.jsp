<%@ include file="init.jsp" %>
<center>
<h3>Student Details</h3>

</center>
<portlet:actionURL var="addStudentURL" name="addStudent">

</portlet:actionURL>

<form action="<%= addStudentURL %>" method="post">
<div class="form-group">
<label>Name</label>
<input class="form-control" type="text" name="<portlet:namespace/>name" placeholder="Enter first name" required></input>
</div>

<div class="form-group">
<label>Email</label>
<input class="form-control" type="email" name="<portlet:namespace/>email" placeholder="Enter email" required></input>
</div>

<div class="form-group">
<label>Mobile Number</label>
<input class="form-control" type="number" name="<portlet:namespace/>mobileno" placeholder="Enter number" required></input>
</div>


<button class="btn btn-primary" type="submit">Submit Test</button>
</form>