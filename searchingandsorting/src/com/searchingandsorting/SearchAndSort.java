package com.searchingandsorting;

import java.util.Scanner;

public class SearchAndSort {
	
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
		
			this.data = data;
			this.next = null;
		}
		
	}
	
	private Node head =null;
	private Node tail = null;
	
	void insert(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			head = node;
			tail = node;
		}else
		{
			tail.next= node;
			tail=node;
		}
	}
	
	void linearSearch(int value)
	{
		boolean check = false;
	int i=1;
		if(head == null)
		{
			System.out.println("List is empty");
			
			
		}else
		{
			Node temp = head;
		
			
			while(temp != null)
			{
				if(temp.data == value)
				{
					check = true;
					break;
				}temp = temp.next;
				i++;
			}
		}
		
		if(check)
			
		{
			System.out.println("Element "+value+" is found at position " + i);
		}else
		{
			System.out.println("Element is not found");
		}
	}
	
	Node binarySearch(Node head ,int value)
	{
		
		Node start = head; 
        Node last = null; 
  
        do
        { 
            // Find Middle 
            Node mid = middleNode(start, last); 
  System.out.println("\nmid element "+mid.data +" start "+start.data  );
            // If middle is empty 
            if (mid == null) 
                return null; 
  
            // If value is present at middle 
            if (mid.data == value) 
                return mid; 
  
            // If value is more than mid 
            else if (mid.data < value)  
            { 
                start = mid.next; 
            } 
  
            // If the value is less than mid. 
            else
           last=mid;
            
          
        } while (last == null || last != start); 
  
        // value not present 
        return null; 
    
		
		
	}
	
	 Node middleNode(Node start, Node last) {
		if (start == null) 
            return null; 
  
        Node slow = start; 
        Node fast = start.next; 
  
        while (fast != last) 
        { 
            fast = fast.next; 
            if (fast != last)  
            { 
                slow = slow.next; 
                fast = fast.next; 
            } 
        } 
        return slow; 
	
	}
	 
	 //bubble sort
	 
	 void bubbleSort()
	 {
		 if(head == null)
		 {
			 System.out.println("List is empty");
		 }else
		 {
			 Node current = head;
			 Node nextNode =null;
			 int temp;
			 while(current !=null)
			 {
				 nextNode = current.next;
				 while(nextNode != null)
				 {
				 if(current.data >nextNode.data)
				 {
					 temp = current.data;
					 current.data = nextNode.data;
					 nextNode.data = temp;
				 }nextNode = nextNode.next;
			 }current = current.next;
		 }
		 }
	 }

	void display()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}else
		{
			Node temp = head;
			System.out.println("values are");
			while(temp != null)
			{
				System.out.print(temp.data + " --> ");
				temp=temp.next;
			}
		}
	}
	public static void main(String[] args)
	{
		SearchAndSort searSort = new SearchAndSort();
		SearchAndSort searSort1 = new SearchAndSort();
		/*
		 * searSort.insert(9); searSort.insert(29); searSort.insert(39);
		 * searSort.insert(85); searSort.insert(99); searSort.insert(155);
		 * searSort.insert(165); searSort.linearSearch(59);
		 * 
		 * searSort.display(); searSort.head =searSort.binarySearch(searSort.head, 165);
		 */
		
		//System.out.println("after binary search" +searSort.head.data);
		//searSort.display();
		
		//searSort.display();
		
		//System.err.println("Value is present");
		char ch;
		int choice;
		do {
		System.out.println("\n...................Searching and sorting ...................");
		System.out.println(" 1.Insert \n2.Linearsearch \n3.BinarySearch \n4.show"
				+ "\n5.Bubblesort");
		System.out.println("Enter the key to choose the functionality");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice)
		{
		
		case 1 :
			
			System.out.println("Enter the element to insert ");
			searSort.insert(sc.nextInt());
			break;
		case 2 :
			System.out.println("Enter the e;ement to search");
			searSort.linearSearch(sc.nextInt());
			break;
		case 3 : 
			System.out.println("enter element to search for binary search ");
			searSort1.head =searSort.binarySearch(searSort.head, sc.nextInt());
			
		
			if(searSort1.head == null)
			{
				System.out.println("value not present");
			}
			else
			{
				System.out.println("Value present");
			}
			break;
		case 4:
			searSort.display();
			break;
			
		case 5:
			searSort.bubbleSort();
			searSort.display();break;
		default : 
			
			System.out.println("Enter valid numbers");
		}}while(true);
	}
	
}
