package max;

public class Commodity {
    private String name;
    private int height;
    private int weight;
    private int width;

    public Commodity(String name, int height, int weight, int width) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public Commodity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }
}
