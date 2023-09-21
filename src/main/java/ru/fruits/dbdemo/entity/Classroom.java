package ru.fruits.dbdemo.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER)
    @JsonManagedReference //fix recursive json serialization (main entity)
    private List<Student> students;
}
