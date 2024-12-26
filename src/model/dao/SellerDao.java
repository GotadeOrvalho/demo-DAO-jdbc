package model.dao;

import java.util.List;

import model.entities.Seller;

public abstract class SellerDao {
	abstract void insert(Seller obj);
	abstract void update(Seller obj);
	abstract void deleteById(Integer id);
	abstract Seller findById(Integer id);
	abstract List<Seller> findAll();
}
