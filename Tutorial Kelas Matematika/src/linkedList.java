public class linkedList {
	Node head;
	
	public void addHead(int data){
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		
	}
	
	public void addTail(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head==null){
			head = node;
		}else{
			Node n = head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void addMiddle(int data,int index){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index==1){
			addHead(data);
		}else{
			Node n = head;
			for(int i=0;i<index-2;i++){
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void print(){
		Node node = head;
		while(node.next!=null){
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	
	}
}
