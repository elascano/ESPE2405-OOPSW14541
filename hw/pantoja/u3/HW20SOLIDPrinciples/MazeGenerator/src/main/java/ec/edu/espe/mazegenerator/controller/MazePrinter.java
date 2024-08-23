
package ec.edu.espe.mazegenerator.controller;

import ec.edu.espe.mazegenerator.model.Maze;

/**
 *
 * @author David Pantoja, JavaSquad DCCO-ESPE
 */
public interface MazePrinter {
    void printMazeInASCII(Maze maze);
    void printMazeInPNG(Maze maze);
}
