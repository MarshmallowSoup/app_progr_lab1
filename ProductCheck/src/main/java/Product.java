import java.util.Scanner;

public class Product {
    private String productName;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    Product(){
        productName = "";
        price = 0;
    }

    public void inputProduct(){
        Scanner in = new Scanner(System.in);
        System.out.println("Name of product: ");
        String name = in.next();
        System.out.println("Price of product: ");
        int price = in.nextInt();
        setProductName(name);
        setPrice(price);
    }

    public void printProduct(){
        System.out.println("Name of product: " + getProductName());
        System.out.println("Price of product: " + getPrice());
    }
}
