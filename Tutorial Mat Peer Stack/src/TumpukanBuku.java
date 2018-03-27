// Kelas stack bernama TumpukanBuku, disini saya nyontohin pake String atau formatnya text.
// Prinsip kerja stack last in, first out (LIFO).
// Bisa diibaratin kayak tumpukan piring, biar aman dan gak rusak dikeluarinnya dari atas satu persatu.
public class TumpukanBuku {
	// Buat nentuin maksimum panjang dari stack.
	private int maxSize;
	
	// Ini stacknya namanya disini stackArray.
	private String[] stackArray;
	
	// Indeks dari posisi stack yang paling atas.
	private int top;
	
	// Ini constructor dari Kelas TumpukanBuku
	public TumpukanBuku(int s){
		// Inisialisasi maksimum panjang dari stack.
		maxSize = s;
		
		// Inisialisasi array dari stack tipe datanya string kalo mau ganti angka
		// tulisan stringnya ganti jadi int (kalo angka bulet)
		// kalo angka koma bisa pake float atau double
		stackArray = new String[maxSize];
		
		// Nilai inisialisasi -1 soalnya indeks array kan mulainya dari 0,
		// jadi kan data pertama dari array indeksnya 0, makanya kalo gak ada datanya nilainya -1
		top =-1;
	}
	
	// Fungsinya untuk nambahin data ke tumpukan paling atas dari stack
	// kenapa topnya ++top, soalnya indeksnya naik satu
	// Misal stacknya kosong kan indeksnya -1 fungsi ++top buat ganti jadi indeks selanjutnya
	// dalam hal ini ya 0, dan begitu seterusnya
	public void push(String namaBuku){
		if (top!=maxSize-1)
		stackArray[++top] = namaBuku;
		else System.out.println("Stack is Full");
	}
	
	// Fungsinya untuk ngeluarin data di tumpukan paling atas dari stack
	// Namanya udah dikeluarin data yang udah dikeluarin gak ada lagi didalam stack
	public String pop(){
		if (top!=-1)
			return stackArray[top--];
		else return "Stack is Empty";
	}
	
	//
	public void remove(){
		top--;
	}
	
	// Fungsinya untuk ngeliat isi data di tumpukan paling atas dari stack
	// Namanya juga ngintip datanya gak ilang dari stack
	public String peek(){
		return stackArray[top];
	}
	
	// Seperti yang udah dibilang sebelumnya kalo kosong kan stack arraynya -1
	// jadi top =-1, terus top == -1, hasilnya jadi true, kalo nilai top selain satu
	// hasilnya false
	public boolean isEmpty(){
		return (top == -1);
	}
	
	// kan array indeksnya dari 0, contoh misalnya maksimalnya aja 5 (maxSize =5) indeksnya 0 1 2 3 4
	// nah indeks maksimalnya 4, maka maxSize-1.  Jadi kalo arraynya udah full
	// posisi top tuh ada indeks maksimal kan, makanya returnnya true, kalo bukan maksimal berarti nilai top
	// tidak sama dengan maxSize-1, makanya nilai returnnya false.
	public boolean isFull(){
		return (top == maxSize-1);
	}
	

}
