package com.gharpayy.gharpayybackend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commitments")
@CrossOrigin(origins = "*")
public class CommitmentController {

    private final CommitmentRepository repository;

    public CommitmentController(CommitmentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Commitment> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Commitment create(@RequestBody Commitment commitment) {
        return repository.save(commitment);
    }
}
