package com.gharpayy.gharpayybackend.FollowUp;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/follow-ups")
public class FollowUpController {

    private final FollowUpService service;

    public FollowUpController(FollowUpService service) {
        this.service = service;
    }

    @PostMapping
    public FollowUp create(@RequestBody FollowUp followUp) {
        return service.create(followUp);
    }

    @GetMapping
    public List<FollowUp> getAll() {
        return service.getAll();
    }
}
