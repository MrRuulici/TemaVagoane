
public class CalatoriB extends VagonCalatori {

	public CalatoriB() {
		super();
		this.cPasageri = 50;
		this.cColete = 400;
	}

	public void blocareGeam() {
		System.out.println("Geamurile s-au blocat");
	}

	public String tipVagon() {
		return "Vagon de tip CalatoriB";
	}
}
