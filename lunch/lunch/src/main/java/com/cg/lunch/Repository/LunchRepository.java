package com.cg.lunch.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.cg.lunch.Entity.Lunch;

	@Repository
	public interface LunchRepository  extends JpaRepository<Lunch, Long>{

	}
	
	
