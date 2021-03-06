package junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import publications.Book;
import publications.WebPublication;
import tools.AdminTool;

public class TestBib {
   
   protected static AdminTool adminTool = new AdminTool();
 
   protected static Book b1 = adminTool.createBook();
   protected static Book b2 = adminTool.createBook();
   protected static WebPublication wp1 = adminTool.createWebPublication();
   
   
   @BeforeClass
   public static void setUp() throws Exception {
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
      
      wp1.setTitle("CD-CI");
      wp1.addAuthor("Andreas Steffens");
      wp1.setYear("2016");
      wp1.setURL("swc.rwth-aachen.de/steffens.pdf");
      
      adminTool.add(b1);
      adminTool.add(b2);
      adminTool.add(wp1);
   }
   
   @Test
   public void testBooksPatterns() {
      String expected = "[id_2] Erich Gamma (2010): Design Patterns, Addison, ISBN 6789" + "\n";
      adminTool.search("Patterns");
      String result = adminTool.export();
      System.out.print(result);
      assertEquals (result, expected);
   }

   @Test
   public void testBooksSoftware() {
      String exp = "[id_1] Ian Sommerville (2013): Software Engineering, Addison, ISBN 12345" + "\n";
      adminTool.search("Software");
      String result = adminTool.export();
      System.out.print(result);
      assertEquals (result, exp);
   }

   @Test
   public void testWPSteffens() {
      String exp = "[id_3] Andreas Steffens (2016): CD-CI, swc.rwth-aachen.de/steffens.pdf" + "\n";
      adminTool.search("Steffens");
      String result = adminTool.export();
      System.out.print(result);
      assertEquals (result, exp);
   }

}
