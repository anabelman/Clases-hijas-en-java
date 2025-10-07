package figura;

public class Rectangulo {
    
    // En este ejemplo utilizare 'private' antes del int para que sea 
    // mas profesional, aunque sea innecesario. Me gusta como se ve.
    int id;
    int base;
    int altura;
    
    // get
    public int getBase() {
        return base;
    }
   
    public int getAltura() {
        return altura;
    }
    
    // set
    public void setBase(int base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("La base debe ser positiva");
        }
    }
    
    public void setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("La altura debe ser positiva");
        }
    }
    
    // Este es el metodo para calcular el area del rectangulo
    public int calcularArea() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return 2* (base + altura);
    }     
}
