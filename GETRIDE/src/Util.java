import java.util.Scanner;

public class Util {

    public static String enterString(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;


    }

    public static String fillInfo(){
        String nameSurname = enterString("Enter your name and surname ");
        String email = enterString("Enter your E- mail address");
        String phoneNumber = enterString("Enter your phone Number");
        String destination = enterString("Where do you want to go ? ");

        return "Full Name: "+ nameSurname + "\nE- mail: "+ email +"\nPhoneNumber: "+  phoneNumber + "\nDestination: "+ destination;
    }

    public static int enterInteger(String title){
        System.out.println(title);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        return answer;
    }

    public static String fillTripInfo(){
        String location = enterString("Enter location ");
        int passenger  = enterInteger("How many passengers will you travel ?");
        String time  = enterString("Enter time");
        String requiers = enterString("Enter requires : Example (NO SMOKING!!!)");

        return "Your Destination from " + location + " with " + passenger + " passengers with these requires " + requiers + " in "+ time;


    }
}
