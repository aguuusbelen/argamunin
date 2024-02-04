package argamunin.com.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// import responses.GameResponse;
// import services.GameService;

@RestController
public class GameController {

    // @Autowired
    // private GameService gameService;

    @GetMapping("/games")
    private String getGamesDetails() {
    	// List<GameResponse> games = gameService.getGames();
        // return ResponseEntity.status(HttpStatus.OK).body(games);
        return "LISTA DE JUEGOS";
    }
}