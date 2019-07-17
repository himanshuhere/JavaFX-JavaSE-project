
package FXgadgetreview;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;
import dbutil.DbConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FXSignupController implements Initializable {

    
    @FXML
    private PasswordField password;

    @FXML
    private Button signup_btn;

    @FXML
    private TextField email;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    @FXML
    private PasswordField username;

    @FXML
    private TextField name;

    @FXML
    private Button signin_btn;
    
      @FXML
    private Button home;
      
      private Connection connection;
      private DbConnection handler;
      private PreparedStatement pst;

   

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        handler = new DbConnection();
        
        
    }  
      @FXML
    void signupAction(ActionEvent event) {
         PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.setOnFinished(ev -> {
            System.out.print("Sign up successfully.");
        });
        
        pt.play();
        
        // saving data into database
//               String insert = "INSERT INTO user(name,username,email,password,gender)"
//               +"VALUES (?,?,?,?,?)";
//
//        connection = handler.getConnection();
//        try {
//            pst = connection.prepareStatement(insert);
//        } catch (SQLException ex) {
//            Logger.getLogger(FXSignupController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
//        try {
//            pst.setString(1, name.getText());
//            pst.setString(2, username.getText());
//             pst.setString(3, email.getText());
//             pst.setString(4, password.getText());
//             pst.setString(5, getGender());
//        
//                pst.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
        
       
        

    }

    @FXML
    void signinAction(ActionEvent event) throws IOException {
        
         signup_btn.getScene().getWindow().hide();
        
        Stage signin = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXlogin.fxml"));
        
        Scene scene = new Scene(root);
        signin.setScene(scene);
        signin.show();
        signin.setResizable(false);
        

    }
    
     @FXML
    void homeAction(ActionEvent ev) throws IOException {
         home.getScene().getWindow().hide();
        
        Stage homeX = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXHome.fxml"));
        
        Scene scene = new Scene(root);
         homeX.setScene(scene);
         homeX.show();
        homeX.setResizable(false);
        
        

    }
    
    public String getGender(){
        String gen = "";
        if(male.isSelected() && !female.isSelected()){
            gen = "male";
        }
        else if(female.isSelected() && !male.isSelected()){
            gen = "female";
        }
        else
        {
            gen = "selectboth";
        }
       
        return gen;
    }

    
}
