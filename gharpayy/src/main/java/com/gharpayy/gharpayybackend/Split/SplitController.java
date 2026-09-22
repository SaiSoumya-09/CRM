package com.gharpayy.gharpayybackend.Split;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/splits")
public class SplitController {

    private final SplitService service;

    public SplitController(SplitService service) {
        this.service = service;
    }

    @PostMapping
    public Split create(@RequestBody Split split) {
        return service.create(split);
    }

    @GetMapping
    public List<Split> getAll() {
        return service.getAll();
    }
}
