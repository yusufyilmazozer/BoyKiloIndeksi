import java.util.Scanner;

public class boyKiloIndeksi {
    public static void main (String[] args){
        double kg,m;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();

        System.out.print("Vücut Kitle İndeksiniz = " + kg/(m*m));
    }
}
