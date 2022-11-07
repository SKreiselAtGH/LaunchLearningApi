package com.launch.launchlearning.controller;

import com.launch.launchlearning.model.LessonRepository;
import com.launch.launchlearning.service.LessonService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lesson")
public class Lesson {

    @Autowired LessonService lessonService;

    @GetMapping("/{id}")
    public LessonRepository getLessonById(@PathVariable("id") Long id) {
        return lessonService.getLessonById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response createLesson(@RequestBody LessonRepository lesson) {
        return lessonService.createLesson(lesson);
    }
}
