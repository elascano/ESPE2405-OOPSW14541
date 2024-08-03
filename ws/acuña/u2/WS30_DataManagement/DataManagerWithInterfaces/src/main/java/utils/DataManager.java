package utils;

import java.util.ArrayList;

/**
 *
 * @author ChelooWs
 */
public interface DataManager {
    String DATABASENAME ="oop";
    
    public abstract void create(String data, String collection);
    public abstract void update(String collection, String oldData, String newData);
    public abstract ArrayList<String> read(String collection);
    public abstract void delete(String collection, String searchData);
    
    
}
