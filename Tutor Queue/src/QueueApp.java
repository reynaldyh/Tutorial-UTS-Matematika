
public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AntrianSembako orang = new AntrianSembako(10);
		orang.push("Budi");
		orang.push("Bude");
		orang.push("Buda");
		orang.push("Duda");
		orang.push("Janda");
		orang.push("Ani");
		
		while( !orang.isEmpty() ){
			
			System.out.print(orang.pop());
			System.out.println(" ");
			
		}

	}

}
