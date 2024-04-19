import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
            new AnnotationConfigApplicationContext(Config.class);
        StudentService studentService = context.getBean(StudentService.class);

        studentService.getAllStudents().stream()
            .forEach(System.out::println);

    }
}
