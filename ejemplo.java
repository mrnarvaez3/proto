import java.util.Random;
import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Random rd = new Random();
        System.out.println("Ingrese el tamanio de la lista");
        int n = teclado.nextInt();
        int[] milista = new int[n];
        int index = 0;

        for (int i = 0; i < milista.length; i++) {
            milista[i] = rd.nextInt(100);
        }

        for (int i = 0; i < 10000000; i++) {
            index = -1;
            for (int j = 0; j < milista.length; j++) {
              if (milista[j]==80){
                  index = j;
              }
            }
        }
        System.out.println(index);
    }
}
