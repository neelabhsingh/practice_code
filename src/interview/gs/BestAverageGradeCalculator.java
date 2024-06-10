package interview.gs;
import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.StringTokenizer;
import java.io.*;
/**
 * A class to find the best average grade from a list of student scores.
 */
public class BestAverageGradeCalculator {
    /**
     * Finds the best average grade from a list of student scores.
     *
     * @param scores A two-dimensional array of strings, where each inner array
     *               contains a student's name and their test score.
     * @return The highest average grade among all students, rounded down to the nearest integer.
     *         If the input is empty, returns 0.
     */
    public static int findBestAverageGrade(String[][] scores){
        Map<String, Integer> studentTotalScore = new HashMap<>();
        Map<String, Integer> studentScoreCount = new HashMap<>();
        processScores(scores, studentTotalScore, studentScoreCount);
        return calculateBestAverageGrade(studentTotalScore, studentScoreCount);
    }
    private static void processScores(String [][] scores, Map<String, Integer> studentTotalScore, Map<String, Integer> studentScoreCount){
        for(String [] score : scores){
            String studentName = score[0];
            int studentScore = Integer.parseInt(score[1]);
            updateStudentScore(studentName, studentScore, studentTotalScore, studentScoreCount);
        }
    }
    private static void updateStudentScore(String studentName, int studentScore, Map<String, Integer> studentTotalScore, Map<String, Integer> studentScoreCount){
        studentTotalScore.put(studentName, studentTotalScore.getOrDefault(studentName, 0) + studentScore);
        studentScoreCount.put(studentName, studentScoreCount.getOrDefault(studentName, 0) +1);
    }

    private static int calculateBestAverageGrade(Map<String, Integer> studentTotalScore, Map<String, Integer> studentTotalScoreCount){
        int bestAverageScore = 0;
        for(Map.Entry<String, Integer> entry : studentTotalScore.entrySet()){
            int totalScore = entry.getValue();
            String studentName = entry.getKey();
            int scoreCount = Optional.ofNullable(studentTotalScoreCount.get(studentName)).orElse(0);
            int averageGrade = scoreCount>0? totalScore/scoreCount : 0;
            bestAverageScore = Math.max(bestAverageScore, averageGrade);

        }
        return bestAverageScore;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of student score");
        int numScore = Integer.parseInt(br.readLine());
        List<String[]> scores = new ArrayList<>();
        System.out.println("Enter student scores in the format: Name Score");
        for(int i=0; i<numScore; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            String studentName = stringTokenizer.nextToken();
            String score = stringTokenizer.nextToken();
            scores.add(new String[]{studentName, score});
        }
        int bestAverageGrade = findBestAverageGrade(scores.toArray(new String[0][0]));
        System.out.println("Best Average Grade:"+ bestAverageGrade);
    }
}
