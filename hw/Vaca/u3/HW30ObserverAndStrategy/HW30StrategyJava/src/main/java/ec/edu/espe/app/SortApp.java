
package ec.edu.espe.app;

import ec.edu.espe.controller.SortController;
import ec.edu.espe.model.SortModel;
import ec.edu.espe.view.SortView;

/**
 *
 * @author MSI-PULSE
 */
public class SortApp {
    public static void main(String[] args) {
        SortView view = new SortView();
        int[] numbers = view.getInputNumbers();

        SortModel model = new SortModel(numbers);
        SortController controller = new SortController(model, view);

        controller.sortNumbers();
    }
}
