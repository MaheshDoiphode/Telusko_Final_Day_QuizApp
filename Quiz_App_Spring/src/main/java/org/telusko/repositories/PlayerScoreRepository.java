package org.telusko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telusko.entities.PlayerScore;

@Repository
public interface PlayerScoreRepository extends JpaRepository<PlayerScore, Integer> {
}
