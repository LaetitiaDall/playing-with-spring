package kami.springframework.didemo.open_closed_principle;

public class YoutubeSurvey extends Survey {

    private String youtuberName;
    private Integer age;

    public YoutubeSurvey(String youtuberName, Integer age) {
        this.youtuberName = youtuberName;
        this.age = age;
    }

    @Override
    public boolean isValid() {
        System.out.println("Validating Youtube Survey for major users...");
        return age > 18;
    }
}
