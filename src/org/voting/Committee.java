package org.voting;

public class Committee
{
	private String id;
	private String password;
	/**
	 * @param id
	 * @param password
	 */
	public Committee(String id, String password)
	{
		super();
		this.id = id;
		this.password = password;
	}
	/**
	 * @return the id
	 */
	public synchronized String getId()
	{
		return id;
	}
	/**
	 * @return the password
	 */
	public synchronized String getPassword()
	{
		return password;
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
		if (!(obj instanceof Committee))
			return false;
		Committee other = (Committee) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
