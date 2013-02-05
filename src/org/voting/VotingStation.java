package org.voting;

import java.util.List;

public class VotingStation extends ElectionStation
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5340570730300972585L;

	public VotingStation(DataBase dataBase)
	{
		super(dataBase);
		// TODO Auto-generated constructor stub
	}

	public boolean updateCommitteeStation()
	{
		return rootPaneCheckingEnabled;

	}

	/**
	 * should be added Candidate as variable
	 */
	public void ChangeVote()
	{

	}

	/**
	 * @param station
	 *            - the station to connect to
	 * @return true if connect was succseful
	 */
	public boolean connect(Station station)
	{
		return false;

	}

	public List<Vote> getVotesFromStation()
	{
		return null;

	}
}
