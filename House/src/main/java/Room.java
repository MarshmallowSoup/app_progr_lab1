public class Room{
    private String name;  //types: Bedroom, Cabinet, Corridor, Armory
    private int priceSqMeter;
    private int width;
    private int length;
    private Furniture bed;
    private Furniture wardrobe;
    private Furniture table;
    private Furniture safe;
    private Window[] windows;
    private Door entry;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Door getEntry() {
        return entry;
    }

    public void setEntry(Door entry) {
        this.entry = entry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceSqMeter() {
        return priceSqMeter;
    }

    public void setPriceSqMeter(int priceSqMeter) {
        this.priceSqMeter = priceSqMeter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Furniture getBed() {
        return bed;
    }

    public void setBed(Furniture bed) {
        this.bed = bed;
    }

    public Furniture getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Furniture wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Furniture getTable() {
        return table;
    }

    public void setTable(Furniture table) {
        this.table = table;
    }

    public Furniture getSafe() {
        return safe;
    }

    public void setSafe(Furniture safe) {
        this.safe = safe;
    }

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }


    public Room(){
        this.name = "";
        this.entry = new Door();
        this.priceSqMeter = 0;
        this.width = 10;
        this.length = 8;
        this.bed = new Furniture();
        this.wardrobe = new Furniture();
        this.table = new Furniture();
        this.safe = new Furniture();
        this.windows = new Window[0];
    }

    public Room( String name) {
        if(name == "Bedroom"){
            this.entry = new Door("RoomDoor");
            this.name = name;
            this.priceSqMeter = 100;
            this.width = 10;
            this.length = 8;
            this.bed = new Furniture("Bed");
            this.wardrobe = new Furniture("Wardrobe");
            this.table = new Furniture();
            this.safe = new Furniture();
            this.windows = new Window[2];
            for(int i = 0; i < windows.length; i++){
                windows[i] = new Window(3, 4);
            }}else if(name == "Cabinet"){
                this.entry = new Door("RoomDoor");
                this.name = name;
                this.priceSqMeter = 75;
                this.width = 6;
                this.length = 8;
                this.bed = new Furniture();
                this.wardrobe = new Furniture();
                this.table = new Furniture("Table");
                this.safe = new Furniture();
                this.windows = new Window[1];
                for(int i = 0; i < windows.length; i++){
                    windows[i] = new Window(2, 5);
                }}else if(name == "Corridor"){
                    this.entry = new Door("EntranceDoor");
                    this.name = name;
                    this.priceSqMeter = 50;
                    this.width = 4;
                    this.length = 12;
                    this.bed = new Furniture();
                    this.wardrobe = new Furniture("Wardrobe");
                    this.table = new Furniture();
                    this.safe = new Furniture();
                    this.windows = new Window[1];
                    for(int i = 0; i < windows.length; i++){
                        windows[i] = new Window(4, 4);
                    }}else if(name == "Armory"){
                        this.entry = new Door("ArmoredDoor");
                        this.name = name;
                        this.priceSqMeter = 200;
                        this.width = 4;
                        this.length = 5;
                        this.bed = new Furniture();
                        this.wardrobe = new Furniture();
                        this.table = new Furniture();
                        this.safe = new Furniture("Safe");
                        this.windows = new Window[0];
        }
        }

        public int roomSquare(){
            return this.length * this.width;
        }
        public int roomPrice(){
            int floorPrice = this.roomSquare() * this.priceSqMeter;
            int windowsPrice = 0;
            for(int i = 0; i < windows.length; i++){
                windowsPrice += windows[i].windowPrice();
            }
            int furniturePrice = this.bed.getPrice()+ this.wardrobe.getPrice() + this.table.getPrice() +this.safe.getPrice();
            int result = floorPrice + windowsPrice + furniturePrice + entry.getPrice();
            return result;
        }

        public Room createRoom(){
            Room obj = new Room();
            return obj;
        }

        public Room createCustomRoom(){
            Room obj = new Room();
            return obj;
        }
        public void printRoom(){
            System.out.println("Name: " + this.getName());
            System.out.println("Square: " + this.roomSquare());
            System.out.println("Door: " + this.entry.getType());
            System.out.println("Furniture: " + this.bed.getName() + " " + this.wardrobe.getName() + " " + this.table.getName() + " " + this.safe.getName());
            System.out.println("Window Size: " + this.windows[0].getWidth() + "x" + this.windows[0].getHeight());
            System.out.println("Total Price: " + this.roomPrice());
        }

    }

