package com.digitalinnovationone.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.digitalinnovationone.springwebmvc.model.Jedi;

@Repository
public class JediRepository {

	private List<Jedi> jedis;
	
	public JediRepository() {
		jedis = new ArrayList<>();
		jedis.add(new Jedi("Luke", "Skywalker"));
	}
	
	public List<Jedi> getAllJedi() {		
		return jedis;
	}
	
	public void createJedi(final Jedi jedi) {
		jedis.add(jedi);
	}
}
