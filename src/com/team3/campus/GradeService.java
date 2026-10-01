package com.team3.campus;

public class GradeService {
    public String getGrade(double average) {

        if (average >= 90) {
            return"A";
        } else if (average >= 80) {
            return"B";
        } else if (average >= 70) {
            return"C";
        } else if (average >= 60) {
            return"D";
        } else {
            return"F(과락";
        }
    }

    public String makeReport(int score1, int score2, int score3) {
        if (score1 < 0 || score1 > 100 ||
                score2 < 0 || score2 > 100 ||
                score3 < 0 || score3 > 100) {
            return " 점수는 0~100 사이로 입력하세요.";
        }

        ScoreCalculator calc = new ScoreCalculator();
        int sum = calc.getSum( score1,score2, score3);
        double Average= calc.getAverage(sum, 3);
        int min =calc.getMin(score1,score2,score3);

        String grade;
        if (min < 40){
            grade= "F (과락)";
        } else {
            grade=getGrade(Average);

        }

        return "총점"+ sum +"점, 평균"+ Average + "점, 등급" +grade;
    }

}
