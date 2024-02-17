package src.program;

import src.entities.Department;
import src.entities.HourContract;
import src.entities.Worker;
import src.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        System.out.print("Enter department's name: ");
        String departamentName = sc.nextLine();

        System.out.println("name: ");
        String workedName = sc.nextLine();

        System.out.println("Level: ");
        String workedLevel = sc.nextLine();

        System.out.println("Base Salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workedName, WorkerLevel.valueOf(workedLevel), baseSalary, new Department(departamentName));

        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            System.out.println("Enter contract #" + i + "date ");
            System.out.print("Date (DD/MM/YYYY");
            Date contrsctDate = sdf.parse(sc.next());
            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hour) ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contrsctDate, valuePerHour, hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.println("Enter month and year to calculate income (DD/MM/YYYY) ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f",worker.income(year, month)));





        sc.close();
    }
}
