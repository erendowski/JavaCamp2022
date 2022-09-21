import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String mesaj = "Bugun hava cok guzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayisi: "+mesaj.length());
        System.out.println("5.eleman: "+ mesaj.charAt(4));
        System.out.println(mesaj.concat("Yasasin!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith(" "));
        char[] chars = new char[5];
        mesaj.getChars(0,5,chars,0 );
        System.out.println(chars);
        System.out.println(mesaj.indexOf(' '));
        System.out.println(mesaj.lastIndexOf("l"));

        String yenimesaj = mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        System.out.println(yenimesaj.substring(2,5));

        for(String kelime :mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase(Locale.ROOT));
        System.out.println(mesaj.trim());
    }
}
