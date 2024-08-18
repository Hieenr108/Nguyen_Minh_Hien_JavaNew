import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Mobile m = new Mobile();
    static ArrayList<Mobile> dsMB = new ArrayList<>();
    //
    public static void main(String[] args) {
        fakeData();
        inThongTin();
    }

    public static void fakeData(){
        Mobile m1 = new Mobile("SamSung", 8, "123", "Phone", 120000,3);
        dsMB.add(m1);
        Mobile m2 = new Mobile("Bphone", 16, "124", "Phone", 140000,4);
        dsMB.add(m2);
        Mobile m3 = new Mobile("Vivo", 32, "125", "Phone", 130000,6);
        dsMB.add((m3));
        Mobile m4 = new Mobile("Oppo", 64, "126", "Phone", 160000,5);
        dsMB.add(m4);
        Mobile m5 = new Mobile("Apple", 128, "127", "Phone", 100000,7);
        dsMB.add(m5);
    }



    public static void inThongTin(){
        for(Mobile mb: dsMB) {
            System.out.println(mb.toString());
        }
    }

}