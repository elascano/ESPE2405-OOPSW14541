/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.classdiagramandguidesign;

/**
 *
 * @author G406
 */
public class ClassDiagramAndGUIDesign {

        ProductController controller = new ProductController();
        ProductView view = new ProductViewImpl(controller);
}
