
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


public class FXloginController implements Initializable {
    
    @FXML
    private PasswordField password;

    @FXML
    private Button signin_btn;

    @FXML
    private Hyperlink forgotpassword;

    @FXML
    private TextField username;
    
    @FXML
    private Button cross;

    @FXML
    private Button signup_btn;
    
    @FXML
    private Label warninglabel;
    
    
    @FXML
    private Button home2;
    
    private DbConnection handler;
    private Connection connection;
    private PreparedStatement pst;
    
    // welcome section //
    private static FXloginController instance; 
    public FXloginController(){
        instance = this;
    }
    public FXloginController getInstance(){
       
        return instance;
    }
    public String username(){
        return username.getText();
    }
    
    //          //

   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        handler = new DbConnection();
        
        
    }    
    @FXML
    public void signinAction(ActionEvent e) throws IOException{
        
        
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.setOnFinished(ev -> {
            System.out.print("Login successfully.");
        });
        
        pt.play();
        
        // retrive data from database for login
        
//        connection = handler.getConnection();
//        String q1 = "SELECT * from user where username=? and password=?";
//        
//        try {
//            pst = connection.prepareStatement(q1);
//            pst.setString(1,username.getText());
//            pst.setString(2,password.getText());
//            ResultSet rs = pst.executeQuery();
//            
//            
//            int count = 0;
//            while(rs.next()){
//                count = count+1;
//            }
//            if(count == 1){
//                    signin_btn.getScene.getWindow().hide();
//                    
//                     Stage userhome = new Stage();
//                    Parent root = FXMLLoader.load(getClass().getResource("FXSelectCompany.fxml"));
//
//                    Scene scene = new Scene(root);
//                    userhome.setScene(scene);
//                    userhome.show();
                    
        
//            }
//            else{
//                Alert alert = new Alert(Alert.AlertType.ERROR);
//                alert.setHeaderText(null);
//                alert.setContentText("Please enter valid username and password.");
//                alert.show();
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//           finally{
//            try {
//                connection.close();
//            } catch (SQLException ex) {
//               ex.printStackTrace();
//            }
//        }
//        
        
    }
    
    @FXML
    public void signupAction(ActionEvent e1) throws IOException{
        signin_btn.getScene().getWindow().hide();
        
        Stage signup = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXSignup.fxml"));
        
        Scene scene = new Scene(root);
        signup.setScene(scene);
        signup.show();
        signup.setResizable(false);
        
        
       
        
    }
    
     @FXML
    void closeApp(ActionEvent event) {
        System.exit(0);

    }
    
    
     @FXML
    void homeYAction(ActionEvent evv) throws IOException {
    
     home2.getScene().getWindow().hide();
        
        Stage homeY = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXHome.fxml"));
        
        Scene scene = new Scene(root);
         homeY.setScene(scene);
         homeY.show();
        homeY.setResizable(false);
    }
    
}
