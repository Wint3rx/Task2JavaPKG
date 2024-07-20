package umg.demostracion;

import java.util.Scanner;

public class PKG1_Exercise1 {
    public void metodoEjercicio() {
        System.out.println("Seleccione una opción");
        System.out.println("1. Calcular circunferencia \n2. Volumen de una Pirámide cuadrada \n3. Volumen de un Prisma Rectangular");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                PKG1_Exercise1 calcCirc = new PKG1_Exercise1();
                calcCirc.calcularCircunferencia();
                break;
            case 2:
                PKG2_Exercise1 calcVolPiramide = new PKG2_Exercise1();
                calcVolPiramide.calcularVolumenPiramide();
                break;
            case 3:
                PKG3_Exercise1 calcVolPrisma = new PKG3_Exercise1();
                calcVolPrisma.calcularVolumenPrisma();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}

