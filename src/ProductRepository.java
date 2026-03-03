import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository implements IRepository<Product> {
    private ArrayList<Product> products;
    HashMap<String, Product> productMap;


    @Override
    public boolean add(Product item) {
        return false;
    }

    @Override
    public boolean removeById(String id) {
        for (Product item : products) {
            if (item.getId().equals(id)) {
                products.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                System.out.println("San pham tim thay la: " +product.getName());
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
