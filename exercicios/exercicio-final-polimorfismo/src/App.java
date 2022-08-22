import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();

            if (ch == 'c') {
                System.out.print("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();

                list.add(new JuridicalPerson(nome, rendaAnual, numeroFuncionarios));
            } else {
                System.out.print("Health expenditures: ");
                double gastoSaude = sc.nextDouble();

                list.add(new PhysicalPerson(nome, rendaAnual, gastoSaude));
            }
        }

        System.out.println("TAXES PAID:");
        System.out.println();

        for (Person pers : list) {
            System.out.println(pers.getNome() + ": $" + String.format("%.2f", pers.calcImposto()));
        }

        sc.close();

    }
}
