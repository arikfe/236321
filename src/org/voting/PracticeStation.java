package org.voting;

import java.util.Timer;
import java.util.TimerTask;

public class PracticeStation extends ElectionStation
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6380146307505830680L;
	private Timer timer;

	public PracticeStation(DataBase dataBase)
	{
		super(dataBase);
		// TODO Auto-generated constructor stub
	}

	public void timeMessure()
	{
		timer = new Timer();
		TimerTask task = new TimerTask()
		{

			@Override
			public void run()
			{
				// TODO add task to be done

			}
		};
		timer.schedule(task, System.currentTimeMillis()
				+ Constants.practiceTimeInterval);
	}
}
