import java.util.Scanner;

public class Storage {
    private Product newProduct;
    private int amount;

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int fullPrice(){
        int sum = newProduct.getPrice() * amount;
        return sum;
    }

    public void inputStorage(){
        this.newProduct = new Product();
        newProduct.inputProduct();
        Scanner in = new Scanner(System.in);
        System.out.println("Amount of product: ");
        int amount = in.nextInt();
        setAmount(amount);
    }

    public String printStorage(){
        return newProduct.printProduct() + "\n" + "Amount: " + getAmount();
    }
}