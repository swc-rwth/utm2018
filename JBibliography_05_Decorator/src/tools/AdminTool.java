package tools;

import publications.Publication;
import idgeneration.IDFactory;

public class AdminTool extends BibTool {

   public void add(Publication publ) {
      publ.setId(IDFactory.getInstance().newID(publ));
      this.getBibliography().add(publ);
   }

   public void remove(String id) {
      this.getBibliography().remove(id);
   }

}
