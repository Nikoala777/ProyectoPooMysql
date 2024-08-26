package view.JavaFX;

import controller.services.ServicesJavaFX;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;

public class RooMakingJFX3D {

        public Scene createScene() {
        // Crear instancia de CreateObjects
        CreateObjects createObjects = new CreateObjects();

        // Crear la habitación
        Group room = createObjects.createRoomWithBoxes();

        // Configurar la cámara
        PerspectiveCamera camara = new PerspectiveCamera(true);
        camara.setTranslateX(0);
        camara.setTranslateY(0);
        camara.setTranslateZ(-150);
        camara.setNearClip(1);
        camara.setFarClip(1000);

        // Crear la escena
        Scene scene = new Scene(room, 800, 600, true);
        scene.setFill(javafx.scene.paint.Color.SKYBLUE);
        scene.setCamera(camara);
        
        //llamar metodos
        ServicesJavaFX.moverCamara(camara, scene);
        ServicesJavaFX.rotarCamara(scene, camara);

        return scene;
    }

}


