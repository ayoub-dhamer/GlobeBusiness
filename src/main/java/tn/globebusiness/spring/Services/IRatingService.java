package tn.globebusiness.spring.Services;

import java.util.List;

import tn.globebusiness.spring.Entities.Rating;

public interface IRatingService {
	
	public Rating addRating(Rating rate);
	public void deleteRating(int rateId);
	public List<Rating> listAllRatings();
	public Rating updateRating(Rating rate);
	public Rating listRating(int RateId);

}
