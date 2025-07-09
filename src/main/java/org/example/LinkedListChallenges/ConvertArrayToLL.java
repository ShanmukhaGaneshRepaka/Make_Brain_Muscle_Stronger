package org.example.LinkedListChallenges;

public class ConvertArrayToLL {
    public static void main(String[] args) {
        int[] arr={1,5,3,2,6};
        ConvertArrayToLL list = new ConvertArrayToLL();
        Node head = list.convertArrToLL(arr);
        list.display(head);
        System.out.println();
        head=list.delete(head,9);
        list.display(head);
    }

    private void display(Node head) {
        while(head!=null)
        {
            System.out.print(head.data+" ");


            head=head.next;
        }
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

        Node(int data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
    Node convertArrToLL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node node= new Node(arr[i]);

            temp.next=node;
            temp=node;
        }

        return head;
    }

    Node deleteHead(Node head)
    {
        if(head==null) return null;

        return head.next;
    }

    Node deleteTail(Node head)
    {
        if(head==null || head.next==null) return null;

        Node temp = head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;

        return head;
    }

    Node delete(Node head,int position)
    {
      if(head==null) return head;
      if(position==1)return head.next;
Node temp=head;
        for (int i = 1; i <position-1 ; i++) {

            if(temp!=null)
                temp=temp.next;

        }
        if(temp.next!=null) {
            temp.next = temp.next.next;
        }

      return head;
    }

    Node deleteValue(Node head,int value)
    {

        if(head==null) return head;

        if(head.data==value)return head.next;

        Node temp=head;
        Node prev=temp;
        while(temp!=null)
        {
            if (temp.data == value) {
              if(prev.next!=null){
                  prev.next=temp.next; break;

              }
            }

            prev=temp;
            temp=temp.next;
        }


        return head;
    }
}
