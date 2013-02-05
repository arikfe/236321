package org.voting;

public class Vote
{
	private long serialNumber;
	private String candidateSymbol;

	/**
	 * @param serialNumber
	 * @param candidateSymbol
	 */
	public Vote(long serialNumber, String candidateSymbol)
	{
		super();
		this.serialNumber = serialNumber;
		this.candidateSymbol = candidateSymbol;
	}

	/**
	 * @return the serialNumber
	 */
	public synchronized long getSerialNumber()
	{
		return serialNumber;
	}

	/**
	 * @return the candidateSymbol
	 */
	public synchronized String getCandidateSymbol()
	{
		return candidateSymbol;
	}
}
