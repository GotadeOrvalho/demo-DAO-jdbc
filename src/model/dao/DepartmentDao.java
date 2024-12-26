package model.dao;

import java.util.List;

import model.entities.Department;

public abstract class DepartmentDao {
	abstract void insert(Department obj);
	abstract void update(Department obj);
	abstract void deleteById(Integer id);
	abstract Department findById(Integer id);
	abstract List<Department> findAll();
}r
