package com.cg.lunch.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lunch.Entity.Lunch;
import com.cg.lunch.Repository.LunchRepository;
import com.cg.lunch.exception.EmptyInputException;

@Service
public class LunchServiceImp  implements LunchService{

	@Autowired
	private LunchRepository repo;
	
	@Override
	public Lunch addLunch(Lunch lunch) {
		if(lunch.getDishName().isEmpty())
		{
			throw new EmptyInputException("Some of the field is empty, Please fill all the field properly");
		}
		
	
		return repo.saveAndFlush(lunch);
	}
	public Lunch updateLunch(Lunch lunch) {
		Long dish_id=lunch.getDishId();
		Lunch lun=repo.findById(dish_id).get();
		lun.setDish_cost(lunch.getDishCost());
	    return repo.save(lun);
	}
	@Override
	public Lunch getLunchDetailsById(Long dish_id) {
		
		return repo.findById(dish_id).orElseThrow();
	}
	@Override
	public List<Lunch> getAllLunch() {
		return repo.findAll();
	}
	@Override
	public void deleteLunch(Long dish_id) {
		repo.deleteById(dish_id);
		
	}
	
}

	







