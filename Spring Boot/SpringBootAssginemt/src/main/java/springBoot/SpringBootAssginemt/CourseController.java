package springBoot.SpringBootAssginemt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retriveAllCourse(){
        return Arrays.asList(
                new Course(1 , "Aakash" , "Chetan Baghat") ,
                new Course(2 , "Roopak" , "Vishal Arora"),
                new Course(3 , "SpringBootWeb" , "Iaa")
        ) ;
    }
}