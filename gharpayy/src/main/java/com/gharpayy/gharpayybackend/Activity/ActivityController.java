package com.gharpayy.gharpayybackend.Activity;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityService service;

    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @PostMapping
    public Activity create(@RequestBody Activity activity) {
        return service.create(activity);
    }

    @GetMapping
    public List<Activity> getAll() {
        return service.getAll();
    }
}