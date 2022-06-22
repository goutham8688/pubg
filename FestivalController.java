package com.cg.festival.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.festival.Entity.Festival;
import com.cg.festival.Service.FestivalService;

@RestController
@RequestMapping("/festival")
public class FestivalController {

	@Autowired
	private FestivalService festivalService;

	// Adding Festival Details in to Table
	@PostMapping("/addFestival")
	private Festival addFestival(@RequestBody Festival festival) {
		return festivalService.addFestival(festival);
	}

	// Getting Festival details using ID
	@GetMapping("/festivaltable/{id}")
	private ResponseEntity<Festival> getFestivalById(@PathVariable("id") Long id) {
		Festival festival = festivalService.getFestivalDetailsById(id);
		return new ResponseEntity<>(festival, HttpStatus.OK);
		// return repo.findById(id);
	}

	// Getting All festival details
	@GetMapping("/festivaltable")
	private List<Festival> getAllFestivalDetails() {
		return festivalService.getAllFestival();
	}

	// Deleting Specific festival using Id
	@DeleteMapping("/deletefestival/{id}")
	private String deleteFestival(@PathVariable("id") long id) {
		festivalService.deleteFestival(id);
		return "Festival Deleted Successfuly";
	}
	@PutMapping("/update-fest")
	public Festival updateFestival(@RequestBody Festival festival) {
		return festivalService.updateFestival(festival);
	}

}
