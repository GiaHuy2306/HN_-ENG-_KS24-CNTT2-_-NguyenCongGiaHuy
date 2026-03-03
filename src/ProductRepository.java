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
        return false;
    }

    @Override
    public Product findById(String id) {
        if (productMap.containsKey(id)) {
            System.out.println("San pham tim duoc la: " + productMap.get(id).getName());
            return productMap.get(id);
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
