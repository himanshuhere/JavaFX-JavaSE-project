


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXgadgetreview;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author NDA
 */
public class FXApple1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private AnchorPane anchorpane_con_app1;

    @FXML
    private Button crossapp1_btn;

    @FXML
    private Button next_app1_btn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void crossapp1Action(ActionEvent event) throws IOException {
        crossapp1_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);
        

    }

    @FXML
    void nextapp1Action(ActionEvent event) throws IOException {
         next_app1_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXApple2.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);
        

    }
    
    public void loadFXML(String loc, String title) throws IOException{
    
        Parent root = FXMLLoader.load(getClass().getResource(loc));
         Stage stage = new Stage(StageStyle.UNDECORATED);
        Scene scene = new Scene(root);
         stage.setScene(scene);
         stage.setTitle(title);
         stage.setX(470);
         stage.setY(138);
         stage.show();
         
                
    }
}
