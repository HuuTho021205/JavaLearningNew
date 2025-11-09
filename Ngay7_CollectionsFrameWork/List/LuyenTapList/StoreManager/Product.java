package Ngay7_CollectionsFrameWork.List.LuyenTapList.StoreManager;
/*Tạo lớp Product: Gồm 3 thuộc tính: String name, double price, String category*/
public class Product    {
    private String name;
    private  double price;
    private String category;

    public Product(String category,String name , double price) {
        this.category = category;
        this.price = price;
        this.name = name;
    }
    public Product(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
