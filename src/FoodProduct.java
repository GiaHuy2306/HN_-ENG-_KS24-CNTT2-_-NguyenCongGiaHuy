public class FoodProduct extends Product{
    private int discountPersent;

    public FoodProduct(String id, String name, double price, int discountPersent) {
        super(id, name, price);
        this.discountPersent = discountPersent;
    }

    @Override
    public double calculateFinalPrice() {
        double priceAfterDiscount = getPrice() - (getPrice() * discountPersent / 100);
        return priceAfterDiscount;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Discount persent: " + discountPersent);
    }
}
