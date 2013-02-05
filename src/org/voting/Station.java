package org.voting;

import javax.swing.JFrame;

public abstract class Station extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1922760989235246252L;
	protected DataBase dataBase;

	/**
	 * @param dataBase
	 */
	public Station(DataBase dataBase)
	{
		super();
		this.dataBase = dataBase;
	}

	/**
	 * 	initialize the station
	 */
	public abstract void initialize();

	/**
	 * @param committee
	 * @return true if the comittee was sucssefully identified
	 */
	public abstract boolean comitteeMemberLogin(Committee committee);

	/**
	 * 	perform backup to the station
	 */
	protected abstract void backup();
}
