import java.time.format.DateTimeFormatter;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;


public class PersonalData{

    //The setters create the panels/components that will then be added to the main panel
    //The getters are what allows to collect the information

    //The components that will be used here
    private static TextField idText = new TextField();
    private static TextField firstNameText = new TextField();
    private static TextField lastNameText = new TextField();
    private static TextField sessDateText = new TextField();
    private static TextField dobText = new TextField();

    private static RadioButton feminineButton = new RadioButton();
    private static RadioButton masculineButton = new RadioButton();
    private static RadioButton nbButton = new RadioButton();
    private static ToggleGroup genderGroup = new ToggleGroup();

    private static RadioButton yesTransButton = new RadioButton();
    private static RadioButton noTransButton = new RadioButton();
    private static ToggleGroup transgeneroGroup = new ToggleGroup();

    private static TextField studiesYText = new TextField();
    private static TextField childText = new TextField();

    Pane pregnantPanel = new Pane();
    Female pregnant = new Female();

    public TextField setPatientID(){
        return idText;
    }
    public String getPatientID(){
        return setPatientID().getText(); 
    }
    public TextField setFirstName(){
        return firstNameText;
    }
    public String getFirstName(){
        return  setFirstName().getText();
    }
    public TextField setLastName(){
        return lastNameText;
    }
    public String getLastName(){
        return setLastName().getText();
    }
    public TextField setSessDate(){
        return sessDateText;
    }
    public String getSessDate(){
        return setSessDate().getText();
    }
    public TextField setDob(){
        return dobText;

    }
    public String getDob(){
        return setDob().getText();
    }
    public Pane setGender(){
        
        feminineButton.setText("Female");
        masculineButton.setText("Male");
        nbButton.setText("Non-binary");

        genderGroup = new ToggleGroup();
        feminineButton.setToggleGroup(genderGroup);
        masculineButton.setToggleGroup(genderGroup);
        nbButton.setToggleGroup(genderGroup);

        VBox genderPanel = new VBox(3);
        genderPanel.getChildren().add(feminineButton);
        genderPanel.getChildren().add(masculineButton);
        genderPanel.getChildren().add(nbButton);

        return genderPanel;
    }
    public String getGender(){
        if(feminineButton.isSelected()){
            return "0";
        }
        else if(masculineButton.isSelected()){
            return "1";
        }
        else if(nbButton.isSelected()){
            return "2";
        }
        return "";
    }
    public Pane setTrans(){
        
        yesTransButton.setText("Yes");
        noTransButton.setText("No");
        
        transgeneroGroup = new ToggleGroup();
        yesTransButton.setToggleGroup(transgeneroGroup);
        noTransButton.setToggleGroup(transgeneroGroup);

        VBox transgeneroPanel = new VBox(2);
        transgeneroPanel.getChildren().add(yesTransButton);
        transgeneroPanel.getChildren().add(noTransButton);

        return transgeneroPanel;
    }
    public String getTrans(){
        if(noTransButton.isSelected()){
            return "0";
        }
        else if(yesTransButton.isSelected()){
            return "1";
        }
        return "";
    }
    public TextField setStudiesY(){
        return studiesYText;
    }
    public String getStudiesY(){
        return setStudiesY().getText();
    }
    public TextField setChild(){
        return childText;
    }
    public String getChild(){
        return setChild().getText();
    }
    public Pane setPregnantPanel(){

        VBox pregnantPanel = new VBox(6);
        pregnantPanel.getChildren().add(pregnant.setPregnant());
        pregnantPanel.getChildren().add(pregnant.setWeeks());
        pregnantPanel.getChildren().add(pregnant.setBirth());
        pregnantPanel.getChildren().add(pregnant.setDateBirth());
        pregnantPanel.getChildren().add(pregnant.setComplications());
        pregnantPanel.getChildren().add(pregnant.setFamilySupport());

        return pregnantPanel;
    }
}