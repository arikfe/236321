package org.voting;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = Constants.VoterRecord)
public class Voter
{
	@XStreamAlias(value = Constants.VoterName)
	private String name;
	@XStreamAlias(value = Constants.VoterId)
	private String id;

	private String password;
	private boolean voted;
	private long lastVoteTime;

	/**
	 * @param id
	 * @param name
	 * @param password
	 */
	public Voter(String name, String id)
	{
		super();
		this.id = id;
		this.name = name;
		this.voted = false;
		this.lastVoteTime = 0;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @param password
	 * @return true if password is correct
	 */
	public boolean verifyUser(String password)
	{
		return password.equals(this.password);
	}

	/**
	 * @return true if user can vote/revote false else
	 */
	public boolean canChangeVote()
	{
		if (lastVoteTime == 0)
			return true;
		else if (voted
				&& lastVoteTime > System.currentTimeMillis()
						- Constants.revoteTimeInterval)
			return true;
		return false;
	}

	/**
	 * @return the id
	 */
	public synchronized String getId()
	{
		return id;
	}

	/**
	 * @return the name
	 */
	public synchronized String getName()
	{
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Voter))
			return false;
		Voter other = (Voter) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public void markVoted()
	{
		voted = true;
		lastVoteTime = System.currentTimeMillis();
	}

}
