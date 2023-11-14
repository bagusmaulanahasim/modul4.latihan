import java.util.Scanner;
import java.lang.Math;
public class kalkulator {
    public static int angka;
    public static Scanner objInput = new Scanner(System.in);
    public static double akarKuadrat(int n){
        return Math.sqrt(n);
    }
    public static double pangkat(int n,int p){
        return Math.pow(n,p);
    }
    public static double logaritma(int n){
        return Math.log(n);
    }
    public static double faktorial(int n){
        return (n==1 || n == 0 ) ?  1 :  n * faktorial(n - 1);
    }

    public static void inputan(){
        System.out.print("Masukkan Angka : ");
        angka = objInput.nextInt();
    }
    public static void main(String[] args) {
        int chooser, pangkat;
        double hasil = 0;
        while (true) {
            System.out.println("== Calculator ===");
            System.out.print("1. Akar Kuadrat\n2. Pangkat\n3. Logaritma\n4. Faktorial\n5. Keluar\n");
            System.out.print("Pilih Operator : ");
            chooser = objInput.nextInt();
            if (chooser != 5)
                inputan();
            switch (chooser) {
                case 1:
                    hasil = akarKuadrat(angka);
                    break;
                case 2:
                    System.out.println("Masukkan Pangkat : ");
                    pangkat = objInput.nextInt();
                    hasil= pangkat(angka,pangkat);
                    break;
                case 3:
                    hasil = logaritma(angka);
                    break;
                case 4:
                    hasil = faktorial(angka);
                    break;
                case 5:
                    objInput.close();
                    System.exit(0);
                    break;
            }
            System.out.println("Hasil  : " + hasil);
        }
    }
}