package course;

class Node{ //create node
	
	int data; // store value...default value-- zero
	Node next;//reference(link) to the next node.... here Node is like a datatype (ex:int)      default value-- null
	
	Node(int data) //constructor
	{
		this.data=data; //assign passed value to this node
	}
}



class LinkedList{
	
	Node head,tail;//head-starting point of linkedlist,tail-ending node of the list....initially both are 0
	
	public void insert(int data) {
		
		Node n = new Node(data); //here value passed to the constructor ,so it is---parameterized constructor.....if values not passed--it is just a constructor
	    n.next=null;//new node nest is null.... if we didnt give this line..no problem ..becoz default is null
	    
	    if(head==null){ //if list is empty....if only one node is there--null  ---becoz no next node.....it is first node...it is head as well as tail
	    	
	    	head=n;//new node becomes head
	    	tail= n; //new node also becomes tail
	    }
	    else { //if list already has node.... if there was second node
	    	tail.next=n;//link old tail->new node
	    	tail=n;//update tail tl new node
	    }
	}
	
	
	public void display()
	{
		Node temp=head; //starts from head

	while(temp!=null) //until we reach null
	{
		System.out.println(temp.data);//print node data
		temp=temp.next; // move to next node
	}
	}
}

public class SingleLinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList(); //create an empty linkedlist...l is object name....(new LinkedList )---LinkedList is object
		
		l.insert(10); //insert firstnode....ex:creates node [10]...Since list empty → head = tail = [10].
		l.insert(20);//insert 2nd mode..... ex:creates node [20]...tail.next- points to [20]. Tail moves → [20].
		l.insert(30);//insert 3rd node....creates node [30]...ex:tail.next → [30]. Tail moves → [30]

		l.display();//print all nodes
	}

}
