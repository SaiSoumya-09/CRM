package com.gharpayy.gharpayybackend.Close;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CloseService {

    private final CloseRepository repository;

    public CloseService(CloseRepository repository) {
        this.repository = repository;
    }

    public Close create(Close close) {
        return repository.save(close);
    }

    public List<Close> getAll() {
        return repository.findAll();
    }
}
