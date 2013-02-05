package org.voting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class CandidateListTest
{

	@Test
	public void testCandidateList()
	{
		Candidate candidate1 = new Candidate("test1", "tst1");
		Candidate candidate2 = new Candidate("test2", "tst2");
		Candidate candidate3 = new Candidate("test3", "tst3");
		CandidateList candidateList1 = new CandidateList();
		CandidateList candidateList2 = new CandidateList(candidate1);
		CandidateList candidateList3 = new CandidateList(candidate1, candidate2);
		CandidateList candidateList4 = new CandidateList(candidate1,
				candidate2, candidate3);
		assertNotNull(candidateList1);
		assertNotNull(candidateList2);
		assertNotNull(candidateList3);
		assertNotNull(candidateList4);
	}

	@Test
	public void testGetVotingRecords()
	{
		Candidate candidate1 = new Candidate("test1", "tst1");
		Candidate candidate2 = new Candidate("test2", "tst2");
		Candidate candidate3 = new Candidate("test3", "tst3");
		CandidateList candidateList1 = new CandidateList();
		assertTrue(candidateList1.getVotingRecords().isEmpty());
		assertEquals(new CandidateList(candidate1).getVotingRecords().size(), 1);
		assertEquals(new CandidateList(candidate1, candidate2)
				.getVotingRecords().size(), 2);
		assertEquals(new CandidateList(candidate1, candidate3, candidate2)
				.getVotingRecords().size(), 3);
	}

	@Test
	public void testCreateListFromFile()
	{
		String filefull = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\votingRecordsUpdated.xml";
		String fileNoItems = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\votingRecordsUpdated0.xml";
		String fileOneItem = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\votingRecordsUpdated1.xml";
		String fileTwoItems = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\votingRecordsUpdated2.xml";
		List<Candidate> candidatesNoItems = null;
		try
		{
			candidatesNoItems = CandidateList.createListFromFile(fileNoItems);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(candidatesNoItems);
		List<Candidate> candidatesOneItems = null;
		try
		{
			candidatesOneItems = CandidateList.createListFromFile(fileOneItem);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(candidatesOneItems);
		List<Candidate> candidatesTwoItems = null;
		try
		{
			candidatesTwoItems = CandidateList.createListFromFile(fileTwoItems);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(candidatesTwoItems);
		List<Candidate> candidatesFullItems = null;
		try
		{
			candidatesFullItems = CandidateList.createListFromFile(filefull);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(candidatesFullItems);
		assertEquals(candidatesNoItems.size(), 0);
		assertEquals(candidatesOneItems.size(), 1);
		assertEquals(candidatesTwoItems.size(), 2);
		assertEquals(candidatesFullItems.size(), 15);
	}

	@Test(expected = FileNotFoundException.class)
	public void testWrongFormat() throws FileNotFoundException
	{
		String filefull = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\voters.xml";
		List<Candidate> list = CandidateList.createListFromFile(filefull);
	}
}
