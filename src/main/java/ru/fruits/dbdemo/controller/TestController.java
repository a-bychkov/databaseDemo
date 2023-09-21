package ru.fruits.dbdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fruits.dbdemo.entity.Classroom;
import ru.fruits.dbdemo.service.ClassroomService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
    private final ClassroomService service;

    @GetMapping
    public List<Classroom> test() {
        List<Classroom> result = service.findAllClassrooms();

        return result;
    }
}
