import java.util.Scanner;
import java.util.Locale;
public class secondRadiusM {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        secondRadius rad = new secondRadius(0);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.printf("Circumference: %.2f%n", rad.circumference(radius));
        System.out.printf("Volume: %.2f%n", rad.volume(radius));
        System.out.printf("Pi value: %.2f%n", rad.PI);

    }
    
}
