package com.adev;

/**
 * Implements a controller in MVC that operates on the UserCart.
 */
public class StoreController {

    private final UserCart cart = new UserCart();

    public void addToCart(String item) {
        if (!cart.con(item)) {
            cart.add(item);
        }
    }

    public void removeFromCart(String item) {
        cart.remove(item);
    }
}
