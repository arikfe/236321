package org.voting;

public class Constants
{
	public static final long SEC_IN_MILISEC = 1000;
	public static final long MINUTE_IN_MILISEC = SEC_IN_MILISEC * 60;
	public static final long HOUR_IN_MILISEC = MINUTE_IN_MILISEC * 60;
	public static final long revoteTimeInterval = 3 * MINUTE_IN_MILISEC;
	public static final long practiceTimeInterval = 5 * MINUTE_IN_MILISEC;
	public static final int maxCandidatesPerPage = 10;
	
	public static final String main_votingRecord = "votingRecords";
	public static final String CandidateRecord = "votingRecord";
	public static final String CandidatName = "recordName";
	public static final String CandidateSymbol = "ballotLetters";
	
	public static final String main_Voters = "voters";
	public static final String VoterRecord = "voter";
	public static final String VoterName = "name";
	public static final String VoterId = "id";
}
