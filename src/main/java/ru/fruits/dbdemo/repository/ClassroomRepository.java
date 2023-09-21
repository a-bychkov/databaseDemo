package ru.fruits.dbdemo.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fruits.dbdemo.entity.Classroom;

import java.util.List;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    @EntityGraph(attributePaths = {"students"})
    List<Classroom> findAll();
}
