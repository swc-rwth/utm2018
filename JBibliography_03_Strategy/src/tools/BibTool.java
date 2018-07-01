
package tools;

import core.Bibliography;

public class BibTool{

	protected Bibliography bibliography = new Bibliography();


	public Bibliography getBibliography() {
		return bibliography;
	}


	public void setBibliography(Bibliography theBibliography) {
		bibliography = theBibliography;

	}

	public Boolean search(String cr) {
		return this.getBibliography().search(cr);
	}
	
	public String export() {
		return this.getBibliography().export();
	}
	


}