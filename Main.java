public class Main {
    public static void main(String[] args) {

        //For döngüsü uygulaması.

        for (int i=0; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------");

        //While döngüsü uygulaması.

        int k=0;
        while (k<=10){
            System.out.println(k);
            k++;
        }

        System.out.println("-----------------------");

        //Ders soru-2 çözümü.

        for (int i=7; i<=77; i+=7) {
            System.out.println(i);
        }

        System.out.println("-----------------------");

        //Ders Soru-1 çözümü.

        int sum = 0;
        for (int i = 0, j = 0; i<5 || j<5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}