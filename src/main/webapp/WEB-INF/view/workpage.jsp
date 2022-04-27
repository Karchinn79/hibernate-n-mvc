<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>

    <c:forEach var="emp" items="${amploya}">
        <tr>
            <c:url var="updateButton" value="/updateE">
                <c:param name="ID" value="${emp.id}"/>
            </c:url>

            <c:url var="deleteButton" value="/deleteE">
                <c:param name="ID" value="${emp.id}"/>
            </c:url>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <th>${emp.surname}</th>
            <th>${emp.department}</th>
            <th>${emp.salary}</th>
            <th>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'">
            </th>
            <th>
                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'">
            </th>
        </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="addEmployeeButton" onclick="window.location.href = '/addEmplow'">
</body>

</html>