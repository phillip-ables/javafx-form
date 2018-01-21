package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
        
        //creating the controls
        //uneditable text line assigned to scenetitle
        Text scenetitle = new Text("Welcome");
        //inline is appropriate wehre syle is bount to variable but best technique is using a stylesheet
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        //add scenetitle to layout grid
        //0 column, 0 row, 2 c span, 1 r span
        grid.add(scenetitle,0,0,2,1);
        
        //label object with text users name
        Label userName = new Label("User Name:");
        grid.add(userName,0,1);
        
        TextField userTextField = new TextField();
        grid.add(userTextField,1,1);
        
        Label pw = new Label("Password:");
        grid.add(pw,0,2);
        
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);
        
        //see the lines for columns rows and gaps if true
        //grid.setGridLinesVisible(true);
        
        //Button named btn labeled Sign in
        Button btn = new Button("Sign in");
        //Hbox layout pane with 10px spacing
        HBox hbBtn = new HBox(10);
        //node at bottom vertically and at the right edge
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        //column 1, row 4
        grid.add(hbBtn,1,4);
        
    final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sing in button pressed");
            }
        });
        
        //set the scene with 300 by 275
        //default dimensions: minimun size needed
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
