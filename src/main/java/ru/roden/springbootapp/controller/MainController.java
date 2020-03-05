package ru.roden.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.roden.springbootapp.model.Teacher;
import ru.roden.springbootapp.service.TeacherService;

import java.time.LocalDate;

@Controller
public class MainController {
    private TeacherService service;

    public MainController(TeacherService service) {
        this.service = service;
    }

    @PostMapping("/addTeacher")
    public String addTeacher(@RequestParam(name = "name") String name,
                            @RequestParam(name = "surname") String surname,
                            @RequestParam(name = "age") String age,
                            @RequestParam(name = "url") String url){
        Teacher teacher = new Teacher(name, surname);
        LocalDate bornDate = LocalDate.now().minusYears(Integer.parseInt(age));
        teacher.setPhotoURL(url);
        teacher.setRating(0);
        teacher.setBornYear(bornDate.getYear());
        service.saveTeacher(teacher);
        return "index";
    }


    @GetMapping("/getAll")
    public String getAll(ModelMap model){
        model.addAttribute("thisYear", LocalDate.now().getYear());
        model.addAttribute("all", service.getAll());
        return "all";
    }

    @GetMapping("/vote/{id}")
    public String voting(@PathVariable ("id") Integer id,
                         ModelMap modelMap){
        Teacher teacher = service.getTeacherById(id);
        modelMap.addAttribute("teacher", teacher);
        return "vote";
    }
}
