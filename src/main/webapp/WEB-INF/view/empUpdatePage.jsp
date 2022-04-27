<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<title>Update Employee</title>
<table>
    <form:form action="/updatePush" modelAttribute="currEmp">
        <c: var = "sex" value="${currEmpID}"/>
        name <form:input path="name"/>
        <br>
        surname <form:input path="surname"/>
        <br>
        department <form:input path="department"/>
        <br>
        salary <form:input path="salary"/>
        <input type="submit" value="OK">
    </form:form>

</table>

</html>