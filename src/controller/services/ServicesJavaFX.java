package controller.services;

import controller.implement.Item;
import controller.implement.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Point3D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import static javafx.scene.input.KeyCode.A;
import static javafx.scene.input.KeyCode.D;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.S;
import static javafx.scene.input.KeyCode.UP;
import static javafx.scene.input.KeyCode.W;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author sergiopro
 */
public class ServicesJavaFX {
    
    private static Random random = new Random();
    private static Room roomSeleccionada;
    private static List<Item> itemsSeleccionados = new ArrayList<>();

    public static void setRoomSeleccionada(Room roomSeleccionado) {
        ServicesJavaFX.roomSeleccionada = roomSeleccionado;
    }

    public static void setItemsSeleccionados(List<Item> itemsSeleccionados) {
        ServicesJavaFX.itemsSeleccionados = itemsSeleccionados;
    }

    public static Room getRoomSeleccionada() {
        return roomSeleccionada;
    }

    public static List<Item> getItemsSeleccionados() {
        return itemsSeleccionados;
    }
    

    public static void positionBox(Box item, List<Box> existingBoxes) {
        boolean collision;
        do {
            collision = false;
            double x = random.nextDouble() * (roomSeleccionada.getBase() - item.getWidth()) - roomSeleccionada.getBase() / 2 + item.getWidth() / 2;
            double y = random.nextDouble() * (roomSeleccionada.getAltura() - item.getHeight()) - roomSeleccionada.getAltura() / 2 + item.getHeight() / 2;
            double z = random.nextDouble() * (roomSeleccionada.getProfundidad() - item.getDepth()) - roomSeleccionada.getProfundidad() / 2 + item.getDepth() / 2;

            item.setTranslateX(x);
            item.setTranslateY(y);
            item.setTranslateZ(z);

            for (Box existingBox : existingBoxes) {
                if (item.getBoundsInParent().intersects(existingBox.getBoundsInParent())) {
                    collision = true;
                    break;
                }
            }
        } while (collision);
    }

    /*
    public static void moverCaja(Stage primaryStage, Box caja){
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event ->{
            switch(event.getCode()){
                case W:
                    caja.translateZProperty().set(caja.getTranslateZ() + 10);
                    break;
                case A:
                    caja.translateXProperty().set(caja.getTranslateX() - 10);
                    break;
                case D:
                    caja.translateXProperty().set(caja.getTranslateX() + 10);
                    break;
                case S:
                    caja.translateZProperty().set(caja.getTranslateZ() - 10);
                    break;
                case Q:
                    caja.translateYProperty().set(caja.getTranslateY() - 10);
                    break;
                case E:
                    caja.translateYProperty().set(caja.getTranslateY() + 10);
                    break;
            }
        });
    
    }*/
    
        public static void moverCamara(PerspectiveCamera camara, Scene scene) {
        double[] mousePosX = {0}; 
        double[] mousePosY = {0};
        double[] mouseOldX = {0};
        double[] mouseOldY = {0};

        Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
        Rotate xRotate = new Rotate(0, Rotate.X_AXIS);

        camara.getTransforms().addAll(yRotate, xRotate);

        scene.setOnMouseMoved((MouseEvent event) -> {
            mousePosX[0] = event.getSceneX();
            mousePosY[0] = event.getSceneY();

            double deltaX = mousePosX[0] - mouseOldX[0];
            double deltaY = mousePosY[0] - mouseOldY[0];

            yRotate.setAngle(yRotate.getAngle() - deltaX * 0.1);
            xRotate.setAngle(xRotate.getAngle() - deltaY * 0.1);

            mouseOldX[0] = mousePosX[0];
            mouseOldY[0] = mousePosY[0];
        });

        scene.setOnKeyPressed((KeyEvent event) -> {
            double movementSpeed = 10;
            Point3D direction = null;

            switch (event.getCode()) {
                case W -> direction = new Point3D(0, 0, -movementSpeed);
                case S -> direction = new Point3D(0, 0, movementSpeed);
                case A -> direction = new Point3D(-movementSpeed, 0, 0);
                case D -> direction = new Point3D(movementSpeed, 0, 0);
            }

            if (direction != null) {
                moverYDelimitarCamara(camara, direction, xRotate, yRotate);
            }
        });
    }


    // Método para mover la cámara con restricciones
    public static void moverYDelimitarCamara(PerspectiveCamera camara, Point3D direction, Rotate xRotate, Rotate yRotate) {
        double angleY = yRotate.getAngle();
    
        // Calcular la dirección en la que la cámara se moverá
        double deltaX = direction.getX() * Math.cos(Math.toRadians(angleY)) - direction.getZ() * Math.sin(Math.toRadians(angleY));
        double deltaZ = direction.getZ() * Math.cos(Math.toRadians(angleY)) + direction.getX() * Math.sin(Math.toRadians(angleY));
        double deltaY = direction.getY();

        double newX = camara.getTranslateX() + deltaX;
        double newY = camara.getTranslateY() + deltaY;
        double newZ = camara.getTranslateZ() + deltaZ;

        // Restringir el movimiento de la cámara dentro de la habitación
        if (newX > -400 / 2 && newX < 400 / 2) {
            camara.setTranslateX(newX);
        }

        if (newY > -200 / 2 && newY < 200 / 2) {
            camara.setTranslateY(newY);
        }

        if (newZ > -300 / 2 && newZ < 0) {
            camara.setTranslateZ(newZ);
        }
    }
    /*
    public static void rotarGrupo(Stage primaryStage, SmartGroup grupo){
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event ->{
            switch(event.getCode()){
                case UP:
                    grupo.rotateY(10);
                    break;
                case DOWN:
                    grupo.rotateY(-10);
                    break;
                case LEFT:
                    grupo.rotateX(-10);
                    break;
                case RIGHT:
                    grupo.rotateX(10);
                    break;
                case M:
                    grupo.rotateZ(-10);
                    break;
                case N:
                    grupo.rotateZ(10);
                    break;
            }
        });
    
    }*/
    
    public static void rotarCamara(Scene scene, Camera camara){
        Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
        camara.getTransforms().addAll(rotateX, rotateY);
        
        scene.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                case UP:
                    rotateX.setAngle(rotateX.getAngle() - 10);
                    break;
                case DOWN:
                    rotateX.setAngle(rotateX.getAngle() + 10);
                    break;
                case LEFT:
                    rotateY.setAngle(rotateY.getAngle() - 10);
                    break;
                case RIGHT:
                    rotateY.setAngle(rotateY.getAngle() + 10);
                    break;
            }
        });
    }
    
    /*
    public static void rotarCaja2(Stage primaryStage, Box caja2){
        Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
        Rotate rotateZ = new Rotate(0, Rotate.Z_AXIS);
        caja2.getTransforms().addAll(rotateX, rotateY, rotateZ);
        
        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            switch (event.getCode()) {
                case UP:
                    rotateX.setAngle(rotateX.getAngle() - 10);
                    break;
                case DOWN:
                    rotateX.setAngle(rotateX.getAngle() + 10);
                    break;
                case LEFT:
                    rotateY.setAngle(rotateY.getAngle() - 10);
                    break;
                case RIGHT:
                    rotateY.setAngle(rotateY.getAngle() + 10);
                    break;
                case M:
                    rotateZ.setAngle(rotateZ.getAngle() - 10);
                    break;
                case N:
                    rotateZ.setAngle(rotateZ.getAngle() + 10);
                    break;
            }
        });
    }*/
    
    /*
    public static void rotarCaja2Mouse(Stage primaryStage, Box caja2, Scene scene) {
        // Crear rotaciones para los ejes X, Y y Z
        Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
        Rotate rotateZ = new Rotate(0, Rotate.Z_AXIS);

        // Añadir las rotaciones al bloque
        caja2.getTransforms().addAll(rotateX, rotateY, rotateZ);

        // Variables para almacenar la posición del mouse
        final double[] mouseXOld = {0};
        final double[] mouseYOld = {0};

        // Manejar el evento cuando se presiona el mouse
        scene.setOnMousePressed(event -> {
            // Guardar la posición inicial del mouse
            mouseXOld[0] = event.getSceneX();
            mouseYOld[0] = event.getSceneY();
        });

        // Manejar el evento cuando se arrastra el mouse
        scene.setOnMouseDragged(event -> {
            // Calcular la diferencia de movimiento
            double mouseXNew = event.getSceneX();
            double mouseYNew = event.getSceneY();

            // Calcular los ángulos de rotación en función del movimiento del mouse
            double deltaX = mouseXNew - mouseXOld[0];
            double deltaY = mouseYNew - mouseYOld[0];

            // Ajustar los ángulos de rotación
            rotateX.setAngle(rotateX.getAngle() + deltaY * 0.5);
            rotateY.setAngle(rotateY.getAngle() - deltaX * 0.5);

            // Si deseas rotar también sobre el eje Z, podrías usar una tecla modificadora (opcional)
            if (event.isShiftDown()) {
                rotateZ.setAngle(rotateZ.getAngle() + deltaX * 0.5);
            }

            // Actualizar la posición del mouse para la siguiente operación
            mouseXOld[0] = mouseXNew;
            mouseYOld[0] = mouseYNew;
        });
    }*/
    
    public static void mouseScrolling(Stage primaryStage, Group grupo){
        primaryStage.addEventHandler(ScrollEvent.SCROLL, event -> {
            double delta= event.getDeltaY();
            grupo.translateZProperty().set(grupo.getTranslateZ() - delta);
        });
    } 
}
 