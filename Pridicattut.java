import java.util.function.Predicate;
public class Pridicattut {
   public static void main(String[] args) {

    
    
   } 
    
}
// Predicate Chaining (Filtering)
// Scenario: You are building a filter for an e-commerce product list. You have a Product class with category, price, and rating.

// Task: Create three separate Predicate<Product> instances:

// isElectronics: Checks if the category is "Electronics".

// isCheap: Checks if the price is less than $100.

// isTopRated: Checks if the rating is above 4.5.
class Product{
    String category;
    double price;
    double rating;

    public Product(String category, double price, double rating) {
        this.category = category;
        this.price = price;
        this.rating = rating;
    }
}
class FilteringProd {
    Predicate<Product>isElectronics=(cat)->{
        return cat.category.equals("Electronics");
    };
    Predicate<Product>isCheap=(prc)->{
        return prc.price<100;
    };
    Predicate<Product>isTopRated=(rat)->{
        return rat.rating>4.5;
    };
    
}