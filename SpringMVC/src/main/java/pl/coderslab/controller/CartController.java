package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Cart;
import pl.coderslab.model.CartItem;
import pl.coderslab.model.Product;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
@SessionAttributes("cart")
public class CartController {

    @Autowired
    private Cart cart;

    @GetMapping("/addtocart")
    public String addToCart(Model model) {
        Random rand = new Random();
        Product prod = new Product("prod"+rand.nextInt(10), rand.nextDouble());
        CartItem cartItem = new CartItem(rand.nextInt(5), prod);
        cart.addCartItem(cartItem);

        model.addAttribute("cartItem", cartItem);
        return "addToCart";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("cart", cart);
        return "cart";
    }



}
