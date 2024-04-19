import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class StudentDAOProdImpl implements StudentDAO {

    static List<Student> dbStudents;

    static {
        dbStudents = new ArrayList<>();
        dbStudents.add(new Student(1, "Juan"));
        dbStudents.add(new Student(2, "Pedro"));
    }

    public StudentDAOProdImpl() {
    }

    public List<Student> getAllStudents() {
        return dbStudents;
    }

    public void addStudent(Student student) {
        dbStudents.add(student);
    }

    public void deleteStudent(int id) {
    }

    public void updateStudent(Student student) {

    }
}
