package umg.demostracion.PKG1;

import java.util.Scanner;

public class PKG1_Exercise1 {
    public void calcularCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo");
        int radio = sc.nextInt();
        double circu = 2 * 3.1416 * radio;
        System.out.println("La circunferencia es: " + circu);
    }
}

