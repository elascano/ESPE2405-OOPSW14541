import ec.edu.espe.controller.MazeController;
import ec.edu.espe.model.Maze;
import ec.edu.espe.model.Room;
import ec.edu.espe.view.MazeView;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear cuartos
        Room room1 = new Room(Arrays.asList(), 4);
        Room room2 = new Room(Arrays.asList(), 4);

        // Crear puerta conectando room1 y room2
        Door door = new Door(room1, room2);

        // Añadir la puerta a los cuartos
        room1.setDoors(Arrays.asList(door));
        room2.setDoors(Arrays.asList(door));

        // Lista de cuartos
        List<Room> rooms = Arrays.asList(room1, room2);
        
        // Lista de puertas
        List<Door> doors = Arrays.asList(door);

        // Crear laberinto con la lista de cuartos, entrada, salida, puertas y número de paredes
        Maze maze = new Maze(rooms, room1, room2, doors, 8);

        // Crear vista y controlador
        MazeView view = new MazeView();
        MazeController controller = new MazeController(maze, view);

        // Mostrar el laberinto
        controller.updateMaze(maze);

        // Mostrar un mensaje
        controller.showMessage("Maze has been updated!");
    }
}
