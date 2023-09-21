package ru.fruits.dbdemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.fruits.dbdemo.entity.Classroom;
import ru.fruits.dbdemo.repository.ClassroomRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassroomService {
    private final ClassroomRepository repository;

    public List<Classroom> findAllClassrooms() {
        return repository.findAll();
    }
}
