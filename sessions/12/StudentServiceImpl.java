import java.util.List;

// import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

// @Service
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
}
