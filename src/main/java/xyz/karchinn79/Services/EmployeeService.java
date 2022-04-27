package xyz.karchinn79.Services;

import xyz.karchinn79.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void addEmployee(Employee emp);

    public void deleteEmployee(int id);

    Employee getEmployeeByID(int id);
}
