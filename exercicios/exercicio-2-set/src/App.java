import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.StudentEntry;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<StudentEntry> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int studentCode = sc.nextInt();
            set.add(new StudentEntry(studentCode));

        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int j = 1; j <= n; j++) {

            int studentCode = sc.nextInt();
            set.add(new StudentEntry(studentCode));

        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        for (int m = 1; m <= n; m++) {

            int studentCode = sc.nextInt();
            set.add(new StudentEntry(studentCode));

        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
