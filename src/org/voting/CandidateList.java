package org.voting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.CannotResolveClassException;

/**
 * @author arik
 *
 */
@XStreamAlias(value = Constants.main_votingRecord)
public class CandidateList
{
	@XStreamImplicit(itemFieldName = Constants.CandidateRecord)
	private List<Candidate> votingRecords;

	public CandidateList(Candidate... candidates)
	{
		super();
		this.votingRecords = Arrays.asList(candidates);
	}

	/**
	 * @return - list of candidates
	 */
	public List<Candidate> getVotingRecords()
	{
		return votingRecords;
	}

	/**
	 * @param file
	 *            - path to XML input file
	 * @return - list of candidates
	 * @throws FileNotFoundException
	 *             - - wrong file format
	 */
	public static List<Candidate> createListFromFile(String file)
			throws FileNotFoundException
	{
		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(CandidateList.class);
		CandidateList list = null;
		try
		{
			list = (CandidateList) xStream.fromXML(new File(file));
		} catch (CannotResolveClassException e)
		{
			throw new FileNotFoundException();
		}

		if (list.getVotingRecords() == null)
			return new ArrayList<Candidate>();
		return list.getVotingRecords();

	}
}
