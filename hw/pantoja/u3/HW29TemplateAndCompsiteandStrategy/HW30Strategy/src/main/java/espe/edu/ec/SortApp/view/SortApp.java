package espe.edu.ec.SortApp.view;

import espe.edu.ec.SortApp.controller.SortingContext;
import javax.swing.JOptionPane;

/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class SortApp {

    public static void main(String[] args) {
        FrmSortApp frame = new FrmSortApp();
        frame.setVisible(true);
    }

    // Method to start sorting process
    public static void startSorting(int[] data) {
        SortingContext sortingContext = new SortingContext();
        int[] sortedData = sortingContext.sort(data);

        // Display the sorted data
        JOptionPane.showMessageDialog(null, "Sorted Data: " + arrayToString(sortedData), "Sorted Result", JOptionPane.INFORMATION_MESSAGE);
    }

    // Helper method to convert array to string for displaying in JOptionPane
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }
}
