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

@XStreamAlias(value = Constants.main_Voters)
public class VotersList
{
	@XStreamImplicit(itemFieldName = Constants.VoterRecord)
	private List<Voter> voters;

	public VotersList(Voter... voters)
	{
		super();
		this.voters = Arrays.asList(voters);
	}

	/**
	 * @return - list of voters
	 */
	public List<Voter> getVoters()
	{
		return voters;
	}

	/**
	 * @param file
	 *            - path to
	 * @return
	 * @throws FileNotFoundException  - wrong file format
	 */
	public static List<Voter> createListFromFile(String file) throws FileNotFoundException
	{
		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(VotersList.class);
		VotersList list = null;
		try
		{
			list = (VotersList) xStream.fromXML(new File(file));
		} catch (CannotResolveClassException e)
		{
			throw new FileNotFoundException();
		}
		if (list.getVoters() == null)
			return new ArrayList<Voter>();
		return list.getVoters();

	}
}
