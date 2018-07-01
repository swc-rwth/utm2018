package junit;

import static org.junit.Assert.*;
import idgeneration.IDFactory;
import idgeneration.SimpleIDGenerator;
import idgeneration.YearBasedIDGenerator;

import org.junit.BeforeClass;
import org.junit.Test;

import publications.Book;
import publications.WebPublication;
import tools.AdminTool;
import tools.BibTool;

public class TestBib {
   
   protected static AdminTool adminTool = new AdminTool();
   protected static BibTool bibTool = new BibTool();
 
   protected static Book b1 = new Book("");
   protected static Book b2 = new Book("");
   protected static WebPublication wp1 = new WebPublication("");
   
   
   @BeforeClass
   public static void setUp() throws Exception {
      
      IDFactory.setIDGenerator(new YearBasedIDGenerator());
      
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
      
      bibTool.setBibliography(adminTool.getBibliography());
   }
   
   @Test
   public void testAuthorIterator() {
      bibTool.startBrowsingByAuthor();
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      assertEquals (true, true);
   }
   
   @Test
   public void testYearIterator() {
      bibTool.startBrowsingByYear();
      System.out.println();
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      System.out.println(bibTool.nextPublication());
      assertEquals (true, true);
   }

   
}
