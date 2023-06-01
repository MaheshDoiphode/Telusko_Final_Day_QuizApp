package org.telusko.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telusko.entities.PlayerScore;
import org.telusko.repositories.PlayerScoreRepository;

import java.util.List;

@Service
public class PlayerScoreService {

    private final PlayerScoreRepository playerScoreRepository;

    @Autowired
    public PlayerScoreService(PlayerScoreRepository playerScoreRepository) {
        this.playerScoreRepository = playerScoreRepository;
    }

    public List<PlayerScore> getAllPlayerScores() {
        return playerScoreRepository.findAll();
    }

    public PlayerScore getPlayerScoreById(int id) {
        return playerScoreRepository.findById(id).orElse(null);
    }

    public PlayerScore addPlayerScore(PlayerScore playerScore) {
        return playerScoreRepository.save(playerScore);
    }

    public PlayerScore updatePlayerScore(int id, PlayerScore playerScore) {
        PlayerScore existingPlayerScore = playerScoreRepository.findById(id).orElse(null);
        if (existingPlayerScore != null) {
            playerScore.setId(id);
            return playerScoreRepository.save(playerScore);
        } else {
            return null;
        }
    }

    public boolean deletePlayerScore(int id) {
        PlayerScore existingPlayerScore = playerScoreRepository.findById(id).orElse(null);
        if (existingPlayerScore != null) {
            playerScoreRepository.delete(existingPlayerScore);
            return true;
        } else {
            return false;
        }
    }
}
