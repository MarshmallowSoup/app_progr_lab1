public class Door {
    private String type;    //Types: RoomDoor, EntranceDoor, ArmoredDoor
    private int price;


    public Door (){
        this.type = "";
        this.price = 0;
    }
    public Door(String type) {
        if(type == "RoomDoor"){
            this.type = "RoomDoor";
            this.price = 400;
        } else if(type == "EntranceDoor"){
            this.type = "EntranceDoor";
            this.price = 600;
        } else if(type == "ArmoredDoor"){
            this.type = "ArmoredDoor";
            this.price = 1000;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        if (price != door.price) return false;
        return type != null ? type.equals(door.type) : door.type == null;
    }


    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
