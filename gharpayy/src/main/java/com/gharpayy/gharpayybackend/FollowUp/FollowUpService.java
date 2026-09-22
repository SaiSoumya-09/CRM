package com.gharpayy.gharpayybackend.FollowUp;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FollowUpService {

    private final FollowUpRepository repository;

    public FollowUpService(FollowUpRepository repository) {
        this.repository = repository;
    }

    public FollowUp create(FollowUp followUp) {
        return repository.save(followUp);
    }

    public List<FollowUp> getAll() {
        return repository.findAll();
    }
}
