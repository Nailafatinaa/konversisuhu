import java.util.Scanner;

public class konversiSuhu {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println(" Masukkan Celcius ");
        double C = x.nextDouble();

        System.out.println("pilih opsi: ");
        System.out.println("1. Farenheit ");
        System.out.println("2. Kelvin ");
        System.out.println("3. Reamur ");

        int opsi = x.nextInt();

        if (opsi == 1){
            double F = (C * 9/5) + 32;
            System.out.println(C + " adalah " + F);

        }

        else if (opsi == 2){
            double K = (C + 273);
            System.out.println(C + " adalah " + K);

        }

        else if (opsi == 3){
            double R = (C * 4/5);
            System.out.println(C + " adalah " + R);

        }

        else{
            System.out.println ("opsi tidak valid");
        } 
    }
}


