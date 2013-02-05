package org.voting;

import java.io.File;
import java.util.List;

/**
 * @author arik
 * 
 */
public class ComitteeStation extends Station
{

	private List<VotingStation> votingStations;
	/**
	 * 
	 */
	private static final long serialVersionUID = 9010992471880001697L;
	private Committee currentCommittee;

	public ComitteeStation(DataBase dataBase)
	{
		super(dataBase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initialize()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean comitteeMemberLogin(Committee committee)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void backup()
	{
		// TODO Auto-generated method stub

	}

	/**
	 * @return false if the test has failed test the ComitteeStation
	 */
	public boolean runTestProgram()
	{
		return false;
	}

	/**
	 * Closing procidure of the Comittee station
	 */
	public void closeVotingDay()
	{

	}

	/**
	 * @param id
	 *            - id of the comittee
	 * @param password
	 *            - password of the comittee
	 * @return
	 */
	public boolean chairManLogin(String id, String password)
	{
		/**
		 * use the database to find the comittee using the id compare the
		 * password if true place the comittee from the database to the
		 * currentComittee variable
		 */

		return false;
	}

	/**
	 * @param committee
	 *            - new comitte to add add a new comittee will add nothing if
	 *            the comittee allread in the database
	 */
	public void chairmanAddCommitteeMember(Committee committee)
	{

	}

	/**
	 * @return - true if the connectivity is working
	 * 
	 */
	public boolean checkConectivity()
	{
		return false;
	}

	/**
	 * function check if the voter is in the voting list
	 * 
	 * @param id
	 *            - id of the voter
	 * @return true if the voter is in the voter list
	 * 
	 */
	public boolean identifyVoter(String id)
	{
		return false;

	}

	/**
	 * create new External Voter
	 * 
	 * @param id
	 *            - id of the new voter
	 * @param name
	 *            - name of the new voter
	 * @param password
	 *            - password for the new voter
	 * @return - new Voter to be inserted to the DB
	 */
	public Voter createExternalUser(String id, String name, String password)
	{
		return null;

	}

	/**
	 * 
	 */
	public void collectVotesAndVoters()
	{

	}

	/**
	 * 
	 */
	public void sumAndCompare()
	{

	}

	/**
	 * 
	 */
	public void displayHystogram()
	{

	}

	/**
	 * 
	 */
	public void notifyBadResults()
	{

	}

	/**
	 * @param file
	 */
	public void importVoterFile(File file)
	{

	}
}
