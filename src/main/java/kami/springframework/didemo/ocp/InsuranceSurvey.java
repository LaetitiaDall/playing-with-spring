package kami.springframework.didemo.ocp;

public class InsuranceSurvey extends Survey {

    private Integer postalCode;

    public InsuranceSurvey(Integer postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean isValid() {
        System.out.println("Validating Insurance Survey for Plainpalais...");
        return postalCode == 1205;
    }
}
