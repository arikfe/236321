package org.voting;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class VoterToXmlTest
{

	@Test
	public void testVoter()
	{
		XStream xStream = new XStream(new DomDriver());
		String filefull = "D:\\Dropbox\\cs\\236321\\hw\\HW4\\SingleVoter.xml";
		xStream.alias(Constants.VoterRecord, Voter.class);
		File file = new File(filefull);
		xStream.processAnnotations(Voter.class);
		Voter voter = (Voter)xStream.fromXML(file);
		assertNotNull(voter);
	}

}
