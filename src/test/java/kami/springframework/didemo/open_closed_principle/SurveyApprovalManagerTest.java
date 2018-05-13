package kami.springframework.didemo.open_closed_principle;

import org.junit.Assert;
import org.junit.Test;

public class SurveyApprovalManagerTest {



    @Test
    public void shouldValidateSurveysCorrecly() {

        SurveyApprovalManager surveyApprovalManager = new SurveyApprovalManager();

        Assert.assertTrue(surveyApprovalManager.processSurvey(new YoutubeSurvey("Pewdiepie", 25)));
        Assert.assertFalse(surveyApprovalManager.processSurvey(new YoutubeSurvey("DavidX", 17)));
        Assert.assertFalse(surveyApprovalManager.processSurvey(new InsuranceSurvey(1204)));
        Assert.assertTrue(surveyApprovalManager.processSurvey(new InsuranceSurvey(1205)));


    }
}
