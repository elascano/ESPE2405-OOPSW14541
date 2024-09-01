
package ec.edu.espe.model;

/**
 *
 * @author MSI-PULSE
 */
public interface Observer {
    void update(String stockSymbol, double stockPrice);
}
