package com.gharpayy.gharpayybackend.MovementCare;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovementCareService {

    private final MovementCareRepository repository;

    public MovementCareService(MovementCareRepository repository) {
        this.repository = repository;
    }

    public MovementCare create(MovementCare movementCare) {
        return repository.save(movementCare);
    }

    public List<MovementCare> getAll() {
        return repository.findAll();
    }
}