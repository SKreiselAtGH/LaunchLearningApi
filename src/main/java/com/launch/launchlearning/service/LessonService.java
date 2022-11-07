package com.launch.launchlearning.service;

import com.launch.launchlearning.model.LessonRepository;
import org.apache.coyote.Response;
import org.springframework.stereotype.Component;

@Component
public class LessonService {

    public LessonRepository getLessonById(Long id) {
        LessonRepository lesson = LessonRepository.builder().id(333333L).title("test").build();
        return lesson;
    }

    public Response createLesson(LessonRepository lesson) {
        LessonRepository lesson = LessonRepository.
    }
}
