package se.lexicon.data;

import se.lexicon.model.Product;

import java.util.Optional;
import java.util.List;

public class ProductDAOimpl implements ProductDAO{

private List<Product> products;

    @Override
    public Product save(Product product) {
        for (Product p:products) {
            if(product.getId()==0) {
                products.add(product);
            }
            else if (product.getId()>0)
            {
                products.contains(product); //update function?
            }
        }
        return product;
    }

    @Override
    public Optional<Product> findById(int id) {
        return Optional.empty();                    //Todo
    }

    @Override
    public List<Product> findAll() {
        return ;
    }

    @Override
    public List<Product> findByName(String name) {
        return null;
    }

    @Override
    public List<Product> findByPriceBetween(double low, double high) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

}
