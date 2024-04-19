// POJO Plain Old Java Object

public class StudentBean {

    private String name;
    private int id;

    public StudentBean(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
