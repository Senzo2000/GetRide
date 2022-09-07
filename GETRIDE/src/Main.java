import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to GETRIDE APP ... your ride your choice.....");
        String services = "1:Request Ride\n"+
                "2:Offer ride\n"+
                "3.About us\n" +
                "0:Quite";

        System.out.println(services);

        while (true) {
            int num = sc.nextInt();


            if (num == 1) {
                Service.MENUE1();
            } else if (num == 2) {
                Service.MENU2();
            } else if (num == 3) {
                System.out.println("This is about us");
                Service.MENU3();
            } else if (num == 0) {
                System.out.println("Exiting from system");
                break;

            } else {
                System.out.println("Invalid input...");
                break;
            }


        }
    }
}
