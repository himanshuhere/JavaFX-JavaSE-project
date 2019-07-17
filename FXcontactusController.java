/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FXgadgetreview;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class FXcontactusController implements Initializable {

    
        @FXML
    private Button home_btn;

   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    void homeAction(ActionEvent event) throws IOException {
         home_btn.getScene().getWindow().hide();
        
        Stage homeY = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXHome.fxml"));
        
        Scene scene = new Scene(root);
         homeY.setScene(scene);
         homeY.show();
        homeY.setResizable(false);

    }

    
}
