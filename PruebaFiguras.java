package figura;

public class PruebaFiguras {

    public static void main(String[] args) {
    
    // Circulo    
    System.out.println("-------------");
    System.out.println("> Area y perimetro de mi circulo ");
    Circulo1 circ1 = new Circulo1();
    circ1.setRadio(2.5);
    // Este es el valor de mi circulo
    System.out.println("El area de mi circulo es: " + circ1.calcularArea());
    System.out.println("El perimetro de mi curclo es: " + circ1.calcularPerimetro());
        
    // Rectangulo    
    System.out.println("-------------");       
    System.out.println("> Area y perimetro de mi rectangulo con base 10 y altura 5");
    Rectangulo rec = new Rectangulo();
    rec.setBase(10);
    rec.setAltura(5);
    // ^ Estos son los valores de mi rectangulo 
    System.out.println("El area del rectangulo es: " + rec.calcularArea() + " cm^2");
    System.out.println("El perimetro del rectangulo es: " + rec.calcularPerimetro() + " cm");

    // Cuadrado
    System.out.println("-------------");
    System.out.println("> Area y perimetro de mi cuadrado con una longitud de 10 en cada lado");
    //Area, perimetro y valores del cuadrado.
    Cuadrado cua = new Cuadrado();
    cua.setLongitud(10);
    // ^ Estos son los valores del cuadrado
    System.out.println("El area del cuadrado es: " + cua.calcularArea() + " cm^2");
    System.out.println("El perimetro del rectangulo es: " + cua.calcularPerimetro() + " cm");
    
    // Triangulo Rectangulo
    System.out.println("-------------");
    System.out.println("> Area, perimetro e hipotenusa de mi Triangulo Rectangulo ");
    // Valores de mi triangulo rectangulo
    TrianguloRectangulo trec = new TrianguloRectangulo();
    trec.setBase(6);
    trec.setAltura(8);
    // Calcular hipotenusa
    trec.calcularHipotenusa();
    // Mostrar resultados 
    System.out.println("Triangulo Rectangulo: ");
    System.out.println("Base: " + trec.getBase());
    System.out.println("Altura: " + trec.getAltura());
    System.out.println("Hipotenusa: " + trec.getHipotenusa());
    System.out.println("Area: " + trec.calcularArea());
    System.out.println("Perimetro: " + trec.calcularPerimetro());
    System.out.println("Tipo de triangulo: " + trec.determinarTipoTriangulo());
    }
           
}
