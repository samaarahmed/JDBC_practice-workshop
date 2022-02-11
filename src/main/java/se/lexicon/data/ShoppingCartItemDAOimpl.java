package se.lexicon.data;

import se.lexicon.data.ShoppingCartItemDAO;
import se.lexicon.model.ShoppingCart;
import se.lexicon.model.ShoppingCartItem;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ShoppingCartItemDAOimpl implements ShoppingCartItemDAO {


    private String URL = "mysql://localhost:3306/[shopping_practice]?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Europe/Berlin";
    private String USER = "root";
    private String PASSWORD = "1234";

    @Override
    public ShoppingCartItem save(ShoppingCartItem cart) {
        return null;
    }

    @Override
    public Optional<ShoppingCartItem> findById(int id) {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultsetSCI = null;
        ResultSet resultsetP = null;
        ResultSet resultsetSC = null;

        ShoppingCartItem shoppingCartItem = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement("SELECT * FROM shopping_cart_item WHERE id = ?");
            statement.setInt(1, id);
            resultsetSCI = statement.executeQuery();

            while(resultsetSCI.next()){

                resultsetSCI.getInt("id"),
                        resultsetSCI.getInt("amount"),
                        resultsetSCI.getDouble("total_price"),
                        resultsetSCI.getInt("product_id"),
                        resultsetSCI.getInt("shopping_cart_id")

            }

            connection.prepareStatement("SELECT * FROM product WHERE id = ?");
            statement.setInt(1, id);
            resultsetP = statement.executeQuery();
            while(resultsetP.next()){

            }

            connection.prepareStatement("SELECT * FROM shopping_cart WHERE id = ?");
            statement.setInt(1, id);
            resultsetSC = statement.executeQuery();
            while(resultsetSC.next()){

            }

            shoppingCartItem = new ShoppingCartItem(resultsetSCI + resultsetP + resultsetSC);



        } catch (SQLException e) {
            e.printStackTrace();
        }


        return Optional.ofNullable(shoppingCartItem);
    }

    @Override
    public List<ShoppingCartItem> findAll() {
        return null;
    }

    @Override
    public List<ShoppingCartItem> findByCartId(int id) {
        return null;
    }

    @Override
    public List<ShoppingCartItem> findByProductId(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
