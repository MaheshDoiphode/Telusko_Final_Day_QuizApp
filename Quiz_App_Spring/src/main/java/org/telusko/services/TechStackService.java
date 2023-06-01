package org.telusko.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telusko.entities.TechStack;
import org.telusko.repositories.TechStackRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TechStackService {

    private final TechStackRepository techStackRepository;

    @Autowired
    public TechStackService(TechStackRepository techStackRepository) {
        this.techStackRepository = techStackRepository;
    }

    public List<TechStack> getAllTechStacks() {
        return techStackRepository.findAll();
    }

    public TechStack getTechStackById(int id) {
        Optional<TechStack> optionalTechStack = techStackRepository.findById(id);
        return optionalTechStack.orElse(null);
    }

    public TechStack addTechStack(TechStack techStack) {
        return techStackRepository.save(techStack);
    }

    public TechStack updateTechStack(int id, TechStack techStack) {
        techStack.setId(id);
        return techStackRepository.save(techStack);
    }

    public void deleteTechStack(int id) {
        techStackRepository.deleteById(id);
    }
}
