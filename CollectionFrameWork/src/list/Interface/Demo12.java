package list.Interface;

public class Demo12 {

	public static void main(String[] args) {
		String[][] darr = { { "Abhi", "Awni", "Arvind" }, { "Bbhi", "Bwni", "Brvind", "Bahadur" },
				{ "Cbhi", "Cwni", "Crvind" } };

		System.out.println(darr.length);
		System.out.println(darr[0][2]);
		System.out.println();
		for (int i = 0; i < darr.length; i++) {
			for (String str : darr[i]) {
				System.out.print(str);
				System.out.print(" ");
			}
			System.out.println();

		}
	}

}
