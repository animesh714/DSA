package com.xoriant.leetcode;



// Does not work for ListNode which have value that LONG cannot accommodate.


//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		long i1=l1.val,i2=l2.val;
		int i=1;
		while(l1.next!=null)
		{
			l1=l1.next;
			i1=(long) (i1+l1.val*(Math.pow(10, i)));
			i++;
		}
		i=1;
		while(l2.next!=null)
		{
			l2=l2.next;
			i2=(long) (i2+l2.val*(Math.pow(10, i)));
			i++;
		}
		System.out.println(i1);;
		System.out.println(i2);
		long n= i1+i2; //807
		System.out.println(n);
		
		long w=10l;
		ListNode ln= new ListNode();
		ln.val=(int) (n%w);
		System.out.println(ln.val);
		n=n/10;
		while(n!=0)
		{
			
			ListNode temp= new ListNode();
			temp.val=(int)(n%w);
			ln=addListNode(ln, temp);
			n=n/10;

		}
		return ln;
	}
	public ListNode addListNode(ListNode a, ListNode b) 
	{
		ListNode temp = a;
		while (temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=b;
		return a;
	}
	public static void main(String[] args)
	{
		ListNode a= new ListNode(9);
		ListNode b= new ListNode(9,a);
		ListNode c= new ListNode(9,b);
		ListNode d= new ListNode(9,c);
		ListNode e= new ListNode(9,d);
		ListNode f= new ListNode(9,e);
		ListNode g= new ListNode(9,f);
		ListNode h= new ListNode(9,g);
		ListNode i= new ListNode(9,h);
		ListNode j= new ListNode(1,i);
		AddTwoNumbers t= new AddTwoNumbers();
		ListNode k=t.addTwoNumbers(a, j);
		while (k.next!=null)
		{
			System.out.println(k.val);
			k=k.next;
		}
		System.out.println(k.val);
		
	}
	public static void print(ListNode k)
	{
		while (k.next!=null)
		{
			System.out.println(k.val);
			k=k.next;
		}
		System.out.println(k.val);
	}

}
