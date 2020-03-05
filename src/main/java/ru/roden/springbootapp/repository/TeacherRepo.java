package ru.roden.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.roden.springbootapp.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
