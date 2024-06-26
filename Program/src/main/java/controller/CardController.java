package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.Course;

import java.net.URL;
import java.util.ResourceBundle;

public class CardController implements Initializable {

    @FXML
    private Label PriceLabel;

    @FXML
    private VBox card;

    @FXML
    private Label courseInstructor;

    @FXML
    private Label courseTitle;

    @FXML
    private ImageView courseImage;

    private Course cardCourse;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setData(Course course) {
        cardCourse = course;
        courseTitle.setText(course.getTitle());
        PriceLabel.setText(String.valueOf(course.getPrice()));
        courseInstructor.setText(course.getInstructor().getFullName());
        card.setAccessibleText(String.valueOf(course.getPrice()));
    }
}
