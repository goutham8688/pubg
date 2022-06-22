package com.cg.lunch.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lunch.Entity.Lunch;
import com.cg.lunch.Service.LunchService;


@RestController
@RequestMapping("/lunch")
public class LunchController {
	@Autowired
	private LunchService lunchService;
	
	//Adding dish Details into LunchTable
	@PostMapping("/add-dish")
	public Lunch addLunch(@RequestBody Lunch lunch)
	{
		return lunchService.addLunch(lunch);
	}
	
	
	
	//Getting dish details by ID
	@GetMapping("/GetDish/{id}")
	public Lunch getLunchDetails(@PathVariable("id") Long id)
	{
		return lunchService.getLunchDetailsById(id);
	}
	
	
	
	//Getting All Dish details 
	@GetMapping("/lunch-list")
	public List<Lunch> getAllLunchDetails()
	{
		return lunchService.getAllLunch();
	}
	
	
	
	//Deleting dish by Id
	@DeleteMapping("/DeleteDish/{id}")
	public String deleteLunch(@PathVariable("id") Long id)
	{
		if(id!=0)
		lunchService.deleteLunch(id);
		return "Dish Deleted From Lunch Table";
	}
	
	
	//Updating  dish by Id
	@PutMapping("/UpdateDish/{id}")
	public String updateLunch(@PathVariable("id") long id,@RequestBody Lunch lunch)
	{
		if(id!=0)
			{
			lunchService.updateLunch(lunch);
			return "Details updated.";
			}
		return "Invalid Dish ID";
		
	}
	
}
