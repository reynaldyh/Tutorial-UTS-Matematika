// Ini kelas utama, perintah dari kita yang bakal dijalanin sama komputer
public class BinaryTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pohon root = new Pohon(5);
		root.insert(10);
		root.insert(12);
		root.insert(14);
		root.insert(9);
		root.insert(7);
		root.insert(8);
		System.out.println("Print In Order");
		root.PrintInOrder();
		System.out.println("Print Pre Order");
		root.PrintPreOrder();
		System.out.println("Print PostOrder");
		root.PrintPostOrder();
	}

}
