<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

EMPLOW INFO
<table>

    <form:form action="saveE" modelAttribute="emplo">
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

</body>
</html>