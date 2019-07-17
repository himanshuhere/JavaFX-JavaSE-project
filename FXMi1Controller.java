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


public class FXMi1Controller implements Initializable {

     @FXML
    private Button crossmi1_btn;

    @FXML
    private Button next_mi1_btn;

    @FXML
    void crossmi1Action(ActionEvent event) throws IOException {
         crossmi1_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);

    }

    @FXML
    void nextmi1Action(ActionEvent event) throws IOException {
         next_mi1_btn.getScene().getWindow().hide();
        
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
