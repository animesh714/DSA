package com.xoriant.leetcode;


public class AddTwoBigNumbers
{
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode l= new ListNode(-1);
		int temp=0;
		int sum=0;
		
		while(l1!=null && l2!=null)
		{
			sum= l1.val+l2.val+temp;
			temp=sum/10;
			addNode(l, sum%10);
			l1=l1.next;
			l2=l2.next;
		}
		
		
		ListNode ln=null;
		if(l1!=null && l2==null)
			ln=l1;
		else if(l2!=null && l1== null)
			ln=l2;
				
		while(ln!=null)
		{
			sum=temp+ln.val;
			temp=sum/10;
			addNode(l, sum%10);
			ln=ln.next;
		}
		if(temp!=0)
		{
			addNode(l, temp);
		}
		return l;
	}
	
	
	public static ListNode addNode(ListNode a, int value)
	{
		if(a.val==-1)
		{
			a.val=value;
			return a;
		}
		ListNode b=a;
		while(a.next!=null)
		{
			a=a.next;
		}
		ListNode temp = new ListNode(value);
		a.next=temp;
		return b;
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
		ListNode j= new ListNode(9,i);
		ListNode k= new ListNode(9,j);
		ListNode l= new ListNode(9,k);
		ListNode m= new ListNode(9,l);
		ListNode n= new ListNode(9,m);
		ListNode o= new ListNode(9,n);
		ListNode p= new ListNode(9,o);
		ListNode q= new ListNode(9,p);
		ListNode r= new ListNode(1,q);
		
		ListNode k1=addTwoNumbers(a, r);
		while (k1!=null)
		{
			System.out.println(k1.val);
			k1=k1.next;
		}
		
	}

}
