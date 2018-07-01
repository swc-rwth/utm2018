/**
 * 
 */
package publications;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class Publication {

   private String year;

   public String getYear() {
      return year;
   }

   public void setYear(String theYear) {
      year = theYear;
   }

   private String title;

   public String getTitle() {
      return title;
   }

   public void setTitle(String theTitle) {
      title = theTitle;
   }

   private String id;

   public String getId() {
      return id;
   }

   private LinkedList<String> authors;

   public String toString() {
      String authStr = "";
      ListIterator<String> iter = authors.listIterator();
      if (authors.isEmpty()) {
         authStr = "* no authors *";
      } else {
         authStr = iter.next();
         while (iter.hasNext()) {
            authStr = authStr + "; " + iter.next();
         }
      }
      return ("[" + id + "] " + authStr + " (" + year + "): " + title);
   }

   private void init() {
      title = "";
      year = "";
      authors = new LinkedList<String>();
   }

   public void addAuthor(String a) {
      authors.add(a);
   }

   public LinkedList<String> getAuthors() {
      return authors;
   }

   public Boolean containsString(String substr) {
      return (this.toString().contains(substr));
   }

   public Publication(String theID) {
      id = theID;
      this.init();
   }

}