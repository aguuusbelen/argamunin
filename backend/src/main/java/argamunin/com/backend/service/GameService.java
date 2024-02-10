package argamunin.com.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import argamunin.com.backend.entitys.Game;
import argamunin.com.backend.repositories.GameRepository;
import argamunin.com.backend.responses.GameResponse;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
	
    @Autowired
    private ModelMapper mapper;
 
    public List<GameResponse> getGames() {
    	List<String> images = new ArrayList<String>();
    	images.add("url_image");
    	Game game = new Game(1, "Crazy Space Ships", images, "description_game");
    	createGame(game);
    	// getAllGames();
        // Optional<Game> employee = employeeRepo.findById(id);
        // GameResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
    	List<GameResponse> gameResponses = new ArrayList<>();
    	GameResponse game01 = new GameResponse(0, "Crazy Space Ships");
    	GameResponse game02 = new GameResponse(0, "Infinite Puzzle");
    	gameResponses.add(game01);
    	gameResponses.add(game02);
        return gameResponses;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Integer id) {
        return gameRepository.findById(id).orElse(null);
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public void deleteGameById(Integer id) {
    	gameRepository.deleteById(id);
    }
}
