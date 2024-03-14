import java.util.List;

public abstract Decorator<T> implements List<T> {
    List<T> lista;

    public Decorator() {
        list = new ArrayList<>();
    }

    public List<T> getCompoment {
        return lista;
    }

    @Override
    public void add(T e) {
        list.add(e);
    }

    // Defini
}
