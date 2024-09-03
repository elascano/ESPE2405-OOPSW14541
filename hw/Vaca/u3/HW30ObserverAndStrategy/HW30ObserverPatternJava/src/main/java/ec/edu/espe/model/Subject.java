
package ec.edu.espe.model;

/**
 *
 * @author MSI-PULSE
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
