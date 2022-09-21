public class Main {

    public static void main(String[] args) {
        double[] myList = {7.5, 8.4, 9.6, 5.2, 12.21};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En buyuk sayi: " + max);
    }
}
