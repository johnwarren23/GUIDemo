package guidemo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author John Warren
 */
public class GuiDemo extends Application
{
    Button button;

  
    public static void main(String[] args) 
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click Me");
        
        /*
        //This class will handle the button events
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("I am an anonymous inner class");
            }
        });
````````*/
        
        //This is a lambda expression and is way more simpler
        button.setOnAction(e -> 
                System.out.println("This is a Lambda expression"));
        
        
   
        
       
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
  
}
      


  
    























