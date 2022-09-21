public class Main {

    public static void main(String[] args) {
	    int [] sayilar = new int[]{1,3,35,46,73,6,6789,};
        int aranan = 46;
        boolean varMi= false;

        for(int sayi : sayilar){
            if(sayi == aranan){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayi dizinin icinde vardir.");

        }else{
            System.out.println("Sayi dizinin icinde yoktur.");
        }
    }
}
