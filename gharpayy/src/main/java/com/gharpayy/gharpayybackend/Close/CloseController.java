package com.gharpayy.gharpayybackend.Close;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/close")
public class CloseController {

    private final CloseService service;

    public CloseController(CloseService service) {
        this.service = service;
    }

    @PostMapping
    public Close create(@RequestBody Close close) {
        return service.create(close);
    }

    @GetMapping
    public List<Close> getAll() {
        return service.getAll();
    }
}
