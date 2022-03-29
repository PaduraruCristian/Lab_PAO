package Product;

import java.util.ArrayList;
import java.util.Comparator;

class PriceComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        return Float.compare(p1.getPrice(), p2.getPrice());
    }
}

class NameComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductName().compareTo(p2.getProductName());
    }
}

class CategoryComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCategory().compareTo(p2.getCategory());
    }
}


public class Product {
    private static int productCount;
    private final int productId;
    private float price;
    private String productName;
    private ProductCategory category;


    static {
        productCount = 0;
    }

    public Product(float price, String productName, ProductCategory category) {
        this.productId = ++ Product.productCount;
        this.price = price;
        this.productName = productName;
        this.category = category;
    }

    public Product(Product p){
        this.productId = p.productId;
        this.price = p.price;
        this.productName = p.productName;
        this.category = p.category;
    }


    public float getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setPrice(float price) {
        if (price >0)
            this.price = price;
        else
            System.out.println("Can't set the price to a negative value");
    }

    public String getProductName() {
        return productName;
    }


}
