package org.voting;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = Constants.CandidateRecord)
public class Candidate
{
	@XStreamAlias(value = Constants.CandidatName)
	private String name;
	@XStreamAlias(value = Constants.CandidateSymbol)
	private String symbol;
	
	/**
	 * @param name
	 * @param symbol
	 */
	public Candidate(String name, String symbol)
	{
		super();
		this.name = name;
		this.symbol = symbol;
	}

	/**
	 * @return the name
	 */
	public synchronized String getName()
	{
		return name;
	}

	/**
	 * @return the symbol
	 */
	public synchronized String getSymbol()
	{
		return symbol;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
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
		if (!(obj instanceof Candidate))
			return false;
		Candidate other = (Candidate) obj;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (symbol == null)
		{
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}

}
