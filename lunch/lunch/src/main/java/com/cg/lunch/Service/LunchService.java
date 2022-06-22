package com.cg.lunch.Service;
import java.util.List;

import com.cg.lunch.Entity.Lunch;

public interface LunchService{
	public Lunch addLunch(Lunch lunch);
	public Lunch updateLunch(Lunch lunch);
	public Lunch getLunchDetailsById(Long dish_id);
	public List<Lunch> getAllLunch();
	public void deleteLunch(Long dish_id);

}

           


	
	




