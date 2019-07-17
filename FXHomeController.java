
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


public class FXHomeController implements Initializable {
    
    @FXML
    private Button signin_btnh;

    @FXML
    private Button signup_btnh;

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    @FXML
    void signinAction(ActionEvent event) throws IOException {
        signup_btnh.getScene().getWindow().hide();
        
        Stage signin = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXlogin.fxml"));
        
        Scene scene = new Scene(root);
        signin.setScene(scene);
        signin.show();
        signin.setResizable(false);
        

    }

    @FXML
    void signupAction(ActionEvent e) throws IOException {
        signin_btnh.getScene().getWindow().hide();
        
        Stage signup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
        
        Scene scene = new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);
        
        

    }
    
}
