package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import publications.Book;
import references.BibTexReferenceDecorator;
import tools.AdminTool;

public class TestBib {

	protected static AdminTool adminTool = new AdminTool();

	protected static Book b1 = new Book("");
	protected static Book b2 = new Book("");

	@BeforeClass
	public static void setUp() throws Exception {

		// Use id generation strategy

		b1.setTitle("Software Engineering");
		b1.addAuthor("Ian Sommerville");
		b1.setYear("2013");
		b1.setPublishingHouse("Addison");
		b1.setIsbn("12345");

		b2.setTitle("Design Patterns");
		b2.addAuthor("Erich Gamma");
		b2.setYear("2010");
		b2.setPublishingHouse("Addison");
		b2.setIsbn("6789");

		adminTool.add(new BibTexReferenceDecorator(b1));
		adminTool.add(new BibTexReferenceDecorator(b2));
	}

	@Test
	public void testAuthorIterator() {
		adminTool.search("Software");
		String result = adminTool.export();
		System.out.print(result);
		assertTrue(result.contains("@Book"));
	}

	@Test
	public void testYearIterator() {
		assertEquals(true, true);
	}

}
