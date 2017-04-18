package java.pos.model;

import java.util.List;

public interface Receipt<T> {

    void add(T item);

	Double getSum();

	List<T> getAll();
}
