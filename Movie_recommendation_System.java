import java.util.Scanner;

public class Movie_recommendation_System{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age <= 17){
            System.out.println("comedy movies");
        }else if (age >= 18){
            System.out.println("Action movies");
        }
        sc.close();        
    }
}