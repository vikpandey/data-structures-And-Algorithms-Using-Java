package sorting;

public class ElectionWinner {

	public static void main(String[] args) {
	
		int[] voteCast = {1,2,2,2,3,3,3,3,3,2,3,1,1,2,1,2,1,1,3,2,2,1,1,1,1,1,2,3,2,3};
		int[] outputVote = new int[voteCast.length];
		int candidate = 4;
		
		int[] result = election(voteCast, outputVote, candidate);
		System.out.println("result is:- ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
	
	public static int[] election(int[] voteCast, int[] outputVote, int candidate) {
		
		int[] numCandidate = new int[candidate];
		for(int i = 0; i < candidate; i++) {
			numCandidate[i] = 0;
		}
		
		for(int i = 1; i < voteCast.length; i++) {
			numCandidate[voteCast[i]] = numCandidate[voteCast[i]] + 1;
		}
		
		for(int i = 1; i < candidate; i++) {
			numCandidate[i] = numCandidate[i] + numCandidate[i-1];
		}
		
		for(int i = 1; i < voteCast.length; i++) {
			outputVote[numCandidate[voteCast[i]]-1] = voteCast[i];
		}
		
		return outputVote;
	}
}

