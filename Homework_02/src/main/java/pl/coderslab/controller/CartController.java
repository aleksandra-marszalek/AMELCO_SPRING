package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;

import java.util.List;
import java.util.Random;

@Controller
@SessionAttributes("cart")
public class CartController {

    @Autowired
    private Cart cart;

    @GetMapping("/addtocart")
    public String addToCart(Model model) {

        return "addToCart";
    }

    @PostMapping("/addedtocart")
    public String addedToCart(@RequestParam(name="productName") String productName, @RequestParam(name="quantity") int quantity,
                              @RequestParam(name="productPrice") double productPrice) {
        Product product = new Product(productName, productPrice);
        CartItem cartItem = new CartItem(quantity, product);
        cart.addCartItem(cartItem);
        return "redirect: addtocart";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }

    @GetMapping ("/removecart")
    public String removeCart(@RequestParam(name="id") int id) {
        CartItem itemToChange = cart.getCartItems().get(id-1);
            cart.removeCartItem(itemToChange);
            return "cart";
    }

    @GetMapping ("/addMore")
    public String addMore(@RequestParam(name="id") int id) {
        CartItem itemToChange = cart.getCartItems().get(id-1);
        itemToChange.setQuantity(itemToChange.getQuantity()+1);
        return "cart";
    }

    @GetMapping ("/removeOne")
    public String removeOne(@RequestParam(name="id") int id) {
        CartItem itemToChange = cart.getCartItems().get(id-1);
        itemToChange.setQuantity(itemToChange.getQuantity()-1);
        return "cart";
    }



}
