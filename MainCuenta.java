package cuentabancaria;

public class MainCuenta {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", "Belman", "64000", "Ahorros");
        
        System.out.println("------------------");
        System.out.println("Saldo: $0");
        System.out.println("------------------");
        cuenta1.imprimirDatos();
        System.out.println("------------------");
        System.out.println("Depositaron $500");
        System.out.println("------------------");
        cuenta1.consignar(500);
        cuenta1.retirar(200);
        cuenta1.retirar(400);
        System.out.println("------------------");
        System.out.println("Saldo: $300");
        System.out.println("------------------");
        cuenta1.imprimirDatos();
        
        System.out.println("------------------");
        System.out.println("Depositaron $7,000");
        System.out.println("------------------");
        cuenta1.consignar(7000);
        cuenta1.retirar(350);
        cuenta1.imprimirDatos();
    }   
}
