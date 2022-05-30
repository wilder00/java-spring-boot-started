//DAO means Data Access Object
package com.example.herokudemo.dao;


import com.example.herokudemo.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryDao extends CrudRepository<Category, Long> {

}
