public class TumpukanBukuApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Format inisialisasi/buat stack
		// namaStack namaVariabel = new namaStack(panjangMaksimalStack) catetan panjangMaksimalStack Integer
		// catetan namaStack = TumpukanBuku
		// namaVariabel numpukBerantakan
		// panjangMaksimalStack = 10
		TumpukanBuku numpukBerantakan = new TumpukanBuku(5);
		
		// Format cara make method
		// namaVariabel.namaMethod(isiMethod);
		// Petunjuk pertama kamu lihat dulu method kelas method (kelas stack TumpukanBuku) 
		// isi didalem kurung method yang mau kamu pake apa
		// Misalnya push isinya String, kalo pop gak ada isinya (makanya isiMethod kamu kosongin aja)
		// Contoh untuk nambahin data pake push, numpukBerantakan.push("Kiat Sukses Ternak Lele");
		// namaVariabelnya = numpukBerantakan, namaMethod = push, isiMethod = "Kiat Sukses Ternak Lele"
		// Contoh untuk nambahin data pake pop, numpukBerantakan.pop();
		// namaVariabel.pop(), dalam contoh ini isiMethod = kosong, hint: peratiin dibagian kelas stack TumpukanBuku
		// bagian method  pop.
		// kalo mau ganti jadi angka pake int atau float aja
		// caranya ubah di kelas stack (TumpukanBuku) bagian push jadi push(int namaBuku) sama 
		// bagian private String[] stackArray; jadi private int[] stackArray; dan terakhir
		// stackArray = new String[maxSize]; jadi stackArray = new int[maxSize];
		System.out.println(numpukBerantakan.pop());
		
		numpukBerantakan.push("Kiat Sukses Ternak Lele");
		numpukBerantakan.push("Siap SBMPTN 2019");
		numpukBerantakan.push("FHM");
		numpukBerantakan.push("Playboy");
		numpukBerantakan.push("Learning to Swear in America");
		numpukBerantakan.push("The Call Me Alexandra Gaston");
		numpukBerantakan.push("Detik detik UN");
		numpukBerantakan.push("Data Structures and Algorithm");
		//System.out.print(numpukBerantakan.peek());
		//System.out.println(" ");
		
		// Buat ngeluarin semua data
		// Intinya selama stacknya belom kosong dipop terus
		// Maksudnya kosong tuh nilai top = -1; (lihat di kelas TumpukanBuku)
		while( !numpukBerantakan.isEmpty() ){
		
			System.out.println(numpukBerantakan.pop());
			
		}
	}
}
