
package FXgadgetreview;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class FXSelectCompanyController implements Initializable {

    
    @FXML
    private Button apple_btn;

    @FXML
    private Button google_btn;

    @FXML
    private Button samsung_btn;

    @FXML
    private Button mi_btn;

    @FXML
    private Button signout_btn;

    @FXML
    private Button exit;

    @FXML
    private Button contactus;

    @FXML
    private Label username_welcom;
    
      @FXML
    private AnchorPane anchorpane_holder;
      
    
    private AnchorPane anchorpane_con_app1_t;
    
    private AnchorPane anchorpane_con_goo1_t;
    
    private AnchorPane anchorpane_con_sam1_t;
    
    private AnchorPane anchorpane_con_mi1_t;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    
    
   
    @FXML
    void appleAction(ActionEvent event)  {
        
        createPaneApp1( anchorpane_con_app1_t);
        
         
    }

    @FXML
    void contactusAction(ActionEvent event) throws IOException {
         contactus.getScene().getWindow().hide();
        
        Stage contactpage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXcontactus.fxml"));
        
        Scene scene = new Scene(root);
         contactpage.setScene(scene);
         contactpage.show();
        contactpage.setResizable(false);

    }

    @FXML
    void exitAction(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void googleAction(ActionEvent event) {
        createPaneGoo1();
        

    }

    @FXML
    void miAction(ActionEvent event) {
          createPaneMi1();
    }

    @FXML
    void samsungAction(ActionEvent event) {
        createPaneSam1();

    }

    @FXML
    void signoutAction(ActionEvent event) throws IOException {
        signout_btn.getScene().getWindow().hide();
        
        Stage end = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXendpage.fxml"));
        
        Scene scene = new Scene(root);
         end.setScene(scene);
         end.show();
         end.setResizable(false);
        
        

    }
    
    public void setNode(Node node){
        anchorpane_holder.getChildren().clear();
        anchorpane_holder.getChildren().add((Node) node);
        
        FadeTransition ft = new FadeTransition(Duration.millis(1200));
        ft.setNode(node);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
        
        
   }
    
     public void createPaneApp1(AnchorPane anchorpane_con) {
         
      
        try {
            anchorpane_con = FXMLLoader.load(getClass().getResource("FXApple1.fxml"));
            setNode(anchorpane_con);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
       
   }
      public void createPaneGoo1() {
         
      
       
        try {
            anchorpane_con_goo1_t = FXMLLoader.load(getClass().getResource("FXGoogle1.fxml"));
            setNode(anchorpane_con_goo1_t);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
      
       
   }
       public void createPaneSam1() {
         
      
        try {
            anchorpane_con_sam1_t = FXMLLoader.load(getClass().getResource("FXSamsung1.fxml"));
            setNode(anchorpane_con_sam1_t);
        } catch (IOException ex) {
           ex.printStackTrace();
        }
       
   }
        public void createPaneMi1() {
         
      
        try {
            anchorpane_con_mi1_t = FXMLLoader.load(getClass().getResource("FXMi1.fxml"));
            setNode(anchorpane_con_mi1_t );
        } catch (IOException ex) {
           ex.printStackTrace();
        }
       
   }
        
      
       
 
   
    
    
}
