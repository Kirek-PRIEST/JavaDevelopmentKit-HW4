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

    public void getByExperience() {
        System.out.println("Введите стаж: ");
        String exp = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(4), exp)) {
                System.out.println(employee + "\n");
            }
        }
    }

    public void getNameByPhone() {
        System.out.println("Введите номер телефона: ");
        String phone = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(2), phone)) {
                System.out.println(employee + "\n");
            }
        }
    }

    public void getPhoneByName() {
        System.out.println("Введите имя: ");
        String phone = scn.nextLine();
        for (Employee employee : employeeList) {
            if (Objects.equals(employee.getEmployee().get(3), phone)) {
                System.out.println(employee + "\n");
            }
        }
    }

    public void printList() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));

        }
    }

}
