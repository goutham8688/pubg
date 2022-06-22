package com.cg.lunch;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.lunch.Entity.Lunch;
import com.cg.lunch.Repository.LunchRepository;

@SpringBootTest
class LunchApplicationTests {

	@Autowired
	LunchRepository lunchRepo;
	@Test
	@Order(1)
	void testAddLunch() {
		Lunch lunch=new Lunch();
		lunch.setDish_cost(50f);
		lunch.setDish_name("Lays");
		lunch.setDish_id(3L);
		lunch.setDish_description("Spicy and crunchy");
		lunchRepo.save(lunch);
		assertNotNull(lunchRepo.findById(3L).get());
	}
	@Test
	@Order(2)
	void testUpdate() {
		Lunch lunch=lunchRepo.findById(3L).get();
		lunch.setDish_cost(60f);
		lunch.setDish_description("Spicy");
		lunchRepo.save(lunch);
		assertNotEquals("Spicy and crunchy",lunchRepo.findById(3L).get().getDishDescription());
	}
	@Test
	@Order(3)
	void testDelete() {
		lunchRepo.deleteById(3L);
		assertThat(lunchRepo.existsById(3L)).isFalse();
	}
	
	@SuppressWarnings("unchecked")
	@Test
	@Order(4)
	void testReadAll() {
		List list=lunchRepo.findAll();
		assertThat(list).size().isPositive();
	}
	@Test
	@Order(5)
	void testRead() {
		Lunch lunch=lunchRepo.findById(1L).get();
		assertEquals("chips",lunch.getDishName());
	}

}
