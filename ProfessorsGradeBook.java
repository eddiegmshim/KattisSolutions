package placementStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfessorsGradeBook
{
	public static void main(String[] args)
	{
//		String data = "3 11\r\n" + "AB 1 2 3 4 3 2 3 3 2 1 2 35\r\n" + "CD 0 0 1 3 2 2 0 1 1 2 3 25\r\n"
//				+ "EF 5 4 4 3 4 5 1 3 3 5 4 40";
//		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int numberOfAssignments = sc.nextInt();
		int maxTotalScoresOfStudents = 0;
		List<Integer> s_total = new ArrayList<>();
		List<String> studentNames = new ArrayList<>();

		for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++)
		{
			int studentTotalScore = processStudent(sc, numberOfAssignments, studentNames);
			s_total.add(studentTotalScore);

			if (studentIndex == 0 || studentTotalScore > maxTotalScoresOfStudents)
			{
				maxTotalScoresOfStudents = studentTotalScore;
			}
		}

		for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++)
		{
			int s_grade = ((int) Math
					.ceil((double) s_total.get(studentIndex) * 100 / (double) maxTotalScoresOfStudents));
			char grade_char = getLetterGrade(s_grade);
			System.out.print(studentNames.get(studentIndex) + " " + s_total.get(studentIndex) + " " + s_grade + " "
					+ grade_char + "\n");
		}

		sc.close();
	}

	public static int processStudent(Scanner sc, int numberOfAssignments, List<String> studentNames)
	{
		studentNames.add(sc.next());
		int scoreTotal = 0;
		int minScore = 0;
		for (int indexAssignment = 0; indexAssignment < numberOfAssignments; indexAssignment++) // process assignments
		{
			int score = sc.nextInt();
			scoreTotal += score;
			if (indexAssignment == 0 || score < minScore) minScore = score;
		}
		scoreTotal += sc.nextInt(); // process final exam score
		scoreTotal -= minScore;

		return scoreTotal;
	}

	public static char getLetterGrade(int s_grade)
	{
		if (s_grade < 60) return 'F';
		else if (s_grade < 70) return 'D';
		else if (s_grade < 80) return 'C';
		else if (s_grade < 90) return 'B';
		else return 'A';
	}
}
