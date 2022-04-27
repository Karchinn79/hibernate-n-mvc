package xyz.karchinn79.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.karchinn79.DAO.EmployeeDAO;
import xyz.karchinn79.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceClass implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;


    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    @Override
    @Transactional
    public void addEmployee(Employee emp){
        employeeDAO.addEmployee(emp);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id){
        employeeDAO.deleteEmployee(id);
    }

    @Override
    @Transactional
    public Employee getEmployeeByID(int id) {
        return employeeDAO.getEmployeeByID(id);
    }
}
