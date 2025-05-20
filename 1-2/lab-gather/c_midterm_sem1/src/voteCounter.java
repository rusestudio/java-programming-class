
import java.util.Scanner;

public class voteCounter {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] votes = new int[10]; // Array to store the tally of votes for each candidate
		
		
		// Input loop
		System.out.print("Enter a list of numbers between 0 and 9 (-1 for ending): ");
		
		int vote;
		int totalVoters = 0; // Variable to store the total number of voters
		
		while ((vote = scanner.nextInt()) != -1) {
		if (vote >= 0 && vote <= 9) {
			votes[vote]++; // Increment the vote count for the corresponding candidate
			totalVoters++; // Increment the total number of voters }
		}
		
		// Output voting results System.out.println("Voting results:");
		for (int i = 0; i < votes.length; i++) {
			System.out.println("(No " + i + ", " + votes[i] + ")");
		}
		
		// Count valid and invalid votes 
		int invalidVotes = totalVoters - 1; // Subtract
		// 1 for the ending flag value (-1)
		
		
		// Output additional statistics
		System.out.println("Number of valid votes: " + totalVoters);
		System.out.println("Number of invalid votes: " + invalidVotes);
		System.out.println("Total number of voters: " + (totalVoters + invalidVotes));
		
		
		// Find first place candidates 
		int maxVotes = Integer.MIN_VALUE;
		
		for (int count : votes) {
			if (count > maxVotes) {
				maxVotes = count;
			}
		}
		
		// Output first place candidates System.out.print("1st place candidate(s): ");
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] == maxVotes) {
				System.out.print("No " + i + ", ");
			}
		}
		System.out.println();
		
		// Find second place candidates
		int secondMaxVotes = Integer.MIN_VALUE;
		for (int count : votes) {
			if (count > secondMaxVotes && count < maxVotes) {
				secondMaxVotes = count;
			}
		}
		
		// Output second place candidates
		System.out.print("2nd place candidate(s): ");
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] == secondMaxVotes) {
				System.out.print("No " + i + ", ");
			}
		}
	}
}}