package control;

import java.util.ArrayList;

public interface InterfaceControllerCrud {
    
    int add(Object objeto);

    void remove(int id);

    void altera(int id, Object objeto);

    Object get(int id);

    ArrayList getAll();
    
    Object valida(Object objeto);
    
}
