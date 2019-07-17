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


public class FXMi3Controller implements Initializable {

    @FXML
    private Button crossapp3_btn;

    @FXML
    private Button previousapp3_btn;

    @FXML
    void crossapp3Action(ActionEvent event) throws IOException {
        crossapp3_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);


    }

    @FXML
    void previousapp3Action(ActionEvent event) throws IOException {
        previousapp3_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMi2.fxml"));
        
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
