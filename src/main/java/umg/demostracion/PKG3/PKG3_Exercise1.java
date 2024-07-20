package umg.demostracion.PKG3;

import java.util.Scanner;

public class PKG3_Exercise1 {
    public void calcularVolumenPrisma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base del prisma: ");
        double longitud = sc.nextDouble();
        System.out.print("Ingrese el ancho de la base del prisma: ");
        double ancho = sc.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double altura = sc.nextDouble();
        double areaBase = longitud * ancho;
        double volumen = areaBase * altura;
        System.out.println("El volumen del prisma rectangular es: " + volumen);
    }
}

