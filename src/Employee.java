import java.util.HashMap;
import java.util.Map;

public class Employee {
    private Map<Integer, String> employee;
    private String id;
    private String phone;
    private String name;
    private String experience;
    Employee(String id, String phone, String name, String experience){
        employee = new HashMap<>();
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
        employee.put(1, id);
        employee.put(2, phone);
        employee.put(3, name);
        employee.put(4, experience);
    }
    public Map<Integer, String> getEmployee(){
        return employee;
    }

    @Override
    public String toString() {
        return String.format(
                "Табельный номер: " + employee.get(1) +
                "\nТелефон: " + employee.get(2) +
                "\nИмя: " + employee.get(3) +
                "\nСтаж: " + employee.get(4)
        );
    }
}
