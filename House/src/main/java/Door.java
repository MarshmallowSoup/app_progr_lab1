public class Door {
    private String type;    //Types: RoomDoor, EntranceDoor, ArmoredDoor
    private boolean isOpen;
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


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
