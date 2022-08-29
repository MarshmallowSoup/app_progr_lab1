public class Main {
    public static void main(String[] args){
        double num = 7.7;
        CustomDouble newObj = new CustomDouble(num);
        System.out.println(newObj.getIntPart());
        System.out.println(newObj.getDoublePart());

    }

}
