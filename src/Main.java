public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee();
        employeeDirectory.printList();
        System.out.println(employeeDirectory.getNameByEmpsNumber());
    }
}