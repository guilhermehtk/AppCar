package model.dao;

import java.util.ArrayList;

public interface InterfaceDao {
   
   int add(Object objeto);
   
   void remove(int id);
   
   void altera(int id, Object objeto);
   
   Object get(int id);
   
   ArrayList getAll();
      
}
