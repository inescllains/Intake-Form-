import javafx.scene.layout.VBox;
import javafx.scene.control.*;

public class PersonalData2{

    //Buttons for employment option 1
    private static RadioButton studentButton = new RadioButton();
    private static RadioButton working1Button = new RadioButton();
    private static RadioButton working2Button = new RadioButton();
    private static RadioButton working3Button = new RadioButton();
    private static RadioButton retiredButton = new RadioButton();
    private static RadioButton inactiveButton = new RadioButton();

    //Buttons for employment option 2
    private static RadioButton contract1Button = new RadioButton();
    private static RadioButton contract2Button = new RadioButton();
    private static RadioButton publicButton = new RadioButton();
    private static RadioButton otherContractButton = new RadioButton();

    //Buttons for Household
    private static RadioButton aloneButton = new RadioButton();
    private static RadioButton familyButton = new RadioButton();
    private static RadioButton nonFamilyButton = new RadioButton();

    //Buttons for Relationship status
    private static RadioButton singleButton = new RadioButton();
    private static RadioButton relationshipButton = new RadioButton();
    private static RadioButton factButton = new RadioButton();
    private static RadioButton marriedButton = new RadioButton();
    private static RadioButton divorcedButton = new RadioButton();
    private static RadioButton widowButton = new RadioButton();

    //TextFields for Height & Weight
    private static TextField heightText = new TextField();
    private static TextField weightText = new TextField();

    //Buttons for ethnic group
    private static RadioButton whiteButton = new RadioButton();
    private static RadioButton blackButton = new RadioButton();
    private static RadioButton latinAmerButton = new RadioButton();
    private static RadioButton asianButton = new RadioButton();
    private static RadioButton romaButton = new RadioButton();
    private static RadioButton otherButton = new RadioButton();

    //Button Groups
    private static ToggleGroup employmentGroup = new ToggleGroup();
    private static ToggleGroup extraGroup = new ToggleGroup();
    private static ToggleGroup householdGroup = new ToggleGroup();
    private static ToggleGroup relStatusGroup = new ToggleGroup();

    //Panes
    private static VBox employmentPanel = new VBox();
    private static VBox employmentExtraPanel = new VBox();
    private static VBox householdPanel = new VBox();
    private static VBox relStatusPanel = new VBox();
    private static VBox ethnicGroupPanel = new VBox();

    public VBox setEmployment(){

        studentButton.setText("Student");
        working1Button.setText("Working under contract:");
        working2Button.setText("Self-employed");
        working3Button.setText("Unpaid worker/Intern");
        retiredButton.setText("Retired");
        inactiveButton.setText("Other");

        employmentGroup = new ToggleGroup();
        studentButton.setToggleGroup(employmentGroup);
        working1Button.setToggleGroup(employmentGroup);
        working2Button.setToggleGroup(employmentGroup);
        working3Button.setToggleGroup(employmentGroup);
        retiredButton.setToggleGroup(employmentGroup);
        inactiveButton.setToggleGroup(employmentGroup);

        employmentPanel = new VBox(5);
        employmentPanel.getChildren().add(studentButton);
        employmentPanel.getChildren().add(working1Button);
        employmentPanel.getChildren().add(working2Button);
        employmentPanel.getChildren().add(working3Button);
        employmentPanel.getChildren().add(retiredButton);
        employmentPanel.getChildren().add(inactiveButton);

        working1Button.setOnAction(e -> {if(working1Button.isSelected()){
            employmentExtraPanel.setVisible(true);
            employmentPanel.setVisible(false);
        }});
        return employmentPanel;
    }
    public VBox setExtraEmployment(){

        contract1Button.setText("Permanent Contract");
        contract2Button.setText("Unpermanent Contract");
        publicButton.setText("Public employee");
        otherContractButton.setText("Other kind of work");

        extraGroup = new ToggleGroup();
        contract1Button.setToggleGroup(extraGroup);
        contract2Button.setToggleGroup(extraGroup);
        otherContractButton.setToggleGroup(extraGroup);

        employmentExtraPanel = new VBox(5);
        employmentExtraPanel.getChildren().add(contract1Button);
        employmentExtraPanel.getChildren().add(contract2Button);            
        employmentExtraPanel.getChildren().add(publicButton);
        employmentExtraPanel.getChildren().add(otherContractButton);

        employmentExtraPanel.setVisible(false);

        return employmentExtraPanel;
    }
    public String getEmployment(){
        if(studentButton.isSelected()){
            return "1";
        }
        if(working1Button.isSelected()){
            return "2";
        }
        if(working2Button.isSelected()){
            return "3";
        }
        if(working3Button.isSelected()){
            return "4";
        }
        if(retiredButton.isSelected()){
            return "5";
        }
        if(inactiveButton.isSelected()){
            return "6";
        }
        return "";
    }
    public String getExtraEmployment(){
        if(employmentExtraPanel.isVisible() == true){
            if(contract1Button.isSelected()){
                return "1";
            }
            if(contract2Button.isSelected()){
                return "2";
            }
            if(publicButton.isSelected()){
                return "3";
            }
            if(otherContractButton.isSelected()){
                return "4";
            }
        }
        return "";
    }
    public VBox setHousehold(){

        aloneButton.setText("Sozinho/a");
        familyButton.setText("Familiar");
        nonFamilyButton.setText("Não-familiar (ex., amigo/a/s)");

        householdGroup = new ToggleGroup();
        aloneButton.setToggleGroup(householdGroup);
        familyButton.setToggleGroup(householdGroup);
        nonFamilyButton.setToggleGroup(householdGroup);

        householdPanel = new VBox(5);
        householdPanel.getChildren().add(aloneButton);
        householdPanel.getChildren().add(familyButton);
        householdPanel.getChildren().add(nonFamilyButton);

        return householdPanel;
    }

    public String getHousehold(){
        if(aloneButton.isSelected()){
            return "1";
        }
        if(familyButton.isSelected()){
            return "2";
        }
        if(nonFamilyButton.isSelected()){
            return "3";
        }
        return "";
    }

    public VBox setRelStatus(){

        singleButton.setText("Solteiro/a");
        relationshipButton.setText("Relacionamento");
        factButton.setText("União de facto");
        marriedButton.setText("Casado/a");
        divorcedButton.setText("Divorciado/a");
        widowButton.setText("Viúvo/a");

        relStatusGroup = new ToggleGroup();
        singleButton.setToggleGroup(relStatusGroup);
        relationshipButton.setToggleGroup(relStatusGroup);
        factButton.setToggleGroup(relStatusGroup);
        marriedButton.setToggleGroup(relStatusGroup);
        divorcedButton.setToggleGroup(relStatusGroup);
        widowButton.setToggleGroup(relStatusGroup);

        relStatusPanel = new VBox(5);
        relStatusPanel.getChildren().add(singleButton);
        relStatusPanel.getChildren().add(relationshipButton);
        relStatusPanel.getChildren().add(factButton);
        relStatusPanel.getChildren().add(marriedButton);
        relStatusPanel.getChildren().add(widowButton);

        return relStatusPanel;
    }
    public String getRelStatus(){
        if(singleButton.isSelected()){
            return "1";
        }
        if(relationshipButton.isSelected()){
            return "2";
        }
        if(factButton.isSelected()){
            return "3";
        }
        if(marriedButton.isSelected()){
            return "4";
        }
        if(divorcedButton.isSelected()){
            return "5";
        }
        if(widowButton.isSelected()){
            return "6";
        }
        return "";
    }
    public TextField setHeight(){
        return heightText;
    }
    public String getHeight(){
        return setHeight().getText();
    }
    public TextField setWeight(){
        return weightText;
    }
    public String getWeight(){
        return setWeight().getText();
    }
    public VBox setEthnicGroup(){

        whiteButton.setText("White/Caucasian");
        blackButton.setText("Balck/African/African Descent");
        latinAmerButton.setText("Latin American");
        asianButton.setText("Asian / Asian Origin");
        romaButton.setText("Roma / Roma origin");
        otherButton.setText("Other");

        ethnicGroupPanel = new VBox(5);
        ethnicGroupPanel.getChildren().add(whiteButton);
        ethnicGroupPanel.getChildren().add(blackButton);
        ethnicGroupPanel.getChildren().add(latinAmerButton);
        ethnicGroupPanel.getChildren().add(asianButton);
        ethnicGroupPanel.getChildren().add(romaButton);
        ethnicGroupPanel.getChildren().add(otherButton);

        return ethnicGroupPanel;
    }
    public String getBran(){
        if(whiteButton.isSelected()){
            return "1";
        }
        return "0";
    }
    public String getNegr(){
        if(blackButton.isSelected()){
            return "1";
        }
        return "0";
    }
    public String getAmer(){
        if(latinAmerButton.isSelected()){
            return "1";
        }
        return "0";
    }
    public String getAsia(){
        if(asianButton.isSelected()){
            return "1";
        }
        return "0";
    }
    public String getCiga(){
        if(romaButton.isSelected()){
            return "1";
        }
        return "0";
    }
    public String getOutr(){
        if(otherButton.isSelected()){
            return "1";
        }
        return "0";
    }
}
