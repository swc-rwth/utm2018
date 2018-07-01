package junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import publications.Book;
import tools.AdminTool;

public class Test04IteratorBrowsing {
   
   protected static AdminTool adminTool = new AdminTool();
 
   protected static Book b1;
   protected static Book b2;
   protected static Book b3;
   
   
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
      
      b3.setTitle("CD-CI");
      b3.addAuthor("Andreas Steffens");
      b3.setYear("2016");
      b3.setIsbn("987654");
      
      adminTool.add(b1);
      adminTool.add(b2);
      adminTool.add(b3);
   }
   
   @Test
   public void testBookBrowsingByAuthor() {
      assertEquals (false,true);
   }

   @Test
   public void testBookBrowsingByYear() {
	  
      assertEquals (false, true);
   }


}
