package _JDBC.Gun2;

public class _03_Printf {
    public static void main(String[] args) {
        // printf
        int a=2343;
        double pi= 3.145656;
        String isim="ismet temur";
        char basHarf='I';


        System.out.printf("%5d", a ); // a yi 5 hane icinde ondalik sistemde goster
        // virgulden onceki bolum formati temsil ediyor
        // virgulden sonraki bolum datalari temsil ediyor
        System.out.println("merhaba");

        System.out.printf("%-5d", a ); // sola aldi
        System.out.println("merhaba");

        System.out.printf("%-5d %6.2f", a, pi); // %6.2f  : toplamda noktadan sonrasi dahil
        // 6 hane kullan noktadan 2 hane kullan
        System.out.printf("%-5d %6.2f %20s", a, pi, isim);

        System.out.printf("%-6.1f", pi);
        System.out.println("merhaba");
    }
}
