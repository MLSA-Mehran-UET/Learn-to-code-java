import java.util.ArrayList;
import java.util.List;

public class EmployeeDataLoader {
    public static List<Employee> getEmployeeList()
    {
        Employee e1 = new Employee();
        e1.setEmployeeNumber(1);
        e1.setName("Dileepa");
        e1.setAge(28);
        e1.setStatus(Employee.SINGLE);
        e1.setSalary(190.00);

        Employee e2 = new Employee();
        e2.setEmployeeNumber(2);
        e2.setName("Madawa");
        e2.setAge(28);
        e2.setStatus(Employee.SINGLE);
        e2.setSalary(150.00);

        Employee e3 = new Employee();
        e3.setEmployeeNumber(3);
        e3.setName("Janaki");
        e3.setAge(30);
        e3.setStatus(Employee.SINGLE);
        e3.setSalary(120.00);

        Employee e4 = new Employee();
        e4.setEmployeeNumber(4);
        e4.setName("Tharindu");
        e4.setAge(30);
        e4.setStatus(Employee.MARRIED);
        e4.setSalary(100.00);

        Employee e5 = new Employee();
        e5.setEmployeeNumber(5);
        e5.setName("Umesh");
        e5.setAge(32);
        e5.setStatus(Employee.MARRIED);
        e5.setSalary(110.00);

        Employee e6 = new Employee();
        e6.setEmployeeNumber(6);
        e6.setName("Tharani");
        e6.setAge(27);
        e6.setStatus(Employee.SINGLE);
        e6.setSalary(100.00);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        return employees;
    }


}
