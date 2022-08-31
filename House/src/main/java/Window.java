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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        if (width != window.width) return false;
        return height == window.height;
    }

    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }
}
