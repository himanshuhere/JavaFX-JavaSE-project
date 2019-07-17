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
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXSamsung2Controller implements Initializable {

    
    @FXML
    private Button crosssam2_btn;

  

    @FXML
    private Button previoussam2_btn;

    @FXML
    void crosssam1Action(ActionEvent event) throws IOException {
          crosssam2_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);
        
    }



    @FXML
    void previoussam2Action(ActionEvent event) throws IOException {
           previoussam2_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSamsung3.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
