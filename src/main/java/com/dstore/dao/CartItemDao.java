package com.dstore.dao;

import com.dstore.entity.CartItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemDao {

    CartItem save(CartItem cartItem);

    CartItem findById(Long id);

    List<CartItem> findByCartId(Long cartId);

    List<CartItem> findAll();

    void deleteById(Long id);
}