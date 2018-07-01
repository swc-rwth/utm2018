
package tools;

import publications.Publication;

public class AdminTool extends BibTool {

	public void add(Publication publ) {
		this.getBibliography().add(publ);
	}

	public void remove(String id) {
	   this.getBibliography().remove(id);
	}

	
}