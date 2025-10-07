package main;
// tuve que importar scanner!!! 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        // nombre de mi calculadora, es calc
        int option;
        do{
            System.out.println("\n== Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Mutiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            option = sc.nextInt();
            
            
            // aqui esta el switch
            if (option >= 1 && option <= 4){
                System.out.println("Enter the first number: ");
                int a = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b = sc.nextInt();
                
                switch(option){
                    case 1 -> System.out.println("Result: " + calc.addition(a, b));
                    case 2 -> System.out.println("Result: " + calc.substraction(a, b));
                    case 3 -> System.out.println("Result: " + calc.multiplication(a, b));
                    case 4 -> System.out.println("Result: " + calc.division(a, b));                                               
                }
            } else if (option != 5){
                System.out.println("Invalid option. Try again.");
            }
        } while (option != 5);
        
        
        System.out.println("Thanks for using the calculator!");
        sc.close();                
    }   
}
