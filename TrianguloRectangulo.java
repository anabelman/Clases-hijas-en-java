package figura;

public class TrianguloRectangulo {
    
    
    private double base; // estara en centimetros (numero entero)
    private double altura; // estara en centimetros (numero entero)
    private double hipotenusa; // aqui va la hipotenusa
    
    // get
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public double getHipotenusa(){
        return hipotenusa;
    }
    
    // set
    public void setBase(int base){
        if(base > 0) {
            this.base = base;            
        } else {
            System.out.println("La base debe ser positiva");
        }
    }
    public void setAltura(int altura){
        if(altura > 0) {
            this.altura = altura;            
        } else {
            System.out.println("La altura debe ser positiva");            
        }
    }
    // Aqui saco la formula para calcular el area
    // sabemos que la formula es base*altura/2
    public double calcularArea(){
        return (base*altura)/ 2.0;
    }
    // Aqui saco la formula para calular la hipotenusa, esta sirve para poder
    // calcular el perimetro mas adelante. 
    public double calcularHipotenusa(){
        hipotenusa = Math.hypot(base, altura);
        return hipotenusa;
    }
    public double calcularPerimetro(){
        hipotenusa = Math.hypot(base, altura);
        return base + altura + hipotenusa;
    }
    public String determinarTipoTriangulo(){
        // Calculo la hipotenusa primero
        hipotenusa = Math.hypot(base, altura);
        
        // Determino el tipo de triangulo segun lados
        if (base == altura && altura == hipotenusa) {
            return "Equilatero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa){
            return "Isoceles";             
        } else {
            return "Escaleno";
        }
    }
}
