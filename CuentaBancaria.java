package cuentabancaria;


public class CuentaBancaria {
    
    private String nombresTitular;
    private String apellidosTitular;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    
    // Este es el constructor donde inicia la cuenta con saldo 0!
    public CuentaBancaria(String nombres, String apellidos, String numero, String tipo){
        this.nombresTitular = nombres;
        this.apellidosTitular = apellidos;
        this.numeroCuenta = numero;
        this.tipoCuenta = tipo;
        this.saldo = 0; 
        // Aqui ira el saldo inicial de la cuenta!
    }
    
    // get
    public String getNombresTitular() { return nombresTitular; }
    public String getApellidosTitular() { return apellidosTitular; }
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTipoCuenta() { return tipoCuenta; }
    public double getSaldo() { return saldo; }
    
    // set
    public void setNombresTitular(String nombres) { this.nombresTitular = nombres; }
    public void setApellidosTitular(String apellidos) { this.apellidosTitular = apellidos; }
    public void setNumeroCuenta(String numero) { this.numeroCuenta = numero; }
    public void setTipoCuenta(String tipo) { this.tipoCuenta = tipo; }
    
    // Metodos para poder ver los datos de la cuenta
    public void imprimirDatos() {
        System.out.println("Titular: " + nombresTitular + " " + apellidosTitular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }
    public void consignar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Se consignaron $" + monto + ". Nuevo saldo: $" + saldo);  
        } else {
            System.out.println("El monto a consignar debe ser positivo.");
        }        
}
    
// Este es otro metodo para retirar dinero
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("No se puede retirar $" + monto + ". Saldo insuficiente");
        } else if (monto <= 0){
            System.out.println("El monto a retirar debe ser positivo.");
        } else {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + ". Nuevo saldo: $" + saldo);
        }
    }
}
