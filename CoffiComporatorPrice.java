package avtomatHOmeWorck3;

import java.util.Comparator;

public class CoffiComporatorPrice implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
    
}
