package figura;

public class Circulo1 {
    
    private int id;
    private double radio;
    
    // Se usa double en vez de string ya que double es para numeros con
    // decimales. En este caso usare un radio de 2.5 cm
    
    // get
    double getRadio(){
        return radio;
    }
    
    // set
    public void setRadio(double radio){
        if (radio > 0){
            this.radio = radio;
        } else {
            System.out.println("El radio debe ser positivo");            
        }
    }
    
    // Este es mi metodo para calcular el area del circulo 
    // Math.PI * radio * radio; equivale a la formula: pi*radio2
    public double calcularArea(){
        return Math.PI * radio * radio;        
    }
    // Este es mi metodo para calcular el perimetro del circulo
    // 2*Math.PI * radio; equivale a la formula 2*pi*radio
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;        
    }   
}
