package com.gharpayy.gharpayybackend.Split;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SplitService {

    private final SplitRepository repository;

    public SplitService(SplitRepository repository) {
        this.repository = repository;
    }

    public Split create(Split split) {
        return repository.save(split);
    }

    public List<Split> getAll() {
        return repository.findAll();
    }
}