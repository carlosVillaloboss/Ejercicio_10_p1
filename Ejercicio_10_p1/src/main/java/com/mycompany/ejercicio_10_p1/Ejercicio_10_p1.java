package com.mycompany.ejercicio_10_p1;
import java.util.Scanner;


public class Ejercicio_10_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero de inscripcion: ");
        int ni= scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre= scanner.nextLine();
        System.out.print("Ingrese patrimonio: ");
        double pa= scanner.nextDouble();
        System.out.print("Ingrese estrato social: ");
        int estrato= scanner.nextInt();
        double pago= 50000;
        
        if (pa > 2000000 && estrato > 3){
            pago= pago+(pa*0.03);
        }
        System.out.println("El numero de inscripcion es: "+ni);
        System.out.println("Nombre del estudiante: "+nombre);
        System.out.println("El valor del pago de matricula es: "+pago);
        scanner.close();
    }
}
