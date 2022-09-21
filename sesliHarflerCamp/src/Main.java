public class Main {

    public static void main(String[] args) {
        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'U':
            case 'O':
            case 'I':
                System.out.println("Kalin sesli harftir: " + harf);
                break;
            default:
                System.out.println("Ince sesli harftir: " + harf);
        }


    }
}
