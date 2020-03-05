package ru.roden.springbootapp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.roden.springbootapp.model.Teacher;
import ru.roden.springbootapp.repository.TeacherRepo;

import java.util.List;

@Service
@Transactional
public class TeacherService {
    private TeacherRepo repo;

    public TeacherService(TeacherRepo repo) {
        this.repo = repo;
    }

    public void saveTeacher(Teacher teacher){
        repo.save(teacher);
    }

    public List<Teacher> getAll(){
        return repo.findAll();
    }

    public void rating(Integer id, boolean rate){
        Teacher teacher = repo.getOne(id);
        teacher.setRating(teacher.getRating() + (rate? 1 : -1));
        repo.save(teacher);
    }

    public Teacher getTeacherById(Integer id){
        return repo.getOne(id);
    }
}
