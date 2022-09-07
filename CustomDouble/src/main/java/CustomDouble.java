public class CustomDouble {
    private int intPart;
    private double doublePart;


    public CustomDouble(){
        this.intPart = 0;
        this.doublePart = 0;
    }

    public CustomDouble(int intPart, double doublePart) {
        this.intPart = intPart;
        if (doublePart < 1){
            this.doublePart = doublePart;
        }else {
            System.out.println("Double part must be less than 1!!");
        }
    }

    public CustomDouble(double obj){
        this.intPart = (int)obj;
        this.doublePart = obj - this.intPart;
    }


    public int getIntPart() {
        return intPart;
    }

    public void setIntPart(int intPart) {
        this.intPart = intPart;
    }

    public double getDoublePart() {
        return doublePart;
    }

    public void setDoublePart(double doublePart) {
        this.doublePart = doublePart;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomDouble that = (CustomDouble) o;

        if (intPart != that.intPart) return false;
        return Double.compare(that.doublePart, doublePart) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = intPart;
        temp = Double.doubleToLongBits(doublePart);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public CustomDouble add(CustomDouble obj){
        double sum =  this.toDouble() + obj.toDouble();
        CustomDouble result = new CustomDouble(sum);
        return result;
    }

    public CustomDouble subtract(CustomDouble obj){
        double subtraction = this.toDouble() - obj.toDouble();
        CustomDouble result = new CustomDouble(subtraction);
        return result;
    }
    public CustomDouble multiply(CustomDouble obj){
        double multiplication =  this.toDouble() * obj.toDouble();
        CustomDouble result = new CustomDouble(multiplication);
        return result;
    }

    public CustomDouble divide(CustomDouble obj){

        if(obj.toDouble() == 0){
            CustomDouble result = new CustomDouble(0);
            System.out.println("You can't divide by zero!!!");
            return result;
        }
        else{
            double division =  this.toDouble() / obj.toDouble();
            CustomDouble result = new CustomDouble(division);
            return result;
        }
    }

    public double toDouble(){
        double result = this.intPart + this.doublePart;
        return result;
    }

    public boolean isEqual(CustomDouble obj){return this.toDouble() == obj.toDouble();}

    public boolean isBigger(CustomDouble obj){
        return this.toDouble() > obj.toDouble();
    }

    public boolean isLess(CustomDouble obj){
        return this.toDouble() < obj.toDouble();
    }

    public boolean equalOrBigger(CustomDouble obj){
        return this.isEqual(obj) || this.isBigger(obj);
    }

    public boolean equalOrLess(CustomDouble obj){
        return this.isEqual(obj) || this.isLess(obj);
    }


}