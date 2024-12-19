package hust.soict.pfiev.javafx;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;

public class PaintController {

    @FXML
    private Pane drawingAreaPane;
    private boolean isPenSelected = true;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
        isPenSelected = true;
    }

    @FXML
    void eraseButtonPressed(ActionEvent event) {
        isPenSelected = false;
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (isPenSelected) {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        } else {
            Circle newCircle = new Circle(event.getX(), event.getY(), 10, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}

