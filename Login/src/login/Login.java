package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        //GridPane object assigned grid variable
        GridPane grid = new GridPane();
        //default position is top left
        grid.setAlignment(Pos.CENTER);
        //space between the rows and colomns
        grid.setHgap(10);
        grid.setVgap(10);
        //space between the edges of GridPane
        //insets top,right,bottom,left(standard)
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid,300,275);
        primaryStage.setScene(scene);        
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
