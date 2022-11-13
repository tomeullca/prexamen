import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();


        if (numero == 1) {
            System.out.println("Introduce un numero para el 1");
            int numero2 = sc.nextInt();
            int i = 0;
            while (Math.pow(2, i) < numero2) {
                i++;
            }
            System.out.println(i);
            //Vas a decirme el exponente mas cercano de 2

        } else {
            System.out.println("Introduce un numero para el 1");
            int numero2 = sc.nextInt();
            if (numero2 % 2 == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("impar");
            }
        }

    }
}