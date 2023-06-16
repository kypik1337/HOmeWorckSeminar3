package avtomatHOmeWorck3;

public class Main {
    public static void main(String[] args) {
        // Product capushino = new Product("Capuch", 5, 55);
        // Product latte = new Product("Latte", 8, 75);
        // Product raf = new Product("Raf", 10, 65);
        
        WandingMashin wm = new WandingMashin();
        RedactorWandingMashin addw = new RedactorWandingMashin();
        
        wm.addProduct(new Product("Latte", 8, 75));
        wm.addProduct(new Product("Raf", 10, 65));
        wm.addProduct(new Product("Capuch", 5, 55));
        System.out.println(wm.getInfo());
        wm.sortByPrice();
        System.out.println(wm.getInfo());
        wm.sortByTempr();
        System.out.println(wm.getInfo());

    }
}
