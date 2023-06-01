package org.telusko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.telusko.entities.TechStack;

@Repository
public interface TechStackRepository extends JpaRepository<TechStack, Integer> {
    // Additional custom methods can be defined here if needed
}
