import java.util.Arrays;

public class House{
    private int roomAmount;
    private Room[] rooms;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (roomAmount != house.roomAmount) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(rooms, house.rooms);
    }

    public int hashCode() {
        int result = roomAmount;
        result = 31 * result + Arrays.hashCode(rooms);
        return result;
    }

    public int getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public House(int roomAmount) {
        this.roomAmount = roomAmount;
        this.rooms = new Room[roomAmount];
    }

    public void createRooms(){
        System.out.println("You have " + getRoomAmount() + " rooms");
        for(Room room : this.rooms) room = room.createRoom();
    }

    public int housePrice(){
        int house = 0;
        for(Room room : this.rooms) {
            house += room.roomPrice();
        }
        return house;
    }

    public String[] housePrint(){
        String[] house = new String[this.roomAmount];
        for (int i = 0; i < this.roomAmount; i++){
            house[i] = this.rooms[i].printRoom();
        }
        return house;
    }
}
