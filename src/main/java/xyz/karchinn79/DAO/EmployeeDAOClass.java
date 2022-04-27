package xyz.karchinn79.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import xyz.karchinn79.Services.EmployeeService;
import xyz.karchinn79.entity.Employee;


import java.util.List;
import java.util.Queue;

@Repository
public class EmployeeDAOClass implements EmployeeDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Employee> getAllEmployees() {
        Session sess = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = sess.createQuery("from Employee", Employee.class).getResultList();

        return allEmployees;
    }
    @Override
    public void addEmployee(Employee emp){
        Session sess = sessionFactory.getCurrentSession();
        sess.save(emp);
    }
    public void deleteEmployee(int id){
        Session sess = sessionFactory.getCurrentSession();
        Query query = sess.createQuery("delete from Employee where id ='"+ id + "'");;

        query.executeUpdate();
    }

    @Override
    public Employee getEmployeeByID(int id) {
        Integer ID = id;
        Session sess = sessionFactory.getCurrentSession();
        Employee emp = sess.get(Employee.class, ID.toString());
        System.out.println("get " + emp);
        return emp;
    }
}
