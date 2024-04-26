package com.example.bungus;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Label input, output, stage1_1, stage1_2, stage1_3, stage2_1, stage2_2, stage2_3, stage3_1, stage3_2, stage3_3,
            n1, n2, n3, n4, n5, n6,
            stage1_r1, stage1_r2, stage1_r3,
            stage2_r1, stage2_r2, stage2_r3,
            stage3_r1, stage3_r2, stage3_r3;

    // Method to set the variable
    public void setInOut(int x) {
        input.setText("Input: " + x);
        output.setText("Output: " + x);
    }

    public void setStage1Stage3(double x, double y) {
        stage1_1.setText(x + " x " + y);
        stage1_1.setAlignment(Pos.CENTER);
        stage1_2.setText(x + " x " + y);
        stage1_2.setAlignment(Pos.CENTER);
        stage1_3.setText(x + " x " + y);
        stage1_3.setAlignment(Pos.CENTER);
        stage3_1.setText(y + " x " + x);
        stage3_1.setAlignment(Pos.CENTER);
        stage3_2.setText(y + " x " + x);
        stage3_2.setAlignment(Pos.CENTER);
        stage3_3.setText(y + " x " + x);
        stage3_3.setAlignment(Pos.CENTER);
    }

    public void setStage2(double x) {
        stage2_1.setText(x + " x " + x);
        stage2_1.setAlignment(Pos.CENTER);
        stage2_2.setText(x + " x " + x);
        stage2_2.setAlignment(Pos.CENTER);
        stage2_3.setText(x + " x " + x);
        stage2_3.setAlignment(Pos.CENTER);
    }

    public void setStageNumbers(double x, double y) {
        stage1_r1.setText(1 + "");
        stage1_r1.setAlignment(Pos.CENTER);

        stage2_r1.setText(1 + "");
        stage2_r1.setAlignment(Pos.CENTER);

        stage3_r1.setText(1 + "");
        stage3_r1.setAlignment(Pos.CENTER);

        stage1_r2.setText(2 + "");
        stage1_r2.setAlignment(Pos.CENTER);

        stage2_r2.setText(2 + "");
        stage2_r2.setAlignment(Pos.CENTER);

        stage3_r2.setText(2 + "");
        stage3_r2.setAlignment(Pos.CENTER);

        stage1_r3.setText(y + "");
        stage1_r3.setAlignment(Pos.CENTER);

        stage2_r3.setText(x + "");
        stage2_r3.setAlignment(Pos.CENTER);

        stage3_r3.setText(y + "");
        stage3_r3.setAlignment(Pos.CENTER);
    }

    public void setN(double x) {
        n1.setText(x + "");
        n2.setText(x + "");
        n3.setText(x + "");
        n4.setText(x + "");
        n5.setText(x + "");
        n6.setText(x + "");

    }
}