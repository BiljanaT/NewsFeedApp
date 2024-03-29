package com.biljana.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biljana.demo.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

}
