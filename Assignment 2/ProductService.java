import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }
    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

    public List<Product> getProductText(String text){
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str)){
                prods.add(p);
            }
        }
        return prods;
    }

    public List<Product> getProductsByPlace(String place_text){
        String str = place_text.toLowerCase();
        List<Product> places = new ArrayList<>();

        for(Product p : products){
            String place = p.getPlace().toLowerCase();
            if(place.equals(str)){
                places.add(p);
            }
        }
        return places;
    }

    public List<Product> getProdswithOutofWarranty(int cutoff){
        List<Product> out_warranty = new ArrayList<>();

        for(Product p : products){
            if(p.getWarranty() < cutoff){
                out_warranty.add(p);
            }
        }
        return out_warranty;

    }

    public Stream<Product> getProductwithStream(String text){
        String str = text.toLowerCase();

        products.stream().filter(p -> {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();

            return name.contains(str) || type.contains(str) || place.contains(str);
        })
                .forEach(System.out::println);
        return null;
    }


    public Stream<Product> getPlaceofProductwithStreamAPI(String text){
        String str = text.toLowerCase();

        products.stream().filter(p -> {
            String place = p.getPlace().toLowerCase();

            return place.equals(str);
        })
                .forEach(System.out::println);
        return null;
    }

}
