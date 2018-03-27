// Ini kelas pohon biner

// Penjelasan
// public Pohon(int data) digunain untuk constructor, intinya untuk inisialisasi/buat kelas pohon biner pada kelas main.
// Contohnya ketika pertama kali buat pohon biner di kelas main

// public void insert(int dataBaru) digunain buat nambah data, 
// dengan catatan harus diinisialisasi terlebih dahulu oleh constructor
// Prinsip pohon biner data di Pohon sebelah kiri harus lebih kecil dari pohon tengah,
// dan di Pohon sebelah kanan harus lebih besar dari pohon tengah.
// Makanya implementasinya data yang pingin ditambahin alias dataBaru dibandingin sama data di pohon tengah alias data
// Kalo lebih kecil dan kosong, data Baru ditaro di pohon kiri. Kalo lebih besar dan kosong, data Baru ditaro di pohon kanan 
// Terus gimana kalo posisinya lebih kecil dan gak kosong, dataBaru dibandingin sama data di pohon kiri, kalo
// posisinya lebih besar dan gak kosong dataBaru dibandingin sama data di pohon kanan,
// gitu terus sampe ketemu lahan yang kosong.
public class Pohon {
	// Inisialisasi data, tetangga pohon kiri, tetangga pohon kanan
	private int data;
	private Pohon kiri;
	private Pohon kanan;
	
	//Constructor
	public Pohon(int data){
		this.data = data;
	}
	
	// Buah nambah data
	// dataBaru = data yang pingin ditambahin.
	// data = data di pohon tengah.
	public void insert(int dataBaru){
		if (dataBaru <= data){
			if(kiri==null){
				kiri = new Pohon(dataBaru);
			}else{
				kiri.insert(dataBaru);
			}
		} else{
			if(kanan==null){
				kanan = new Pohon(dataBaru);
			}else{
				kanan.insert(dataBaru);
			}	
		}
			
	}
	
	// Buah cari data
	// Inputnya data yang dicari
	// Outputnya ada atau tidak, makanya pake boolean (0 atau 1).
	public boolean find(int dataCari){
		if (dataCari == data){
			return true;
		} else if(dataCari < data){
			if (kiri == null){
				return false;
			}else{
				return kiri.find(dataCari);
			}
		} else{
			if (kanan == null){
				return false;
			}else{
				return kanan.find(dataCari);
			}
		}
			
	}
	
	// Di pohon biner ada 3 cara transversing a tree, yaitu
	// 1. in-order, kiri, tengah, kanan
	// 2. pre-order, tengah, kiri, kanan
	// 3. post-order, kiri, kanan, tengah
	public void PrintInOrder(){
		if (kiri!=null){
			kiri.PrintInOrder();
		}
		System.out.println(data);
		if (kanan!=null){
			kanan.PrintInOrder();
		}
	}
	
	public void PrintPreOrder(){
		System.out.println(data);
		if (kiri!=null){
			kiri.PrintPreOrder();
		}
		if (kanan!=null){
			kanan.PrintPreOrder();
		}
	}
	
	public void PrintPostOrder(){
		if (kiri!=null){
			kiri.PrintPostOrder();
		}
		if (kanan!=null){
			kanan.PrintPostOrder();
		}
		System.out.println(data);
	}

}
