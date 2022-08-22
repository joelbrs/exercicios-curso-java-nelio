package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double reqSalary = sc.nextDouble();

            Comparator<String> compEmp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

            System.out.println("Email of people whose salary is more than " + reqSalary + ":");
            
            List<String> email = list.stream()
                .filter(e -> e.getSalary() > 2000.00)
                .map(e -> e.getEmail())
                .sorted(compEmp.reversed())
                .collect(Collectors.toList());

            email.forEach(System.out::println);

            double sumSalary = list.stream()
                .filter(e -> e.getName().charAt(0) == 'M')
                .map(e -> e.getSalary())
                .reduce(0.0, (x, y) -> x + y);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sumSalary));
            
        }

        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
