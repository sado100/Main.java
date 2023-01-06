package _1_classes_and_objects.static_methods_and_fields;

import java.text.NumberFormat;

public class StaticTest {
    public static void main() {
        // fill the staff array with three Employee objects


        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        // print out information about all Employee objects
        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" +
                    /*e.getSalary())*/NumberFormat.getCurrencyInstance().format(e.getSalary()));
        }


        int n = Employee.getNextId(); // calls static method
        System.out.println("Next available id = " + n);
        /*NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat.getCurrencyInstance().format()
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));*/
    }
}
