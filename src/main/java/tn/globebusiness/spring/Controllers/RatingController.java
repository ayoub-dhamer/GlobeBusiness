package tn.globebusiness.spring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.globebusiness.spring.Entities.Category;
import tn.globebusiness.spring.Entities.Event;
import tn.globebusiness.spring.Entities.Rating;
import tn.globebusiness.spring.Services.ICategoryService;
import tn.globebusiness.spring.Services.IRatingService;

@RestController
public class RatingController {
	
	@Autowired
	IRatingService ratingService;
	
	@PostMapping("AddRating")
	public void addRating(@RequestBody Rating rating){
		ratingService.addRating(rating);
	}
	
	@DeleteMapping("deleteRating/{ratingId}")
	public boolean deleteRating(@PathVariable("ratingId") Integer ratingId) {
		ratingService.deleteRating(ratingId);
		return true;
	}
	
	@GetMapping("ListAllRatings")
	public List<Rating> listAllRatings(){
		return ratingService.listAllRatings();
	}
	
	@PutMapping("updateRating")
	public Rating updateRating(@RequestBody Rating rating) {
		return ratingService.updateRating(rating);
	}
	/*
	@GetMapping("ListCategory/{categoryName}")
	public Category listCategory(@PathVariable("categoryName") String categoryName) {
		return ratingService.listCategory(categoryName);
	}*/

}
