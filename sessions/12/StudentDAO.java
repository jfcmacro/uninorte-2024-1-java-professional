import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
}
