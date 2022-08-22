import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");

            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHours = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                OutsourcedEmployee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            } else {

                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }
        }

        System.out.println("PAYMENTS: ");

        for ( Employee emp : list ) {
            System.out.print(emp.getName() + " - $" + String.format("%.2f", emp.payment()) + "\n");
        }


    }
}
