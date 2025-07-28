package companies.ncs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Create the 'GroceryReceipt' class that extends GroceryReceiptBase above.
/*
*    Given map of fruits containing fruitName and fruit prices
*    Given map of discounts containing fruitName and discount percentage(10) , it means 10% discount
*    Given list of fruits added to the cart(purchased)
*
*    Calculate the final price to be paid for the baf of items added
*/
public class GroceryReceipt extends GroceryReceiptBase{
    List<Grocery>  groceriesList = new ArrayList<>();

    public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts){
        super(prices, discounts);
    }
    public List<Grocery> Calculate(List<Node> shoppingList) {
        for (Node fruitNode : shoppingList) {
            double price = (double)getPrices().get(fruitNode.fruit);
            double totalPrice = fruitNode.count*price;
            double finalPrice;
            Integer discount = getDiscounts().get(fruitNode.fruit);
            if(discount != null) {
                finalPrice = (double)totalPrice * (double)discount/100d;
            } else {
                finalPrice = (double)totalPrice;
            }
            groceriesList.add(new Grocery(fruitNode.fruit, price, finalPrice));
        }

        return groceriesList;
    }
}



class Grocery {
    String fruit;
    double price, total;
    Grocery(String fruit, double price, double total) {
        this.fruit = fruit;
        this.price = price;
        this.total = total;
    }
}

class Node{
    String fruit;
    int count;
    Node(String fruit, int count){
        this.fruit = fruit;
        this.count = count;
    }
}
abstract class GroceryReceiptBase {
    private Map<String, Double> prices;
    private Map<String, Integer> discounts;

    public GroceryReceiptBase(Map<String, Double> prices, Map<String, Integer> discounts) {
        this.prices = prices;
        this.discounts = discounts;
    }

    public abstract List<Grocery> Calculate(List<Node> shoppingList);

    public Map<String, Double> getPrices() {
        return prices;
    }

    public Map<String, Integer> getDiscounts() {
        return discounts;
    }
}

class Solution
{
    public static void main(String[] args) throws IOException
    {

        List<Node> boughtItems = new ArrayList<>();
        Map<String, Double> prices = new HashMap<>();
        Map<String, Integer> discounts = new HashMap<>();
        prices.put("Apple",100d);
        prices.put("Orange",200d);

        discounts.put("Orange", 10);

        boughtItems.add(new Node("Apple", 2));
        GroceryReceipt g = new GroceryReceipt(prices, discounts);
        List<Grocery> result = g.Calculate(boughtItems);
        for (Grocery x : result)
        {
            System.out.printf("%s %.1f %.1f\n", x.fruit, x.price, x.total);
        }
    }
}

