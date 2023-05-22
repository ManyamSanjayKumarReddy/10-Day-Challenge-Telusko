import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        ProductService service = new ProductService();

        // Add the Products
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        // After Adding the products in the service get all the products using the below given Method
        System.out.println("Get all the Products in the Inventory :");
        List<Product> products =  service.getAllProducts();
        // Enhanced For Loop
        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("==========================================================================");
        System.out.println("Get a Particular Product :");

        Product Name = service.getProduct("Type C");
        System.out.println(Name);

        System.out.println("==========================================================================");
        System.out.println("Get a Particular text in the Inventory :");

        List<Product> prods = service.getProductText("black");
        for(Product product : prods){
            System.out.println(product);
        }

        System.out.println("==========================================================================");
        System.out.println("Get a Particular Product from it's Place :");

        List<Product> prods_place = service.getProductsByPlace("Shelf");
        for(Product place : prods_place){
            System.out.println(place);
        }

        System.out.println("==========================================================================");
        System.out.println("Get all the Products that are out or warranty :");

        List<Product> Out_Warranty = service.getProdswithOutofWarranty(2023);
        for(Product warranty : Out_Warranty){
            System.out.println(warranty);
        }

        System.out.println("==========================================================================");
        System.out.println("---------------------Implementing with Stream API------------------------");
        System.out.println("Get a Particular Product using Stream API :");

        Stream<Product> data = service.getProductwithStream("Keyboard");

        System.out.println("==========================================================================");
        System.out.println("Get all Products with place using Stream API :");

        Stream<Product> places_data = service.getPlaceofProductwithStreamAPI("Black Drawer");


    }
}
