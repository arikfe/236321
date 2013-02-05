package org.voting;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataBase
{
	private List<Committee> membersList;
	private Committee chairman;
	private List<Candidate> candidates;
	private List<Voter> voters;
	private List<Vote> votes;
	private List<Vote> newVotes;

	/**
	 * 
	 */
	public DataBase()
	{
		super();

		membersList = new ArrayList<Committee>();
		candidates = new ArrayList<Candidate>();
		candidates = new ArrayList<Candidate>();
		voters = new ArrayList<Voter>();
		votes = new ArrayList<Vote>();
		newVotes = new ArrayList<Vote>();
	}

	/**
	 * check if voter exist in the DB
	 * 
	 * @param id
	 *            - id of the voter
	 * 
	 * @return true if the voter exist
	 */
	public boolean isExist(String id)
	{
		Voter voter = new Voter(id, "");
		return voters.contains(voter);
	}

	/**
	 * find and return the voter based on its id
	 * 
	 * @param id
	 *            - id of the voter
	 * @return the Voter From the DB
	 * @throws VoterNotFoundException
	 *             if the voter does not exist
	 */
	public Voter findVoter(String id) throws VoterNotFoundException
	{
		if (!isExist(id))
			throw new VoterNotFoundException(id);

		return voters.get(voters.indexOf(new Voter(id, "")));
	}

	/**
	 * @param id
	 *            - id of the new comittee
	 * @param password
	 *            - password for the new comittee
	 */
	public void addComitteeMember(String id, String password)
	{
		Committee committee = new Committee(id, password);
		if (!membersList.contains(committee))
			membersList.add(committee);
	}

	/**
	 * @param file
	 */
	public void setCandidatesFromFile(File file)
	{

	}

	/**
	 * @return - unmodifiable list of the voters
	 */
	public List<Voter> getVotersList()
	{
		return Collections.unmodifiableList(voters);
	}

	/**
	 * @return - unmodifiable list of the comittees
	 */
	public List<Committee> getCommitteesList()
	{
		return Collections.unmodifiableList(membersList);
	}

	/**
	 * @return - unmodifiable list of the Votes
	 */
	public List<Vote> getVotesData()
	{
		return Collections.unmodifiableList(votes);
	}

	/**
	 * @return -unmodifiable list of the candidates
	 */
	public List<Candidate> getCandidates()
	{
		return Collections.unmodifiableList(candidates);
	}

	/**
	 * @param vote
	 *            the new Vote
	 * @return true if the vote was added
	 */
	public boolean addVote(Vote vote)
	{
		return votes.add(vote);
	}

	/**
	 * mark the voter as voted
	 * 
	 * @param voter
	 *            - the voter to mark
	 * @throws VoterNotFoundException
	 *             - if voter was not found
	 */
	public void markVoted(Voter voter) throws VoterNotFoundException
	{
		if (!voters.contains(voter))
			throw new VoterNotFoundException(voter.getId());
		voter.markVoted();
	}

	public boolean addVoter(String id, String name, String password)
	{
		Voter voter = new Voter(id, name);
		voter.setPassword(password);
		return voters.add(voter);
	}
}
