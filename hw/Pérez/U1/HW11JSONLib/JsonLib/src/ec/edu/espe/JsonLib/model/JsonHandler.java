package ec.edu.espe.JsonLib.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonHandler<T> {

    private final Gson gson;
    private final String filePath;
    private final Type listType;

    public JsonHandler(String filePath, Class<T> clazz) {
        this.filePath = filePath;
        this.listType = TypeToken.getParameterized(List.class, clazz).getType();
        this.gson = new GsonBuilder().setPrettyPrinting().create(); 
    }

    public List<T> readJson() {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeJson(List<T> objects) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(objects, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addObject(T object) {
        List<T> objects = readJson();
        objects.add(object);
        writeJson(objects);
    }

    public void updateObject(T object, int index) {
        List<T> objects = readJson();
        if (index >= 0 && index < objects.size()) {
            objects.set(index, object);
            writeJson(objects);
        }
    }
}

