/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulo;

/**
 *
 * @author jafet
 */

    import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();

        try {
            System.out.print("Ingrese el ancho: ");
            int ancho = scanner.nextInt();
            rectangulo.setAncho(ancho);

            System.out.print("Ingrese la altura: ");
            int altura = scanner.nextInt();
            rectangulo.setAltura(altura);

            int area = rectangulo.calcularArea();
            System.out.println("El área del rectángulo es: " + area);
        } catch (RectanguloException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un valor entero");
        }
    }
}


