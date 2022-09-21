public class Main {

    public static void main(String[] args) {
	    String[][] cities = new String[2][2] ;
        cities[0][0] = " Istanbul ";
        cities[0][1] = " Bursa ";
        cities[1][0] = " Ankara ";
        cities[1][1] = " Konya ";
        for(int i = 0 ; i<=1 ;i++){
            System.out.println("---------------------");
            for(int k=0 ; k<=1 ; k++){
                System.out.println(cities[i][k]);
            }
        }

    }
}
