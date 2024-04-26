package com.example.bungus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        HelloController controller = fxmlLoader.getController();
        three_stage_clos clos3 = new three_stage_clos();
        int n = 500;

        controller.setInOut(n);
        controller.setStage1Stage3(clos3.optimum_n(n), ((2 * clos3.optimum_n(n)) - 1));
        controller.setStage2(clos3.optimum_m(n));
        controller.setStageNumbers((( 2 * clos3.optimum_n(n)) - 1), clos3.optimum_m(n));
        controller.setN(clos3.optimum_n(n));
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}