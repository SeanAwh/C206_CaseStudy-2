import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private CCA cca1;
	private CCA cca2;
	
	private ArrayList<CCA> ccaList;

	@Before
	public void setUp() throws Exception {
		//xixin
		cca1 = new CCA("Lego Expert", "Designing and building using Lego", 25, 
				"Thursday", "15:00 - 16:00", "Class room A", "Albert");
		cca2 = new CCA("Jewellery Making", "Make a variety of jewellery items",15,
				"Wednesday","15:00 - 16:00", "Class room B", "Malvin");
		
		ccaList= new ArrayList<CCA>();
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@Test
	public void addCCATest() { //xixin
		// CCA list is not null, so that can add a new cca - boundary
		assertNotNull("Check if there is valid CCA arraylist to add to", ccaList);
		//Given an empty list, after adding 1 cca, the size of the list is 1 - normal
		//The cca just added is as same as the first cca of the list
		C206_CaseStudy.addCCA(ccaList, cca1);
		assertEquals("Check that CCA arraylist size is 1", 1, ccaList.size());
		assertSame("Check that CCA is added", cca1, ccaList.get(0));
		
		//Add another cca. test The size of the list is 2? -normal
		//The cca just added is as same as the second cca of the list
		C206_CaseStudy.addCCA(ccaList, cca2);
		assertEquals("Check that Camcorder arraylist size is 2", 2, ccaList.size());
		assertSame("Check that Camcorder is added", cca2, ccaList.get(1));
	}
	@Test
	public void retrieveAllCCATest() { //xixin
		// Test if CCA list is not null but empty -boundary
		assertNotNull("Test if there is valid CCA arraylist to retrieve cca", ccaList);
		
		//test if the list of CCAs retrieved from the SourceCentre is empty - boundary
		String allCCA= C206_CaseStudy.retrieveAllCCA(ccaList);
		String testOutput = "";
		assertEquals("Check that ViewAllCCAlist", testOutput, allCCA);
		
		//Given an empty list, after adding 2 CCAs, test if the size of the list is 2 - normal
		C206_CaseStudy.addCCA(ccaList, cca1);
		C206_CaseStudy.addCCA(ccaList, cca2);
		assertEquals("Test that CCA arraylist size is 2", 2, ccaList.size());
		
		//test if the expected output string same as the list of ccas retrieved from the SourceCentre	
		allCCA= C206_CaseStudy.retrieveAllCCA(ccaList);
		testOutput = String.format("%-20s %-45s %-15s %-15s %-20s %-15s %-15s\n", "Lego Expert", "Designing and building using Lego", 25, 
				"Thursday", "15:00 - 16:00", "Class room A", "Albert");
		testOutput += String.format("%-20s %-45s %-15s %-15s %-20s %-15s %-15s\n","Jewellery Making", "Make a variety of jewellery items",15,
				"Wednesday","15:00 - 16:00", "Class room B", "Malvin");
	
		assertEquals("Test that ViewAllCCAlist", testOutput, allCCA);
		
	}
	@After
	public void tearDown() throws Exception {
		cca1 = null;
		cca2 = null;
		ccaList = null;
	}


}
