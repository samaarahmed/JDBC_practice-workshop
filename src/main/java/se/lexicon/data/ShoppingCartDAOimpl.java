package se.lexicon.data;

import se.lexicon.model.ShoppingCart;

import java.util.List;
import java.util.Optional;

public class ShoppingCartDAOimpl implements ShoppingCartDAO{
    private List<ShoppingCart> shoppingCartList;
    @Override
    public ShoppingCart save(ShoppingCart cart) {
        if (id)
        return null;
    }

    @Override
    public Optional<ShoppingCart> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<ShoppingCart> findAll() {
        return null;
    }

    @Override
    public List<ShoppingCart> findByOrderStatus(Boolean Status) {
        return null;
    }

    @Override
    public List<ShoppingCart> findByReference(String customer) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
