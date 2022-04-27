package xyz.karchinn79.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
import xyz.karchinn79.DAO.EmployeeDAO;
import xyz.karchinn79.Services.EmployeeService;
import xyz.karchinn79.entity.Employee;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    private String getMain(){
        return "mainPage";
    }


    @RequestMapping("/workpage")
    public String showAllEmployees(Model model){

        //List<Employee> allEmployees = employeeDAO.getAllEmployee();
        List<Employee> aEmp = employeeService.getAllEmployees();
        System.out.println("sss uka " + aEmp);
        model.addAttribute("amploya", aEmp);
        return "workpage";
    }

    @RequestMapping("/addEmplow")
    public String addNewEmployee(Model model) {
        Employee emplow = new Employee();
        model.addAttribute("emplo", emplow);
        return "addEmplow";
    }

    @RequestMapping("/saveE")
    public String saveEmploi(@ModelAttribute("emplo") Employee employee){

        employeeService.addEmployee(employee);
        return "redirect:/workpage";
    }

    @RequestMapping("/deleteE")
    public String deleteEmploye(@RequestParam("ID") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/workpage";
    }

    @RequestMapping("/updateE")
    public String updateEmployePage(@RequestParam("ID") int id, Model model){
        Employee curEmp = employeeService.getEmployeeByID(id);

        model.addAttribute("currEmp", curEmp);
        model.addAttribute("currEmpID", id);
        return "empUpdatePage";
    }

    @RequestMapping("/updatePush")
    public String updateEmployePush(@ModelAttribute("currEmp") Employee emp, @RequestParam("sex") int id){
        System.out.println("AAAAAAAAAAAA " + id);
        //employeeService.updateEmp(emp);
        return "redirect:workpage";
    }
}
