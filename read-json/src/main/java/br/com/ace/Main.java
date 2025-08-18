package br.com.ace;

import br.com.ace.entities.Course;
import br.com.ace.entities.Lesson;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());


        File jsonFile = new File("C:\\Users\\Luis Henrique\\Desktop\\DEV\\Projects\\java-playgroud\\read-json\\src\\main\\resources\\file.json");
        List<Course> courses = objectMapper.readValue(jsonFile, new TypeReference<List<Course>>() {});

        for(Course course : courses){
            System.out.println(course.getId());

            List<Lesson> lessons = course.getLessons();

            for (Lesson lesson : lessons){
                System.out.println(lesson.toString());
            }
        }

    }
}
