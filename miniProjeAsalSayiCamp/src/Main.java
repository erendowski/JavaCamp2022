public class Main {

    public static void main(String[] args) {
        int sayi = 2;
        boolean asalmi = true;
        if (sayi == 1) {
            System.out.println("Sayi asal degildir.");
            return;
        }

        if (sayi < 1) {
            System.out.println("Gecersiz sayi.");
        }


        System.out.println("Sayi = " + sayi);
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalmi = false;
            }
        }

        if (asalmi) {
            System.out.println("Sayi asaldir.");
        } else {
            System.out.println("Sayi asal degildir.");
        }

    }
}
