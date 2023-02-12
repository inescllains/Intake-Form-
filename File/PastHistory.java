import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class PastHistory {

    //Buttons for the Past Psicotherapy 
    private static RadioButton yesPreviousPsychButton = new RadioButton();
    private static RadioButton noPreviousPsychButton = new RadioButton();
    private static RadioButton tccPastButton = new RadioButton();
    private static RadioButton dynamicPastButton = new RadioButton();
    private static RadioButton supportPastButton = new RadioButton();
    private static RadioButton dontKnowPastButton = new RadioButton();
    private static RadioButton otherPastButton = new RadioButton();

    //Buttons for current psychotherapy 
    private static RadioButton noCurrentPsychButton = new RadioButton();
    private static RadioButton yesCurrentPsychButton = new RadioButton();
    private static RadioButton tccCurrentButton = new RadioButton();
    private static RadioButton dynamicCurrentButton = new RadioButton();
    private static RadioButton supportCurrentButton = new RadioButton();
    private static RadioButton dontKnowCurrentButton = new RadioButton();
    private static RadioButton otherCurrentButton = new RadioButton();

    //Buttons for psychiatrist
    private static RadioButton yesPillsPastButton = new RadioButton();
    private static RadioButton noPillsPastButton = new RadioButton();
    private static RadioButton psychPastPillsButton = new RadioButton();
    private static RadioButton otherSpecialtyButton = new RadioButton();
    private static RadioButton noPillsCurrentButton = new RadioButton();
    private static RadioButton yesPillsCurrentButton = new RadioButton();
    private static RadioButton noSuicideAttemptButton = new RadioButton();
    private static RadioButton yesSuicideAttemptButton = new RadioButton();

    //TextFields for specifying
    private static TextField pastDurationText = new TextField();
    private static TextField otherPastText = new TextField();
    private static TextField numberOfSessions = new TextField();
    private static TextField otherCurrentText = new TextField();
    private static TextField beginningAgeText = new TextField();
    private static TextField startDatePillsText = new TextField();
    private static TextField numberAttemptsText = new TextField();
    private static TextField mostRecentDateText = new TextField();
    
    //Button Groups
    private static ToggleGroup pastPsychGroup = new ToggleGroup();
    private static ToggleGroup pastApproachGroup = new ToggleGroup();
    private static ToggleGroup currentPsychGroup = new ToggleGroup();
    private static ToggleGroup currentApproachGroup = new ToggleGroup();
    private static ToggleGroup pastPIllsGroup = new ToggleGroup();
    private static ToggleGroup pastPillsGroup2 = new ToggleGroup();
    private static ToggleGroup currentPillsGroup = new ToggleGroup();
    private static ToggleGroup suicideGroup = new ToggleGroup();

    //VBox
    private static VBox pastPsychPanel = new VBox();
    private static VBox pastApproachPanel = new VBox();
    private static VBox currentPsychPanel = new VBox();
    private static VBox currentApproachPanel = new VBox();
    private static VBox pastPillsPanel = new VBox();
    private static VBox pastPillsPanel2 = new VBox();
    private static VBox currentPIllsPanel = new VBox();
    private static VBox suicidideAttemptsPanel = new VBox();

    public VBox setPastPscyhPanel(){
        yesPreviousPsychButton.setText("Yes");
        noPreviousPsychButton.setText("No");

        pastPsychGroup = new ToggleGroup();
        yesPreviousPsychButton.setToggleGroup(pastPsychGroup);
        noPreviousPsychButton.setToggleGroup(pastPsychGroup);

        pastPsychPanel = new VBox();
        pastPsychPanel.getChildren().add(yesPreviousPsychButton);
        pastPsychPanel.getChildren().add(noPreviousPsychButton);

        return pastPsychPanel;
    }

    public String getPastPsych(){
        if(yesPreviousPsychButton.isSelected()){
            return "1";
        }
        if(noPreviousPsychButton.isSelected()){
            return "0";
        }
        return "";
    }

    public TextField setDurationPreviousPsych(){
        return pastDurationText;
    }

    public String getDurationPreviousPsych(){
        return setDurationPreviousPsych().getText();
    }

    public VBox setPastPsychApproach(){

        tccPastButton.setText("TCC");
        dynamicPastButton.setText("Dynamic");
        supportPastButton.setText("Support");
        dontKnowPastButton.setText("Dont Know");
        otherPastButton.setText("Other");

        pastApproachGroup = new ToggleGroup();
        tccPastButton.setToggleGroup(pastApproachGroup);
        dynamicPastButton.setToggleGroup(pastApproachGroup);
        supportPastButton.setToggleGroup(pastApproachGroup);
        dontKnowPastButton.setToggleGroup(pastApproachGroup);
        otherPastButton.setToggleGroup(pastApproachGroup);

        pastApproachPanel = new VBox();
        pastApproachPanel.getChildren().add(tccPastButton);
        pastApproachPanel.getChildren().add(dynamicPastButton);
        pastApproachPanel.getChildren().add(supportPastButton);
        pastApproachPanel.getChildren().add(dontKnowPastButton);
        pastApproachPanel.getChildren().add(otherPastButton);

        return pastApproachPanel;
    }

    public String getPastApproach(){
        if(tccPastButton.isSelected()){
            return "1";
        }
        if(dynamicPastButton.isSelected()){
            return "2";
        }
        if(supportPastButton.isSelected()){
            return "3";
        }
        if(dontKnowPastButton.isSelected()){
            return "4";
        }
        if(otherPastButton.isSelected()){
            return "5";
        }
        return "";
    }

    public TextField setOtherPastApproach(){
        return otherPastText;
    }
    
    public String getOtherPastApproach(){
        return setOtherPastApproach().getText();
    }

    public VBox setCurrentPsych(){

        yesCurrentPsychButton.setText("Yes");
        noCurrentPsychButton.setText("No");


        currentPsychGroup = new ToggleGroup();
        yesCurrentPsychButton.setToggleGroup(currentPsychGroup);
        noCurrentPsychButton.setToggleGroup(currentPsychGroup);

        currentPsychPanel = new VBox();
        currentPsychPanel.getChildren().add(yesCurrentPsychButton);
        currentPsychPanel.getChildren().add(noCurrentPsychButton);

        return currentPsychPanel;
    }

    public String getCurrentPsych(){
        if(yesCurrentPsychButton.isSelected()){
            return "1";
        }
        if(noCurrentPsychButton.isSelected()){
            return "0";
        }
        return "";
    }

    public TextField setNumberOfSessions(){
        return numberOfSessions;
    }

    public String getNumberOfSessions(){
        return setNumberOfSessions().getText();
    }

    public VBox setCurrentApproach(){
        tccCurrentButton.setText("TCC");
        dynamicCurrentButton.setText("Dynamic");
        supportCurrentButton.setText("Support");
        dontKnowCurrentButton.setText("Don't Know");
        otherCurrentButton.setText("Other");

        currentApproachGroup = new ToggleGroup();
        tccCurrentButton.setToggleGroup(currentApproachGroup);
        dynamicCurrentButton.setToggleGroup(currentApproachGroup);
        supportCurrentButton.setToggleGroup(currentApproachGroup);
        dontKnowCurrentButton.setToggleGroup(currentApproachGroup);
        otherCurrentButton.setToggleGroup(currentApproachGroup);

        currentApproachPanel = new VBox();
        currentApproachPanel.getChildren().add(tccCurrentButton);
        currentApproachPanel.getChildren().add(dynamicCurrentButton);
        currentApproachPanel.getChildren().add(supportCurrentButton);
        currentApproachPanel.getChildren().add(dontKnowCurrentButton);
        currentApproachPanel.getChildren().add(otherCurrentButton);

        return currentApproachPanel;
    }

    public String getCurrentApproach(){
        if(tccCurrentButton.isSelected()){
            return "1";
        }
        if(dynamicCurrentButton.isSelected()){
            return "2";
        }
        if(supportCurrentButton.isSelected()){
            return "3";
        }
        if(dontKnowCurrentButton.isSelected()){
            return "4";
        }
        if(otherCurrentButton.isSelected()){
            return "5";
        }
        return "";
    }
    
    public TextField setOtherCurrentApproach(){
        return otherCurrentText;
    }

    public String getOtherCurrentApproach(){
        return setOtherCurrentApproach().getText();
    }

    public VBox setPastMedication(){

        yesPillsPastButton.setText("Yes - Start Date: ");
        noPillsPastButton.setText("No");

        pastPIllsGroup = new ToggleGroup();
        yesPillsPastButton.setToggleGroup(pastPIllsGroup);
        noPillsPastButton.setToggleGroup(pastPIllsGroup);

        pastPillsPanel = new VBox();
        pastPillsPanel.getChildren().add(noPillsPastButton);
        pastPillsPanel.getChildren().add(yesPillsPastButton);

        return pastPillsPanel;
    }

    public String getPastMedication(){
        if(yesPillsPastButton.isSelected()){
            return "1";
        }
        if(noPillsPastButton.isSelected()){
            return "0";
        }
        return "";
    }

    public TextField setBegginingAgePills(){
        return beginningAgeText;
    }

    public String getBegginingAgePills(){
        return setBegginingAgePills().getText();
    }

    public VBox setPastMedication2(){
        
        psychPastPillsButton.setText("With Psychiatrist");
        otherSpecialtyButton.setText("Other Specialty");

        pastPillsGroup2 = new ToggleGroup();
        psychPastPillsButton.setToggleGroup(pastPillsGroup2);
        otherSpecialtyButton.setToggleGroup(pastPillsGroup2);

        pastPillsPanel2 = new VBox();
        pastPillsPanel2.getChildren().add(psychPastPillsButton);
        pastPillsPanel2.getChildren().add(otherSpecialtyButton);

        return pastPillsPanel2;
    }

    public String getPastMedication2(){
        if(psychPastPillsButton.isSelected()){
            return "1";
        }
        if(otherSpecialtyButton.isSelected()){
            return "2";
        }
        return "";
    }

    public VBox setCurrentMedication(){
        
        noPillsCurrentButton.setText("No");
        yesPillsCurrentButton.setText("Yes");

        currentPillsGroup = new ToggleGroup();
        noPillsCurrentButton.setToggleGroup(currentPillsGroup);
        yesPillsCurrentButton.setToggleGroup(currentPillsGroup);

        currentPIllsPanel = new VBox();
        currentPIllsPanel.getChildren().add(noPillsCurrentButton);
        currentPIllsPanel.getChildren().add(yesPillsCurrentButton);

        return currentPIllsPanel;
    }

    public String getCurrentMedication(){
        if(noPillsCurrentButton.isSelected()){
            return "0";
        }
        if(yesPillsCurrentButton.isSelected()){
            return "1";
        }
        return "";
    }

    public TextField setBegginingDatePills(){
        return startDatePillsText;
    }

    public String getBegginingDatePills(){
        return setBegginingDatePills().getText();
    }

    public VBox setSuicideAttempts(){

        noSuicideAttemptButton.setText("No");
        yesSuicideAttemptButton.setText("Yes");

        suicideGroup = new ToggleGroup();
        noSuicideAttemptButton.setToggleGroup(suicideGroup);
        yesSuicideAttemptButton.setToggleGroup(suicideGroup);

        suicidideAttemptsPanel = new VBox();
        suicidideAttemptsPanel.getChildren().add(noSuicideAttemptButton);
        suicidideAttemptsPanel.getChildren().add(yesSuicideAttemptButton);

        return suicidideAttemptsPanel;
    }

    public String getSuicideAttempts(){
        if(noSuicideAttemptButton.isSelected()){
            return "0";
        }
        if(yesSuicideAttemptButton.isSelected()){
            return "1";
        }
        return "";
    }

    public TextField setNumberSuicideAttempts(){
        return numberAttemptsText;
    }

    public String getNumberSuicideAttempts(){
        return setNumberSuicideAttempts().getText();
    }

    public TextField setDateRecentAttempt(){
        return mostRecentDateText;
    }
    
    public String getDateRecentAttempt(){
        return setDateRecentAttempt().getText();
    }
}
