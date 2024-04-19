import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(".")
public class Config {

    // @Bean
    // public StudentDAO getStudentDAO() {
    //     // return new StudentDAOProdImpl();
    //     return new StudentDAODevImpl();
    // }

    // @Bean
    // public StudentService getStudentService() {
    //     return new StudentServiceImpl();
    // }
}
