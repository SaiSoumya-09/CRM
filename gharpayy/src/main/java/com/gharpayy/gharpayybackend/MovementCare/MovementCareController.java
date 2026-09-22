package com.gharpayy.gharpayybackend.MovementCare;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/movement-care")
public class MovementCareController {

    private final MovementCareService service;

    public MovementCareController(MovementCareService service) {
        this.service = service;
    }

    @PostMapping
    public MovementCare create(@RequestBody MovementCare movementCare) {
        return service.create(movementCare);
    }

    @GetMapping
    public List<MovementCare> getAll() {
        return service.getAll();
    }
}
