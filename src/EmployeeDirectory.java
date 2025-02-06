import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeDirectory {
    private List<Employee> employeeList = new ArrayList<>();
    private Scanner scn = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Введите табельный номер: ");
        String id = scn.nextLine();
        System.out.println("Введите номер телефона: ");
        String phone = scn.nextLine();
        System.out.println("Введите имя: ");
        String name = scn.nextLine();
        System.out.println("Введиет стаж: ");
        String experience = scn.nextLine();

        Employee newEmployee = new Employee(id, phone, name, experience);
        employeeList.add(newEmployee);
    }

    public List<Employee> getByExperience() {
        List<Employee> result= new ArrayList<>();
        System.out.println("Введите стаж: ");
        String exp = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(4), exp)) {
                result.add(employee);
            }
        }
        return result;
    }

    public Employee getNameByPhone() {
        System.out.println("Введите номер телефона: ");
        String phone = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(2), phone)) {
                return employee;
            }
        }
        System.out.println("Сотрудник с таким номером телефона не найден.");
        return null;
    }
    public Employee getNameByEmpsNumber() {
        System.out.println("Введите табельный номер сотрудника: ");
        String number = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(1), number)) {
                return employee;
            }
        }
        System.out.println("Сотрудник с таким номером телефона не найден.");
        return null;
    }

    public List<Employee> getPhoneByName() {
        List<Employee> result = new ArrayList<>();
        System.out.println("Введите имя: ");
        String phone = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(3), phone)) {
                result.add(employee);
            }
        }
        return result;
    }

    public void printList() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));

        }
    }

}
