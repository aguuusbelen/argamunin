package argamunin.com.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import argamunin.com.backend.responses.GameResponse;
import argamunin.com.backend.service.GameService;


@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    private ResponseEntity<List<GameResponse>> getGamesDetails() {
    	List<GameResponse> games = gameService.getGames();
        return ResponseEntity.status(HttpStatus.OK).body(games);
    }
}