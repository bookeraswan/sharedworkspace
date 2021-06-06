import java.util.Scanner;

interface BookerTemplate{

    void hair(String x);
    void occupation(String c);
    void pet(String p);

}

public class Booker implements BookerTemplate{


    public static void main(String args[]){
        Booker obj = new Booker();
        obj.hair("Blue");
        obj.pet("Balls");
        obj.occupation("Stripper");
    }
    @Override
    public void hair(String x){
        System.out.println("bookers hair is:"+" "+x);
    }
    public void occupation(String c){
        System.out.println("Bookers occupation is:"+" "+c);
    }
    public void pet(String p){System.out.println("Bookers pet is:"+" "+p);};

  



}