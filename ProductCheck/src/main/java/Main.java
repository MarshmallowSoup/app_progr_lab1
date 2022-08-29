public class Main {
    public int priceOfAll(Storage[] storage, int amount){
        int fullSum = 0;
        for(int i = 0; i < amount; i++){
            int sum = storage[i].fullPrice();
            fullSum += sum;
        }
        return  fullSum;
    }
    public void main(String[] args) {
        int n = 5;
        Storage[] Check;
        Check = new Storage[n];
        //int i = 0;
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println("Product No: " + i1);
            Check[i1]  = new Storage();
            Check[i1].inputStorage();
        }
        System.out.println("=====Check=====");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product No: " + i);
            Check[i].printStorage();
        }

        int allPrice = priceOfAll(Check, n);
        System.out.println("Product No: " + allPrice);
    }
}
