package xyz.karchinn79.DAO;
import xyz.karchinn79.Services.EmployeeService;
import xyz.karchinn79.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
  //  public void addEmployee(){};
    public void addEmployee(Employee employee);

    public void deleteEmployee(int id);

    Employee getEmployeeByID(int id);
}
