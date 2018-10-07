/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Tuomas
 */
public class GUIView extends Application {

    ClientController controller;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
/*
        try {

            ClientConnection connection = new ClientConnection();
            controller = new ClientController(this, connection);
            connection.initializeConnection(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
}