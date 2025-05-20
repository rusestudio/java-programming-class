package labw2;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        double[][] score = {
            {1, 90, 57, 84},
            {2, 86, 33, 75},
            {3, 27, 90, 77},
            {4, 50, 71, 53},
            {5, 75, 45, 97}
        };

        int students = score.length;
        int subjects = score[0].length - 1; // (C, Java, Python)
        double[] average = new double[subjects];

        // Calculate average 
        for (int i = 1; i <= subjects; i++) {
            double total = 0;
            for (int j = 0; j < students; j++) {
                total += score[j][i];
            }
            average[i - 1] = total / students;  // Store the average for each subject
        }

        // Print averages =
        System.out.printf("평균(C Java Python): %.1f %.1f %.1f%n", average[0], average[1], average[2]);

        // Print students below the average for each subject
        String[] subjectname = {"C", "Java", "Python"};

        for (int i = 0; i < subjects; i++) {
            System.out.print(subjectname[i] + " 평균 미만 학생: ");
            boolean foundBelowAverage = false;

            for (int j = 0; j < students; j++) {
                if (score[j][i + 1] < average[i]) {
                    System.out.print((int)score[j][0] + " "); // Print student id
                    foundBelowAverage = true;
                }
            }

            if (foundBelowAverage) {
                System.out.println();
            }
        }
    }
}