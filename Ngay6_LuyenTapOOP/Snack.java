package Ngay6_LuyenTapOOP;

public class Snack extends Product{
    private int weight;

    public Snack(){}

    public Snack(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String description() {
        return "Ten san pham: " + getName() +"\n"
                +"Gia san pham: " + getPrice() +"\n"
                +"Can nang (g) : " + weight;
    }
}
