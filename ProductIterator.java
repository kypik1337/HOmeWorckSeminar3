package avtomatHOmeWorck3;

import java.util.Iterator;
import java.util.List;

public class ProductIterator implements Iterator<Product>{
    private List<Product> productList;
    private int index;

    public ProductIterator(List<Product> productList) {
        this.productList = productList;
    }
    
    @Override
    public boolean hasNext() {
        return index < productList.size();
    }

    @Override
    public Product next() {
        return productList.get(index++);
    }

    

    
    
}
