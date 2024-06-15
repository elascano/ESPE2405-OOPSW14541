package ec.edu.espe.objecttofile.view;

import ec.edu.espe.objecttofile.model.Car;
import ec.edu.espe.objecttofile.model.DeserializeCar;
import ec.edu.espe.objecttofile.model.SerializeCar;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abner Arboleda, LogicLegion, DCCO-ESPE
 *
 */
public class ObjectToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Car> cars = DeserializeCar.deserializeCars();

        cars.add(new Car("Nissan", "Corolla", 5, "Azul"));
        cars.add(new Car("Toyota", "Camry", 3, "Rojo"));

        SerializeCar.serializeCars(cars);
        List<Car> deserializedCars = DeserializeCar.deserializeCars();

        for (Car car : deserializedCars) {
            System.out.println(car);
        }
    }
}
