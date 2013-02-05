package org.voting;

public class VoterNotFoundException extends VotionException
{
	private String id;

	/**
	 * @param id
	 */
	public VoterNotFoundException(String id)
	{
		super();
		this.id = id;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6970486986917487694L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getCause()
	 */
	@Override
	public Throwable getCause()
	{
		// TODO Auto-generated method stub
		return super.getCause();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage()
	{
		// TODO Auto-generated method stub
		return "Voter with id " + id + " was not found";
	}

}
