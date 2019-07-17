
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


public class FXendpageController implements Initializable {

    @FXML
    private Button yes_btn;

    @FXML
    private Button no_btn;

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    void noAction(ActionEvent event) throws IOException {
         no_btn.getScene().getWindow().hide();
        
        Stage sel_comp = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
         sel_comp.setScene(scene);
         sel_comp.show();
        sel_comp.setResizable(false);

    }

    @FXML
    void yesAction(ActionEvent event2) throws IOException {
         yes_btn.getScene().getWindow().hide();
        
        Stage homey = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXHome.fxml"));
        
        Scene scene = new Scene(root);
         homey.setScene(scene);
         homey.show();
        homey.setResizable(false);

    }
    
}
