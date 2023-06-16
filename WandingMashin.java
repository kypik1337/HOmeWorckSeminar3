package avtomatHOmeWorck3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class WandingMashin<Product> implements Iterable<Product>{
    private List<Product> productList;
    // private int id; delete id products

    public WandingMashin(){
        productList = new ArrayList<Product>();
    }
    public void addProduct(Product prod){
        productList.add(prod);
    }
    @Override
    public Iterator<Product> iterator() {
       return new ProductIterator(productList);
    }
    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productList) {
            stringBuilder.append(product).append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByPrice(){
        productList.sort((Comparator<? super Product>) new CoffiComporatorPrice());
    }

    public void sortByTempr(){
        productList.sort((Comparator<? super Product>) new CoffiComporatorTemprich());
    }
   


}
