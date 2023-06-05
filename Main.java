package avtomatHOmeWorck3;

public class Main {
    public static void main(String[] args) {
        Product capushino = new Product("Capuch", 5, 55);
        Product latte = new Product("Latte", 8, 75);
        Product raf = new Product("Raf", 10, 65);
        
        WandingMashin wm = new WandingMashin();
        wm.addProduct(latte);
        wm.addProduct(raf);
        wm.addProduct(capushino);
        System.out.println(wm.getInfo());
        wm.sortByPrice();
        System.out.println(wm.getInfo());
        wm.sortByTempr();
        System.out.println(wm.getInfo());
    }
}
