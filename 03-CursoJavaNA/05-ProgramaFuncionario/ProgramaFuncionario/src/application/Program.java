package application;

import entidades.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employee will be registered?");
        int N = sc.nextInt();

        for( int i = 0; i < N; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");

            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }
        System.out.println();
        System.out.println("Enter the employee ID that will have salary increase: ");
        int idSalary = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        //Integer pos = position(list, idSalary);
        if(emp == null){
            System.out.println("This ID does not exist!");
            System.out.println("------------------------------------");
        }
        else {
            System.out.print("Enter the percentage: -> ");
            double percent = sc.nextDouble();
            (emp).increaseSalary(percent);
        }
        //RESULTADO:
        System.out.println();
        System.out.println("List of Employees: ");
        for(Employee e : list){
            System.out.println(e);
        }


        System.out.println("-------------------------------");
        System.out.println("Fim do Programa!");
       sc.close();
    }//fim do main

    //Função Aux. Para procurar elemento na lista 1° modo de fazer essa busca.
    public static Integer position(List<Employee> listFun, int id){
        for(int i = 0; i < listFun.size(); i++){
            if(listFun.get(i).getId() == id){
                return  i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}//fim da class program
