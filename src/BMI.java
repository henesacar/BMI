import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double kilo, boy;
        Scanner scn = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinde girin: ");
        boy= scn.nextDouble();
        System.out.println("Kilonuzu KG cinsinden girin: ");
        kilo = scn.nextDouble();
        double oran = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+oran);
    }
}
