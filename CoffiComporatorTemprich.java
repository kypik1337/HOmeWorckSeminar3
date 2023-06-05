package avtomatHOmeWorck3;

import java.util.Comparator;

public class CoffiComporatorTemprich implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getTempricha(), o2.getTempricha());
    }
    
}
