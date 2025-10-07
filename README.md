### Proyecto de Programación Orientada a Objetos en Java

### Descripción
Este proyecto es un conjunto de ejercicios prácticos desarrollados en Java usando NetBeans, enfocados en aplicar los conceptos de Programación Orientada a Objetos (POO). Está diseñado para la práctica universitaria y contiene tres ejercicios integrados, cada uno con un enfoque diferente:

Figuras geométricas: cálculo de perímetro y área de varias figuras (triángulo, cuadrado, círculo, etc.) usando clases y métodos.

Cuenta bancaria: simulación de operaciones de cuenta como depósitos, retiros y verificación de saldo insuficiente, aplicando encapsulamiento y control de acceso.

### Clases y estructura

Cada ejercicio utiliza una clase base y, en algunos casos, clases hijas para demostrar herencia y reutilización de código.

FigurasGeometricas.java:
Clase base para manejar operaciones comunes de figuras. Cada figura específica puede heredar de esta clase y sobrescribir métodos como calcularArea() y calcularPerimetro().

CuentaBancaria.java:
Clase que representa una cuenta, con atributos privados como nombre del titular, número de cuenta y saldo. Incluye métodos para depositar, retirar y mostrar el saldo actual. La lógica asegura que no se pueda retirar más dinero del disponible.

PruebasFigura.java / Main.java:
Archivos que contienen la lógica de prueba, donde se crean instancias de las clases y se ejecutan las operaciones para ver resultados en consola.
