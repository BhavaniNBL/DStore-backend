package com.dstore.dao;

import com.dstore.entity.Cart;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartDao {

    Cart save(Cart cart);

    Optional<Cart> findById(Long id);

   // Cart findByUser(User user);

    List<Cart> findAll();

    void deleteById(Long id);
}