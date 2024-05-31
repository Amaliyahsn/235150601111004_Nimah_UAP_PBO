import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Tanaman> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai (){
    
    }
    public static void menanam (){
        int pilih;
        do{
            System.out.println("1. Tomat");
            System.out.println("2. Stoberi");
            System.out.println("3. Persik");
        System.out.println("Pilih :");
        pilih = in.nextInt();
        switch (pilih) {
            case 1:
            
                break;
            case 2:
                
            case 3:
                break;
    }
} while (pilih != 0);

}
    
    public static void info(){
    }

}
