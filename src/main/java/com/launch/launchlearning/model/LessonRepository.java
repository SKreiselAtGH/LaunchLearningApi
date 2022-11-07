package com.launch.launchlearning.model;
import com.launch.launchlearning.controller.Lesson;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Repository
@Builder
public class LessonRepository extends JPARepository<Lesson, String>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private ContentRepository contentRepository;

    private boolean available;
    private LessonTopicRepository topic;
    private FileTypeRepository fileTypeRepository;
    private boolean archived;
    private boolean currentLesson;
}
