import java.util.ArrayList;
import java.util.List;

public class mango_shopping {
    public static void main(String[] args) {
        List<String> mangoVarrities = new ArrayList<>();
        mangoVarrities.add("chaunsa");
        mangoVarrities.add("sindhri");
        mangoVarrities.add("langra");
        mangoVarrities.add("Dussehri");

        double[] mangoPrices = {300.0,250.0,350.0,400.0,200.0};
        Boolean[] inStock = {true,true,false,true,true};

        double budget = 1000;
        
        System.out.println("Mango shopping spree during mango season!");
        System.out.println("-------------------------------------------------");

        for (int i = 0;i< mangoVarrities.size();i++){
            if(!inStock[i] || mangoPrices[i] > budget){
                System.out.println(mangoVarrities.get(i)+" is out of stock or too expensive! Skippng... Looks like jins got to them try agian later.");
                continue;
            }

            budget -= mangoPrices[i];
            System.out.println("You bought "+mangoVarrities.get(i)+" for "+mangoPrices[i]+ " PKR ");
        }
        System.out.println("------------------------------------------------");
        System.out.println("Finished Shopping Remaining budget"+ budget +" PKR");
    }
}