import java.util.LinkedList;

public class Service {
    public static void MENUE1(){
        System.out.println("Finding ride");
        String info = Util.fillInfo();
        System.out.println(info);
        String city = Util.enterString("Which city do you want to visit ? ");
        String UpperCity = city.toUpperCase();
        System.out.println("Checking destinations for " + UpperCity);
        Cities CC = new Cities();
        LinkedList<String> list = CC.getList();
        if (list.contains(UpperCity)){
            System.out.println("There are available trips for "+ UpperCity+"...");
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);




        }
        else {
            System.out.println("There are no availabe trips \there are the active trips");
            LinkedList<String> list1 = CC.getList();
            for( String s : list1){
                System.out.println(s);
            }

        }
    }


    public static void MENU2(){
        System.out.println("Offering ride");
        String tripInfo = Util.fillTripInfo();
        System.out.println(tripInfo);
        String carType = Util.enterString("Enter the Type of car you would like ");
        String placeTo = Util.enterString("Where do you want to ride? ");
        String currentLocal = Util.enterString("Enter your current location ? ");
        int capacity = Util.enterInteger("How many passengers are you carrying ? ");
        String requiers = Util.enterString("Enter requires : Example (NO SMOKING!!!)");
        System.out.println("Car type " +carType+ "From "+currentLocal + " to" +placeTo+ " with "+ capacity+" capacity   passengers and with these requirements " + requiers);

    }
    public static void MENU3(){
        System.out.println("GetRide is a software application that \nOffers rides\nRequest rides\nDeveloped and Built in SA....");
    }
}
