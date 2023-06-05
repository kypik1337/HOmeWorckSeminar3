package avtomatHOmeWorck3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WandingMashin implements Iterable<Product>{
    private List<Product> productList;
    // private int id;

    public WandingMashin(){
        productList = new ArrayList<>();
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
        productList.sort(new CoffiComporatorPrice());
    }

    public void sortByTempr(){
        productList.sort(new CoffiComporatorTemprich());
    }
   


}
