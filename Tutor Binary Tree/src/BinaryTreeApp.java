// Ini kelas utama, perintah dari kita yang bakal dijalanin sama komputer
public class BinaryTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Format inisialisasi/buat pohon biner
		// Pohon namaVariabel = new Pohon(dataPertama) catetan dataPertama Integer,
		// soalnya di kelas pohon data yang disimpan bentuknya interger.
		Pohon root = new Pohon(5);
		
		// Format Nambah data
		// namaVariabel.insert(dataYangPinginDitambahin) 
		// catetan namaVariabel harus sudah diinisialisasi
		root.insert(10);
		root.insert(12);
		root.insert(14);
		root.insert(9);
		root.insert(7);
		root.insert(8);
		
		// Format Cari data
		// namaVariabel.insert(dataYangPinginDicari) 
		// catetan namaVariabel harus sudah diinisialisasi
		root.find(8);
		root.find(14);
		root.find(25);
		
		
		System.out.println("Print In Order");
		root.PrintInOrder();
		System.out.println("Print Pre Order");
		root.PrintPreOrder();
		System.out.println("Print PostOrder");
		root.PrintPostOrder();
	}

}
