public class CustomDouble {
    private int intPart;
    private double doublePart;


    public CustomDouble(){
        this.intPart = 0;
        this.doublePart = 0;
    }

    public CustomDouble(int numerator, double denominator) {
        this.intPart = numerator;
        this.doublePart = denominator;
    }

    public CustomDouble(CustomDouble obj){
        this.intPart = obj.intPart;
        this.doublePart = obj.doublePart;
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public CustomDouble sum(CustomDouble obj){
        double sum =  this.toDouble() + obj.toDouble();
        CustomDouble result = new CustomDouble(sum);
        return result;
    }

    public CustomDouble subtraction(CustomDouble obj){
        double subtraction = this.toDouble() - obj.toDouble();
        CustomDouble result = new CustomDouble(subtraction);
        return result;
    }
    public CustomDouble multiplication (CustomDouble obj){
        double multiplication =  this.toDouble() * obj.toDouble();
        CustomDouble result = new CustomDouble(multiplication);
        return result;
    }

    public CustomDouble division(CustomDouble obj){
        double division =  this.toDouble() / obj.toDouble();
        CustomDouble result = new CustomDouble(division);
        return result;
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