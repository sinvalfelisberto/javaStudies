package entities;

public class Student {
    private String name;
    private Double firstGrade;
    private Double secondGrade;
    private Double thirdGrade;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setFirstGrade(Double score) {
        this.firstGrade = score;
    }

    public Double getFirstGrade() {
        return this.firstGrade;
    }

    public void setSecondGrade(Double score) {
        this.secondGrade = score;
    }

    public Double getSecondGrade() {
        return this.secondGrade;
    }

    public void setThirdGrade(Double score) {
        this.thirdGrade = score;
    }

    public Double getThirdGrade() {
        return this.thirdGrade;
    }

    public Double getFinalGrade() {
        return getFirstGrade()
                + getSecondGrade()
                + getThirdGrade();
    }

    public String result(Double finalGrade) {
        if (finalGrade < 60.0) {
            return "FAILED";
        }
        return "PASS";
    }

    public Double getMissingPoints(Double finalGrade) {
        return 60.0 - finalGrade;
    }

    public String toString() {
        String result = result(getFinalGrade());
        if (result.contains("FAILED")) {
            return "FINAL GRADE = "
                    + String.format("%.2f", getFinalGrade())
                    + "\n"
                    + result
                    + "\n"
                    + "MISSING "
                    + String.format("%.2f", getMissingPoints(getFinalGrade()))
                    + " POINTS";
        }
        return "FINAL GRADE = "
                + String.format("%.2f", getFinalGrade())
                + "\n"
                + "PASS";
    }
}
