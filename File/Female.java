//import javax.swing.*;
//import java.awt.*;

//import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Female {

    private RadioButton noPregnantButton = new RadioButton("No");
    private RadioButton yesPregnantButton = new RadioButton("Yes");

    private TextField weeksText = new TextField();

    private RadioButton noBirthButton = new RadioButton();
    private RadioButton yesBirtButton = new RadioButton();

    private TextField dateBirthText = new TextField();

    private RadioButton yesComplicationsButton = new RadioButton("Yes");
    private RadioButton noComplicationsButton = new RadioButton("No");

    private RadioButton yesFamilySupportButton = new RadioButton();
    private RadioButton noFamilySupportButton = new RadioButton();

    private ToggleGroup pregnantGroup = new ToggleGroup();
    private ToggleGroup birthGroup = new ToggleGroup();
    private ToggleGroup complicationsGroup = new ToggleGroup();
    private ToggleGroup familySupportGroup = new ToggleGroup();

    private VBox pregnantPanel = new VBox();
    private VBox birthPanel = new VBox();
    private VBox complicationsPanel = new VBox();
    private VBox familySupportPanel = new VBox();

    public Pane setPregnant(){

        pregnantGroup = new ToggleGroup();
        noPregnantButton.setToggleGroup(pregnantGroup);
        yesPregnantButton.setToggleGroup(pregnantGroup);

        pregnantPanel = new VBox(5);
        pregnantPanel.getChildren().addAll(noPregnantButton, yesPregnantButton);

        return pregnantPanel;
    }
    public String getPregnant(){
        if(noPregnantButton.isSelected()){
            return "0";
        }
        if(yesPregnantButton.isSelected()){
            return "1";
        }
        return "";
    }
    public TextField setWeeks(){
        return weeksText;
    }
    public String getWeeks(){
        return setWeeks().getText();
    }
    public Pane setBirth(){

        noBirthButton.setText("No");
        yesBirtButton.setText("Yes");

        birthGroup = new ToggleGroup();
        noBirthButton.setToggleGroup(birthGroup);
        yesBirtButton.setToggleGroup(birthGroup);

        birthPanel = new VBox(5);

        birthPanel.getChildren().add(noBirthButton);
        birthPanel.getChildren().add(yesBirtButton);

        return birthPanel;
    }
    public String getBirth(){
        if(noBirthButton.isSelected()){
            return "0";
        }
        if(yesBirtButton.isSelected()){
            return "1";
        }
        return "";
    }
    public TextField setDateBirth(){
        return dateBirthText;
    }
    public String getDateBirth(){
        return setDateBirth().getText();
    }
    public Pane setComplications(){

        noComplicationsButton.setText("No");
        yesComplicationsButton.setText("Yes");

        complicationsGroup = new ToggleGroup();
        noComplicationsButton.setToggleGroup(complicationsGroup);
        yesComplicationsButton.setToggleGroup(complicationsGroup);

        complicationsPanel = new VBox(5);
        complicationsPanel.getChildren().add(noComplicationsButton);
        complicationsPanel.getChildren().add(yesComplicationsButton);

        return complicationsPanel;
    }
    public String getComplications(){
        if(noComplicationsButton.isSelected()){
            return "0";
        }
        if(yesComplicationsButton.isSelected()){
            return "1";
        }
        return "";
    }
    public Pane setFamilySupport(){

        noFamilySupportButton.setText("No");
        yesFamilySupportButton.setText("Yes");

        familySupportGroup = new ToggleGroup();
        noFamilySupportButton.setToggleGroup(familySupportGroup);
        yesFamilySupportButton.setToggleGroup(familySupportGroup);

        familySupportPanel = new VBox(5);
        familySupportPanel.getChildren().add(noFamilySupportButton);
        familySupportPanel.getChildren().add(yesFamilySupportButton);

        return familySupportPanel;
    }
    public String getFamilySupport(){
        if(noFamilySupportButton.isSelected()){
            return "0";
        }
        if(yesFamilySupportButton.isSelected()){
            return "1";
        }
        return "";
    }
}
