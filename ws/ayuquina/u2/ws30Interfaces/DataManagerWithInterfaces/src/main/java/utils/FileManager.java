package utils;

/**
 *
 * @author Danny Ayuquina, LogicLegion, DCCO-ESPE
 */
public interface FileManager extends DataManager {

    public abstract void openFile(String fileName);

    public abstract void closeFile(String fileName);

}
