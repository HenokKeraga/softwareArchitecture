package edu.mu.demo.service;
import edu.mu.demo.dao.ShoppingCartRepository;
import edu.mu.demo.model.Item;
import edu.mu.demo.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart addItemInShoppingCart(Integer id,Item item) {
        ShoppingCart shoppingCart=shoppingCartRepository.findById(id).get();
        shoppingCart.getItems().add(item);
        shoppingCartRepository.deleteById(shoppingCart.getShoppingCartId());
        shoppingCartRepository.insert(shoppingCart) ;
        return shoppingCartRepository.findById(shoppingCart.getShoppingCartId()).get();
    }

    public ShoppingCart getShoppingCart(Integer id) {
        return shoppingCartRepository.findById(id).get();
    }
}
