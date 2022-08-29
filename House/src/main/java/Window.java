public class Window {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public Window() {
        this.width = 0;
        this.height = 0;
    }

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int windowSquare(){return height * width;}

    public int windowPrice(){return windowSquare()*50;}

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
