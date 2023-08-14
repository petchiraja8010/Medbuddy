package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Users.Product;

@Repository
public interface Repo extends JpaRepository<Product,Integer>{


}
