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
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXSamsung3Controller implements Initializable {

     @FXML
    private Button crossapp2_btn;

    @FXML
    private Button nextapp2_btn;

    @FXML
    private Button previousapp2_btn;

    @FXML
    void crossapp1Action(ActionEvent event) throws IOException {
        crossapp2_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);

    }

    @FXML
    void nextapp2Action(ActionEvent event) throws IOException {
        nextapp2_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSamsung2.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);

    }

    @FXML
    void previousapp2Action(ActionEvent event) throws IOException {
        previousapp2_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSamsung1.fxml"));
        
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
