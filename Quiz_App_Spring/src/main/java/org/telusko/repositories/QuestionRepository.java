    package org.telusko.repositories;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    import org.telusko.entities.Question;

    @Repository
    public interface QuestionRepository extends JpaRepository<Question, Integer> {
        // Additional custom methods can be defined here if needed
    }
