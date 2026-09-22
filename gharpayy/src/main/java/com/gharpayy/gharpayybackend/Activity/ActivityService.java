package com.gharpayy.gharpayybackend.Activity;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository repository;

    public ActivityService(ActivityRepository repository) {
        this.repository = repository;
    }

    public Activity create(Activity activity) {
        return repository.save(activity);
    }

    public List<Activity> getAll() {
        return repository.findAll();
    }
}