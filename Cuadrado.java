package figura;

public class Cuadrado {
    
    // la longitud de todos los lados estara en decimales (cm)
    private double longitud;
    
    // get   
    public double getLongitud() {
        return longitud;        
    }
    // set
    public void setLongitud(double longitud) {
        if (longitud > 0) {
            this.longitud = longitud;            
        } else {
            System.out.println("La longitud debe ser positiva");
        }
    }
    // Aqui abajo van mis metodos para calcular en Area y el Perimetro
    public double calcularArea() {
        return longitud * longitud;      
    // En esta ocasion no fue necesario usar Math.pow porque no use double
    }
    
    public double calcularPerimetro() {
        return 4 * longitud;
    }
 } 
    



