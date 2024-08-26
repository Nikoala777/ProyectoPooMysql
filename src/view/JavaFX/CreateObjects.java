package view.JavaFX;

import controller.implement.Item;
import controller.services.ServicesJavaFX;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

public class CreateObjects {
    
    private Random random = new Random();

    public Group createRoomWithBoxes() {
        Group room = createRoom(ServicesJavaFX.getRoomSeleccionada().getBase(), ServicesJavaFX.getRoomSeleccionada().getAltura(), ServicesJavaFX.getRoomSeleccionada().getProfundidad());

        List<Box> items = new ArrayList<>();
        for (Item item: ServicesJavaFX.getItemsSeleccionados()) {
            Box box = createBox(item.getBase(), item.getAltura(), item.getProfundidad());  // Puedes ajustar el tamaño de las cajas
            ServicesJavaFX.positionBox(box, items);
            items.add(box);
            room.getChildren().add(box);
        }

        return room;
    }

    // Método para crear una habitación (grupo de paredes, suelo y techo)
    public Group createRoom(double roomWidth, double roomHeight, double roomDepth) {
        // Material para las paredes
        PhongMaterial wallMaterial = new PhongMaterial();
        wallMaterial.setDiffuseColor(Color.BLUEVIOLET);

        // Crear paredes
        Box leftWall = new Box(10, roomHeight, roomDepth);
        leftWall.setMaterial(wallMaterial);
        leftWall.setTranslateX(-roomWidth / 2);

        Box rightWall = new Box(10, roomHeight, roomDepth);
        rightWall.setMaterial(wallMaterial);
        rightWall.setTranslateX(roomWidth / 2);

        Box backWall = new Box(roomWidth, roomHeight, 10);
        backWall.setMaterial(wallMaterial);
        backWall.setTranslateZ(-roomDepth / 2);
        
        Box frontWall = new Box(roomWidth, roomHeight, 10);
        frontWall.setMaterial(wallMaterial);
        frontWall.setTranslateZ(roomDepth / 2);

        // Suelo
        PhongMaterial floorMaterial = new PhongMaterial();
        floorMaterial.setDiffuseColor(Color.DARKGRAY);
        Box floor = new Box(roomWidth, 10, roomDepth);
        floor.setMaterial(floorMaterial);
        floor.setTranslateY(roomHeight / 2);

        // Techo
        Box ceiling = new Box(roomWidth, 10, roomDepth);
        ceiling.setMaterial(wallMaterial);
        ceiling.setTranslateY(-roomHeight / 2);

        // Crear y devolver el grupo que contiene la habitación
        Group room = new Group(leftWall, rightWall, backWall, frontWall, floor, ceiling);
        return room;
    }
    
    private Box createBox(double boxWidth, double boxHeight, double boxDepth) {
        PhongMaterial boxMaterial = new PhongMaterial();
        boxMaterial.setDiffuseColor(Color.AQUAMARINE);

        Box box = new Box(boxWidth, boxHeight, boxDepth);
        box.setMaterial(boxMaterial);
        return box;
    }
}
