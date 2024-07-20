package umg.demostracion.PKG2;

import java.util.Scanner;

public class PKG2_Exercise1 {
    public void calcularVolumenPiramide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base de la pirámide");
        int basep = sc.nextInt();
        System.out.println("Ingrese la altura de la pirámide");
        int alturap = sc.nextInt();
        double volumenp = (basep * alturap) / 3.0;
        System.out.println("El volumen de la pirámide es: " + volumenp);
    }
}
