class LinkedList{
Node head;
static class Node{
int data;
Node next;
Node(int d){
data=d;
next = null;
}
}
void display(){
Node n = head;
while(n!=null){
System.out.println(n.data);
n=n.next;
}
}
void append(int new_data){
Node new_node = new Node (new_data);
if(head == null)
{
head = new_node;
return;
}
new_node.next = null;
Node n = head;
while(n.next != null){
n = n.next;
}
n.next = new_node;
return;
}
Node reverse(Node head){
if(head == null){
return head;
}
Node current = head;
Node prev = null;
Node n = null;
while(current != null){
n=current.next;
current.next = prev;
prev = current;
current = n;
}
return prev;
}
void remove(){
	if(head == null){
		return ;
		
	}
	Node current = head;
	while(current != null && current.next != null){
		if(current.data == current.next.data){
			current.next = current.next.next;
			}
		else{
			current = current.next;
		}
	}
	
	
}

public static void main(String args[]){
LinkedList l = new LinkedList();
l.append(2);
l.append(4);
l.append(3);
l.append(4);
l.append(2);
l.append(5);
//l.append(5);
l.head = l.reverse(l.head);
l.remove();
l.display();

}
}
