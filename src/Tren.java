
public class Tren {

	private Vagon[] vagoane = new Vagon[15];

	public Tren(Vagon[] vagoane) {
		super();
		this.vagoane = vagoane;
	}

	public boolean equals(Tren tren) {
		int cTotala1 = 0;
		int cTotala2 = 0;

		for (int i = 0; i < vagoane.length; i++) {
			cTotala1 += vagoane[i].getcColete();
		}

		for (int i = 0; i < tren.vagoane.length; i++) {
			cTotala2 += tren.vagoane[i].getcColete();
		}
		if (cTotala1 == cTotala2)
			return true;
		else
			return false;
	}

	public void tipVagoane() {
		for (int i = 0; i < vagoane.length; i++) {
			System.out.println(this.vagoane[i].tipVagon());
		}
	}
}
