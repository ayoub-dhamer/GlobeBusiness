package tn.globebusiness.spring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.Entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	    public Category findByName(String categoryName);
	    
	    @Query("select c from Category c order by c.name Asc")
	    List<Category> findAllCategories();
	    
}
