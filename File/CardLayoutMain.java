import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CardLayoutMain extends Application{

    Stage frame;
    Stage cardStage;
    Scene scene1;
    Scene scene2;
    Scene scene3;
    Scene scene4;
    Scene scene5;

    private static Label patientIDLabel = new Label("ID: ");
    private static Label firstNameLabel = new Label("First Name: ");
    private static Label lastNameLabel = new Label("Last Name: ");
    private static Label sessDateLabel = new Label("Date of Evaluation(dd/mm/aaaa): ");
    private static Label dobLabel = new Label("Date of Evaluation(dd/mm/aa): ");
    private static Label generoLabel = new Label("Which gender do you identify with? ");
    private static Label transLabel = new Label("Do you consider yourself as transgender? ");
    private static Label studiesYLabel = new Label("Education(years): ");
    private static Label childLabel = new Label("number of Children:");

    private static Label employmentLabel = new Label("Current Occupation:");    
    private static Label householdLabel = new Label("Residence:");
    private static Label relStatusLabel = new Label("Marital Status:");
    private static Label heightLabel = new Label("Height:");
    private static Label weightLabel = new Label("Weight:");
    private static Label ethnicGroupLabel = new Label("Ethnicity: Which of the following best describe you?");

    private static Label pregnantLabel = new Label("Are you currently pregnant?");
    private static Label weeksLabel = new Label("Weels");
    private static Label birthLabel = new Label("Did you give birth in the past twelve months?");
    private static Label dateBirthLabel = new Label("If yes, when?");
    private static Label complicationsLabel = new Label("Did you has any pos-partum complications?");
    private static Label familySupportLabel = new Label("Did you have family support?");

    private static Label pastPsychLabel = new Label("Psychoteraphy / Psychology: ");
    private static Label pastPsychLabel2 = new Label("Did you have psychologic treatment in the past?");
    private static Label lengthOfTherapyLabel = new Label("How long did this treatment last?");
    private static Label pastApproachLabel = new Label("Which approach was used?: ");
    private static Label currentPsychLabel = new Label("Are you currently receiving any psychological treatment?");
    private static Label currentApproachLabel = new Label("Which approach are you using?");
    private static Label psych = new Label("Psychiatry: ");
    private static Label pastPillsLabel = new Label("Did you ever do any treatment using medication for a mental health problem?");
    private static Label currentPillsLabel = new Label("Are you doing any daily medication to treatment a mental health issue?");
    private static Label suicideAttemptsLabel = new Label("Did you ever attemp suicide?");

    private static Label numberOfSessionsLabel = new Label("How many sessions have you had in the past two months:");
    private static Label beginningAgeLabel = new Label("Start date:");
    private static Label numberAttemptsLabel = new Label("Number of attempts:");
    private static Label mostRecentDateLabel = new Label("Date of the most recent attempt:");
    
    PersonalData dadosPessoais = new PersonalData();
    PersonalData2 dadosPessoais2 = new PersonalData2();
    Female feminino = new Female();
    PersonalData antecedentesPessoais = new PersonalData();
    
    //this is the one that holds the other Scenes

    public void start(Stage cardStage){

        //int width = (int) Screen.getPrimary().getBounds().getWidth();
        //int height = (int) Screen.getPrimary().getBounds().getHeight();

        //frame = new Stage();
        //frame.setSize(900, 500);

        //scene1.setBackground(Color.white);
        //scene2.setBackground(Color.white);
        //scene3.setBackground(Color.white);

        Button button1 = new Button("Click me to change Scene");
        button1.setOnAction(e -> {actionPerformed(e); cardStage.setScene(scene2);});
        VBox layout1 = new VBox(9);
        layout1.setAlignment(Pos.CENTER_LEFT);
        //layout1.setAlignment(Pos.BASELINE_CENTER);
        layout1.getChildren().add(patientIDLabel);
        layout1.getChildren().add(dadosPessoais.setPatientID());
        layout1.getChildren().add(firstNameLabel);
        layout1.getChildren().add(dadosPessoais.setFirstName());
        layout1.getChildren().add(lastNameLabel);
        layout1.getChildren().add(dadosPessoais.setLastName());
        layout1.getChildren().add(sessDateLabel);
        layout1.getChildren().add(dadosPessoais.setSessDate());
        layout1.getChildren().add(dobLabel);
        layout1.getChildren().add(dadosPessoais.setDob());
        layout1.getChildren().add(generoLabel);
        layout1.getChildren().add(dadosPessoais.setGender());
        layout1.getChildren().add(transLabel);
        layout1.getChildren().add(dadosPessoais.setTrans());
        layout1.getChildren().add(studiesYLabel);
        layout1.getChildren().add(dadosPessoais.setStudiesY());
        layout1.getChildren().add(childLabel);
        layout1.getChildren().add(dadosPessoais.setChild());

        layout1.getChildren().add(button1);

        layout1.setPadding(new Insets(10, 20, 20, 10));
        scene1 = new Scene(layout1);
         
        Button button2 = new Button("Click me to change Scene");
        button2.setOnAction(e -> {actionPerformed(e); if(dadosPessoais.getGender().equals("0")&&dadosPessoais.getGender().equals("0")){
            cardStage.setScene(scene3);
        }else{cardStage.setScene(scene4);}});
        VBox layout2 = new VBox();

        layout2.getChildren().add(employmentLabel);
        layout2.getChildren().add(dadosPessoais2.setEmployment());
        layout2.getChildren().add(dadosPessoais2.setExtraEmployment());
        layout2.getChildren().add(householdLabel);
        layout2.getChildren().add(dadosPessoais2.setHousehold());
        layout2.getChildren().add(relStatusLabel);
        layout2.getChildren().add(dadosPessoais2.setRelStatus());
        layout2.getChildren().add(heightLabel);
        layout2.getChildren().add(dadosPessoais2.setHeight());
        layout2.getChildren().add(weightLabel);
        layout2.getChildren().add(dadosPessoais2.setWeight());
        layout2.getChildren().add(ethnicGroupLabel);
        layout2.getChildren().add(dadosPessoais2.setEthnicGroup());
        layout2.getChildren().add(button2);

        layout2.setPadding(new Insets(10, 20, 20, 10));

        scene2 = new Scene(layout2);

        Button button3 = new Button("Click me to change Scene");
        button3.setOnAction(e -> {actionPerformed(e); cardStage.setScene(scene4);});
        VBox layout3 = new VBox();

        layout3.getChildren().add(pregnantLabel);
        layout3.getChildren().add(feminino.setPregnant());
        layout3.getChildren().add(weeksLabel);
        layout3.getChildren().add(feminino.setWeeks());
        layout3.getChildren().add(birthLabel);
        layout3.getChildren().add(feminino.setBirth());
        layout3.getChildren().add(dateBirthLabel);
        layout3.getChildren().add(feminino.setDateBirth());
        layout3.getChildren().add(complicationsLabel);
        layout3.getChildren().add(feminino.setComplications());
        layout3.getChildren().add(familySupportLabel);
        layout3.getChildren().add(feminino.setFamilySupport());
        layout3.getChildren().add(button3);
        
        layout3.setPadding(new Insets(10, 20, 20, 10));
        
        scene3 = new Scene(layout3);

        Button button4 = new Button("Click me to change Scene");
        button4.setOnAction(e -> {actionPerformed(e); cardStage.setScene(scene5);});
        VBox layout4 = new VBox();

        layout4.getChildren().add(pastPsychLabel);
        layout4.getChildren().add(pastPsychLabel2);
        layout4.getChildren().add(antecedentesPessoais.setPastPscyhPanel());
        layout4.getChildren().add(lengthOfTherapyLabel);
        layout4.getChildren().add(antecedentesPessoais.setDurationPreviousPsych());
        layout4.getChildren().add(pastApproachLabel);
        layout4.getChildren().add(antecedentesPessoais.setPastPsychApproach());
        layout4.getChildren().add(antecedentesPessoais.setOtherPastApproach());
        layout4.getChildren().add(currentPsychLabel);
        layout4.getChildren().add(antecedentesPessoais.setCurrentPsych());
        layout4.getChildren().add(numberOfSessionsLabel);
        layout4.getChildren().add(antecedentesPessoais.setNumberOfSessions());
        layout4.getChildren().add(currentApproachLabel);
        layout4.getChildren().add(antecedentesPessoais.setCurrentApproach());
        layout4.getChildren().add(antecedentesPessoais.setOtherCurrentApproach());
        layout4.getChildren().add(psych);
        layout4.getChildren().add(pastPillsLabel);
        layout4.getChildren().add(antecedentesPessoais.setPastMedication());
        layout4.getChildren().add(antecedentesPessoais.setPastMedication2());
        layout4.getChildren().add(beginningAgeLabel);
        layout4.getChildren().add(antecedentesPessoais.setBegginingAgePills());
        layout4.getChildren().add(currentPillsLabel);
        layout4.getChildren().add(antecedentesPessoais.setCurrentMedication());
        layout4.getChildren().add(antecedentesPessoais.setBegginingDatePills());
        layout4.getChildren().add(suicideAttemptsLabel);
        layout4.getChildren().add(antecedentesPessoais.setSuicideAttempts());
        layout4.getChildren().add(numberAttemptsLabel);
        layout4.getChildren().add(antecedentesPessoais.setNumberSuicideAttempts());
        layout4.getChildren().add(mostRecentDateLabel);
        layout4.getChildren().add(antecedentesPessoais.setDateRecentAttempt());
        layout4.getChildren().add(button4);
        
        ScrollPane layout4Pane = new ScrollPane();
        layout4Pane.setContent(layout4);
        layout4.setPadding(new Insets(10, 20, 20, 10));
        
        scene4 = new Scene(layout4Pane);

        cardStage.setWidth(width);
        cardStage.setHeight(height);

        cardStage.setScene(scene1);
        cardStage.show();
    }
    public void actionPerformed(ActionEvent e){
        try {
            File.csvFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public static void main(String[] args){
        launch(args);
    }
}
