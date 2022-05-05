class Stack{
int arr[];
int size;
int top1,top2;
Stack(int n)
{
size  = n;
arr = new int [n];
top1 = n/2+1;
top2 = n/2;
 
}
void push1(int x){
if(top1>0)
{
top1--;
arr[top1] = x;

}
else{
System.out.println("stack overflow"+"by element"+x);
return;
}
}
void push2(int x){
if(top2<size - 1)
{
top2++;
arr[top2] = x;

}
else{
System.out.println("stack overflow"+"by element"+x);
return;
}
}
int pop1(){
if(top1<=size/2){
int x=arr[top1];
top1++;
return x;
}
else {

System.out.println("stack underflow");
System.exit(1);
}
return 0;
}
int pop2(){
if(top2>=size/2+1){
int x=arr[top2];
top2--;
return x;
}
else {

System.out.println("stack underflow");
System.exit(1);
}
return 0;
}

}
class StackApp{
public static void main(String args[]){
Stack s = new Stack(7);
s.push1(5);
s.push1(10);
s.push1(15);
s.push1(11);
s.push1(7);
//s.push2(40);
System.out.println("popped element from stack is"+s.pop1());
s.push2(40);
System.out.println("popped element from stack is"+s.pop2());



}

}