import java.util.Scanner;

public class main {
    public static void run(){
        Scanner scanın=new Scanner(System.in);
        Scanner scanst=new Scanner(System.in);


        System.out.println("EmployeeID Giriniz=");
        int a=scanın.nextInt();
        String b=String.valueOf(a);
        int boy=b.length();
        if(a<=0 || boy!=6 ){
            System.out.println("Girilen deger sıfırdan kücük veya alti haneli dişindadir");
            a=100000;

        }
        System.out.println("brachinizi giriniz=");
        String br=scanst.nextLine();
        if(br.length()==0){
            br="UNKOWN";

        }
        System.out.println("isminizi giriniz=");
        String c=scanst.nextLine();
        if(c.length()==0){
            c="UNKOWN";

        }
        System.out.println("soyisminizi giriniz=");
        String d=scanst.nextLine();
        if(d.length()==0){
            d="UNKOWN";

        }
        System.out.println("maasinizi  giriniz=");
        String k=scanst.nextLine();
        double ms;
        if(k.length()==0){
            k="12000";
            ms=Double.valueOf(k);

        }else {

            ms=Double.valueOf(k);
        }


        Engineer e1=new Engineer(a,br,c,d,ms);
        Engineer e2=new Engineer(a,br,c,d);
        e1.ShowInfos();


    }
    public static void main(String[] args) {
        run();

    }
}