package argamunin.com.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import argamunin.com.backend.responses.GameResponse;



@Service
public class GameService {

	/*
    @Autowired
    private EmployeeRepo employeeRepo;
 	*/
	
    @Autowired
    private ModelMapper mapper;
    
    public List<GameResponse> getGames() {
        // Optional<Game> employee = employeeRepo.findById(id);
        // GameResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
    	List<GameResponse> gameResponses = new ArrayList<>();
    	GameResponse game01 = new GameResponse(0, "Crazy Space Ships");
    	GameResponse game02 = new GameResponse(0, "Infinite Puzzle");
    	gameResponses.add(game01);
    	gameResponses.add(game02);
        return gameResponses;
    }
}
