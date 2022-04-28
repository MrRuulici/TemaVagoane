
public class ClientTren {

	public static void main(String[] args) {

		Vagon v1 = new CalatoriA();
		Vagon v2 = new CalatoriB();
		Vagon v3 = new Marfa();

		Vagon[] vagoane = { v1, v2, v3 };
		Tren tren1 = new Tren(vagoane);
		Tren tren2 = new Tren(new Vagon[] { v1, v2, v3 });
		tren1.tipVagoane();
		System.out.println(v1.getcColete() + ((CalatoriA) v1).getcPasageri());

		if (tren1.equals(tren2))
			System.out.println("Trenurile au acelasi numar de colete");
		else
			System.out.println("Trenurile nu au acelasi numar de colete");
	}

}
