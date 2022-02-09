package facades;

import entities.Department;
import entities.Employee;

import java.util.List;

public interface IFacade {

    List<Employee> getAllEmployees();
    Employee getHighestPaid();
    Employee getAverageSalery();
    List<Employee> getAllBelowAverage();
    Department getWithMostEmployees();
    Department getMostExpensiveSalarySum();
    List<Department> getDepartmentsWithEmpNamed(String name);
}
