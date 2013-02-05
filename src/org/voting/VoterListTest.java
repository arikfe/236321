package org.voting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class VoterListTest
{

	@Test
	public void testVotersList()
	{
		Voter voter1 = new Voter("test1", "tst1");
		Voter voter2 = new Voter("test2", "tst2");
		Voter voter3 = new Voter("test3", "tst3");
		VotersList voterList1 = new VotersList();
		VotersList voterList2 = new VotersList(voter1);
		VotersList voterList3 = new VotersList(voter1, voter2);
		VotersList voterList4 = new VotersList(voter1, voter2, voter3);
		assertNotNull(voterList1);
		assertNotNull(voterList2);
		assertNotNull(voterList3);
		assertNotNull(voterList4);
	}

	@Test
	public void testGetVoters()
	{
		Voter Voter1 = new Voter("test1", "tst1");
		Voter Voter2 = new Voter("test2", "tst2");
		Voter Voter3 = new Voter("test3", "tst3");
		VotersList VoterList1 = new VotersList();
		assertTrue(VoterList1.getVoters().isEmpty());
		assertEquals(new VotersList(Voter1).getVoters().size(), 1);
		assertEquals(new VotersList(Voter1, Voter2).getVoters().size(), 2);
		assertEquals(new VotersList(Voter1, Voter3, Voter2).getVoters().size(),
				3);
	}

	@Test
	public void testCreateListFromFile()
	{
		String filefull = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\voters.xml";
		List<Voter> list = null;
		try
		{
			list = VotersList.createListFromFile(filefull);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(list);
		assertEquals(list.size(), 3);
		// CannotResolveClassException

	}

	@Test(expected = FileNotFoundException.class)
	public void testWrongFormat() throws FileNotFoundException
	{
		String filefull = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\votingRecordsUpdated.xml";
		List<Voter> list = VotersList.createListFromFile(filefull);
	}

}
