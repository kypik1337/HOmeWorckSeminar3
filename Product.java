package avtomatHOmeWorck3;

import java.util.List;

public class Product {
    private String nameCoffy;
    private int price;
    private int tempricha;
    private List<Product> productList;
    public Product(String nameCoffy, int price, int tempricha) {
        this.nameCoffy = nameCoffy;
        this.price = price;
        this.tempricha = tempricha;
    }
    public void getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productList) {
            stringBuilder.append(product).append("\n");
        }
    }
    
    public String getNameCoffy() {
        return nameCoffy;
    }
    public void setNameCoffy(String nameCoffy) {
        this.nameCoffy = nameCoffy;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getTempricha() {
        return tempricha;
    }
    public void setTempricha(int tempricha) {
        this.tempricha = tempricha;
    }

    @Override
    public String toString() {
        return "Product [name Coffy = " + nameCoffy + 
        ", price = " + price + 
        ", tempricha = " + tempricha + "]";
    }
    

    
}
