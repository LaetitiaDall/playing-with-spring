package kami.springframework.didemo.open_closed_principle;

public class SurveyApprovalManager {

    public boolean processSurvey(Survey survey) {
        if (survey.isValid()) {
            System.out.println("ClaimApprovalManager: Valid survey. Will do more stuff....");
            return true;
        }
        return false;
    }
}
