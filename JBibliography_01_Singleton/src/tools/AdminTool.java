package tools;

import publications.Book;
import publications.Publication;
import idgeneration.IDFactory;

public class AdminTool extends BibTool {

   public void add(Publication publ) {
      this.getBibliography().add(publ);
   }

   public void remove(String id) {
      this.getBibliography().remove(id);
   }

   public Book createBook() {
      Book b = new Book(IDFactory.getInstance().newID());
      return b;
   }

}