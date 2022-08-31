public class Furniture {
    private String name; // names only can be: Bed, Wardrobe, Table, Safe
    private int price;
    private int height;
    private int width;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    public int getLength() {return length;}

    public void setLength(int length) {this.length = length;}


    public Furniture() {
        this.name = "";
        this.price = 0;
        this.height = 0;
        this.width = 0;
        this.length = 0;
    }

    public Furniture(String name) {
        this.name = name;
        if(name == "Bed"){
            this.name = "Bed";
            this.price = 250;
            this.height = 1;
            this.width = 2;
            this.length = 4;
        }else if(name == "Wardrobe"){
            this.name = "Wardrobe";
            this.price = 400;
            this.height = 4;
            this.width = 4;
            this.length = 2;
        }else if(name == "Table"){
            this.name = "Table";
            this.price = 200;
            this.height = 4;
            this.width = 2;
            this.length = 2;
        }else if(name == "Safe"){
            this.name = "Safe";
            this.price = 500;
            this.height = 4;
            this.width = 1;
            this.length = 1;
        }
    }

    public int furnitureSquare(){return width * length;}

    public int furnitureVolume(){return height * width * length;}



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Furniture furniture = (Furniture) o;

        if (price != furniture.price) return false;
        if (height != furniture.height) return false;
        if (width != furniture.width) return false;
        if (length != furniture.length) return false;
        return name != null ? name.equals(furniture.name) : furniture.name == null;
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + height;
        result = 31 * result + width;
        result = 31 * result + length;
        return result;
    }
}
