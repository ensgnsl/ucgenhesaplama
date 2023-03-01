import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double alan,c,cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin yükseklğini girin : ");
        a=input.nextInt();

        System.out.print("Üçgenin tabanını girin : ");
        b=input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        cevre=a+b+c;
        alan=(a*b)/2;

        System.out.println("Üçgenin a kenarı :"+a);
        System.out.println("Üçgenin b kenarı :"+b);
        System.out.println("Üçgenin Hipotenüs kenarı :"+c);
        System.out.println("Üçgenin Çevresi :"+cevre);
        System.out.println("Üçgenin alanı :"+alan);

        System.out.println("Hello world!");
    }
}