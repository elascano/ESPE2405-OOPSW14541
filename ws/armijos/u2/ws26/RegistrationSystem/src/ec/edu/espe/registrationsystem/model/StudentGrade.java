package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author LogicLegion, DCCO-ESPE
 */

public class StudentGrade {
    private float gradeUnit1;
    private float gradeUnit2;
    private float gradeUnit3;
    private float lastChanceGrade;

    public StudentGrade(float gradeUnit1, float gradeUnit2, float gradeUnit3, float lastChanceGrade) {
        this.gradeUnit1 = gradeUnit1;
        this.gradeUnit2 = gradeUnit2;
        this.gradeUnit3 = gradeUnit3;
        this.lastChanceGrade = lastChanceGrade;
    }

    @Override
    public String toString() {
        return "StudentGrade{" + "gradeUnit1=" + gradeUnit1 + ", gradeUnit2=" + gradeUnit2 + ", gradeUnit3=" + gradeUnit3 + ", lastChanceGrade=" + lastChanceGrade + '}';
    }

    public float getGradeUnit1() {
        return gradeUnit1;
    }

    public void setGradeUnit1(float gradeUnit1) {
        this.gradeUnit1 = gradeUnit1;
    }

    public float getGradeUnit2() {
        return gradeUnit2;
    }

    public void setGradeUnit2(float gradeUnit2) {
        this.gradeUnit2 = gradeUnit2;
    }

    public float getGradeUnit3() {
        return gradeUnit3;
    }

    public void setGradeUnit3(float gradeUnit3) {
        this.gradeUnit3 = gradeUnit3;
    }

    public float getLastChanceGrade() {
        return lastChanceGrade;
    }

    public void setLastChanceGrade(float lastChanceGrade) {
        this.lastChanceGrade = lastChanceGrade;
    }
    
}
