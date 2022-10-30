import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {


        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] notlar = {0,0,0,0,0,0};
        int toplam=0;
        float ortalama=0;


        Scanner scanner=new Scanner(System.in);

        for (int i=0;i< dersler.length;i++){
            System.out.println(dersler[i]+" notunuz:");
            notlar[i]=scanner.nextInt();
            toplam=toplam+notlar[i];
        }

        ortalama=toplam/ (float)dersler.length;

        System.out.println(ortalama);
        String yazi = ortalama>60?("Sınıfı Geçti"):("Sınıfta kaldı");
        System.out.println(yazi);
    }
}
