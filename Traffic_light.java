import java.util.Scanner;

public class Traffic_light {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of the traffic light: ");
        String color = sc.next().toLowerCase();
        switch (color){
            case "red":
            System.out.println("Ruk jaa.");
            break;
            case "yellow":
            System.out.println("Tayari kar le.");
            break;
            case "green":
            System.out.println("CHAl NIKAL!");
            default :
            System.out.println("INVALID INPUT! ");
        }
        sc.close();
    }
}