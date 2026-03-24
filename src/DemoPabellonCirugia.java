
import java.util.Scanner;

public class DemoPabellonCirugia {

    private PabellonCirugia[] pabellones;
    private int cantidad;

    public DemoPabellonCirugia() {
        pabellones = new PabellonCirugia[6];
        cantidad = 0;
    }

    public void procesa() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pabellones.length; i++) {

            System.out.print("Ingrese numero: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese especialidad: ");
            String especialidad = sc.nextLine();

            pabellones[i] = new PabellonCirugia(numero, especialidad);
            cantidad++;
        }

        for (int i = 0; i < cantidad; i++) {
            if (i % 2 == 0) {
                pabellones[i] = new PabellonCirugia(pabellones[i].getNumero(), "ocupado");
            }
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println(pabellones[i].toString());
        }

        for (int i = 0; i < cantidad; i++) {
            for (int j = i + 1; j < cantidad; j++) {

                if (pabellones[i].equals(pabellones[j])) {
                    System.out.println("Iguales: " + i + " y " + j);
                }

            }
        }
    }

    public static void main(String[] args) {
        DemoPabellonCirugia d = new DemoPabellonCirugia();
        d.procesa();
    }
}
