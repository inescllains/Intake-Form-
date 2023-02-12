import java.io.FileWriter;
import java.io.IOException;
import com.opencsv.CSVWriter;

public class File {
    
    /**
     * @throws IOException
     */
    public static void csvFile() throws IOException{
        PersonalData dadosPessoais = new PersonalData();
        PersonalData2 dadosPessoais2 = new PersonalData2();
        Female feminino = new Female();
        PersonalData antecedentesPessoais = new PersonalData();

        CSVWriter csvWriter = new CSVWriter(new FileWriter(dadosPessoais.getFirstName() + dadosPessoais.getLastName() + ".csv"));
        csvWriter.writeNext(new String[]{"sess_date", dadosPessoais.getSessDate()});
        csvWriter.writeNext(new String[]{"patient_id", dadosPessoais.getPatientID()});
        csvWriter.writeNext(new String[]{"dob", dadosPessoais.getDob()});
        csvWriter.writeNext(new String[]{"first_name", dadosPessoais.getFirstName()});
        csvWriter.writeNext(new String[]{"last_name", dadosPessoais.getLastName()});
        csvWriter.writeNext(new String[]{"gender", dadosPessoais.getGender()});
        csvWriter.writeNext(new String[]{"trans", dadosPessoais.getTrans()});
        csvWriter.writeNext(new String[]{"studies_y", dadosPessoais.getStudiesY()});
        csvWriter.writeNext(new String[]{"child", dadosPessoais.getChild()});

        csvWriter.writeNext(new String[]{"employment", dadosPessoais2.getEmployment()});
        csvWriter.writeNext(new String[]{"contract", dadosPessoais2.getExtraEmployment()});
        csvWriter.writeNext(new String[]{"rel_status", dadosPessoais2.getHousehold()});
        csvWriter.writeNext(new String[]{"household", dadosPessoais2.getHousehold()});
        csvWriter.writeNext(new String[]{"height", dadosPessoais2.getHeight()});
        csvWriter.writeNext(new String[]{"weight", dadosPessoais2.getWeight()});
        csvWriter.writeNext(new String[]{"bran", dadosPessoais2.getBran()});
        csvWriter.writeNext(new String[]{"negr", dadosPessoais2.getNegr()});
        csvWriter.writeNext(new String[]{"amer", dadosPessoais2.getAmer()});
        csvWriter.writeNext(new String[]{"asia", dadosPessoais2.getAsia()});
        csvWriter.writeNext(new String[]{"ciga", dadosPessoais2.getCiga()});
        csvWriter.writeNext(new String[]{"outr", dadosPessoais2.getOutr()});

        csvWriter.writeNext(new String[]{"prg", feminino.getPregnant()});
        csvWriter.writeNext(new String[]{"weeks", feminino.getWeeks()});
        csvWriter.writeNext(new String[]{"delivery", feminino.getBirth()});
        csvWriter.writeNext(new String[]{"date_delivery", feminino.getDateBirth()});
        csvWriter.writeNext(new String[]{"complications", feminino.getComplications()});
        csvWriter.writeNext(new String[]{"family_support", feminino.getFamilySupport()});

        csvWriter.writeNext(new String[]{"past_psi", antecedentesPessoais.getPastPsych()});
        csvWriter.writeNext(new String[]{"past_psi_duration", antecedentesPessoais.getDurationPreviousPsych()});
        csvWriter.writeNext(new String[]{"past_psi_type", antecedentesPessoais.getPastApproach()});
        csvWriter.writeNext(new String[]{"current_psi", antecedentesPessoais.getCurrentPsych()});
        csvWriter.writeNext(new String[]{"sessons_2_month", antecedentesPessoais.getNumberOfSessions()});
        csvWriter.writeNext(new String[]{"current_psi_type", antecedentesPessoais.getCurrentApproach()});
        csvWriter.writeNext(new String[]{"past_psy_meds", antecedentesPessoais.getPastMedication()});
        csvWriter.writeNext(new String[]{"past_psy_meds_age_start", antecedentesPessoais.getBegginingAgePills()});
        csvWriter.writeNext(new String[]{"past_psy_meds_specialty", antecedentesPessoais.getPastMedication2()});
        csvWriter.writeNext(new String[]{"current_psy_meds", antecedentesPessoais.getCurrentMedication()});
        csvWriter.writeNext(new String[]{"current_psy_meds_date_start", antecedentesPessoais.getBegginingDatePills()});
        csvWriter.writeNext(new String[]{"suicide_his", antecedentesPessoais.getSuicideAttempts()});
        csvWriter.writeNext(new String[]{"suicide_his_number", antecedentesPessoais.getNumberSuicideAttempts()});
        csvWriter.writeNext(new String[]{"suicide_his_date_last", antecedentesPessoais.getDateRecentAttempt()});

        csvWriter.close();
    }
}
