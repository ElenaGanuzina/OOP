package Project.db;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E> {
    protected List<E> elements;

    protected Table(){
        this.elements = new ArrayList<>();
    }

    public E save(E entity){
        elements.add(entity);
        return entity;
    }
}
