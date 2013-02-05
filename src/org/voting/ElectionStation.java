package org.voting;

import java.io.File;

/**
 * @author arik
 *
 */
/**
 * @author arik
 *
 */
/**
 * @author arik
 *
 */
/**
 * @author arik
 * 
 */
public abstract class ElectionStation extends Station
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6867353596901139628L;
	protected int currentDisplayedCandiate;
	protected Voter currentVoter;

	public ElectionStation(DataBase dataBase)
	{
		super(dataBase);
		currentDisplayedCandiate = 0;
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
	 * @param file
	 *            - file contain all the candidates
	 */
	public void loadCandidates(File file)
	{

	}

	/**
	 * show candidates
	 */
	public void showCandidates()
	{

	}

	/**
	 * @param candidate
	 */
	public void vote(Candidate candidate)
	{

	}

	/**
	 * @param id
	 *            - id of the voter
	 * @param password
	 *            - password of the voter
	 * 
	 * 
	 */
	public void voterLogin(String id, String password)
	{
		/**
		 * use the database to find the user using the id compare the password
		 * using voter.verifyUser if true place the voter from the database to
		 * the currentVoter variable
		 */

	}

	/**
	 * show the next Constants.maxCandidatesPerPage cadidates on the screen
	 */
	public void showNext()
	{

	}

	/**
	 * show the previous Constants.maxCandidatesPerPage cadidates on the screen
	 */
	public void showPrevious()
	{

	}

	/**
	 * do we realy need this????
	 */
	public void verifyVoter()
	{

	}

	/**
	 * @param message - message to be displayed to the user
	 * display a message to the user
	 */
	public void notifyUser(String message)
	{

	}
}
