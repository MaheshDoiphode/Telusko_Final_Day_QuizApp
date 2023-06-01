package org.telusko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.telusko.entities.PlayerScore;
import org.telusko.services.PlayerScoreService;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class PlayerScoreController {

    private final PlayerScoreService playerScoreService;

    @Autowired
    public PlayerScoreController(PlayerScoreService playerScoreService) {
        this.playerScoreService = playerScoreService;
    }

    @GetMapping
    public ResponseEntity<List<PlayerScore>> getAllPlayerScores() {
        List<PlayerScore> playerScores = playerScoreService.getAllPlayerScores();
        return ResponseEntity.ok(playerScores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerScore> getPlayerScoreById(@PathVariable int id) {
        PlayerScore playerScore = playerScoreService.getPlayerScoreById(id);
        if (playerScore != null) {
            return ResponseEntity.ok(playerScore);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PlayerScore> addPlayerScore(@RequestBody PlayerScore playerScore) {
        PlayerScore addedPlayerScore = playerScoreService.addPlayerScore(playerScore);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedPlayerScore);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerScore> updatePlayerScore(@PathVariable int id, @RequestBody PlayerScore playerScore) {
        PlayerScore updatedPlayerScore = playerScoreService.updatePlayerScore(id, playerScore);
        if (updatedPlayerScore != null) {
            return ResponseEntity.ok(updatedPlayerScore);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerScore(@PathVariable int id) {
        boolean deleted = playerScoreService.deletePlayerScore(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
