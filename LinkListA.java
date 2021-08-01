import java.util.Scanner;

public class LinkListA {
    public static LinkListNode CreateLinkedList() {

        //NODE CREATION
        LinkListNode<Integer> one = new LinkListNode<>(42);
        LinkListNode<Integer> two = new LinkListNode<>(31);
        LinkListNode<Integer> three = new LinkListNode<>(22);
        LinkListNode<Integer> four = new LinkListNode<>(39);

        //NODE CONNECTION
        one.next = two;
        two.next = three;
        three.next = four;

        return one;
    }

    public static LinkListNode<Integer> insert(LinkListNode<Integer> head, int pos, int data) {
        if (pos == 0) {
            LinkListNode<Integer> currentnode = new LinkListNode<>(data);
            currentnode.next = head;
            return currentnode;
        }

        LinkListNode<Integer> previousnode = head;
        for (int i = 1; i < pos; i++) {
            if (previousnode == null) { // if(previousnode==null) means that position is greater than length of Linked List.
                return head;        // we do not need to insert anything so we return head as it is.
            }
            previousnode = previousnode.next;
        }
        LinkListNode<Integer> currentnode = new LinkListNode<>(data);
        currentnode.next = previousnode.next;
        previousnode.next = currentnode;
        return head;
    }

    public static LinkListNode<Integer> deleteNode(LinkListNode<Integer> head, int pos) {
        if (pos == 0) {
            head = head.next;
            return head;
        }
        LinkListNode<Integer> previousnode = head;

        for (int i = 1; i <= pos; i++) {
            if (i == pos && previousnode.next.next != null) {
                previousnode.next = previousnode.next.next;
                return head;
            } else if (i != pos && previousnode != null && previousnode.next.next != null) {
                previousnode = previousnode.next;
            } else if (i == pos && previousnode.next != null && previousnode.next.next == null) { // LAST ELEMENT
                previousnode.next = null;
                return head;
            } else
                return head;
        }
        return head;
    }

    public static LinkListNode<Integer> appendLastToFirstAlternate(LinkListNode<Integer> head, int n) { //HARD
        if (n == 0 || head == null) {
            return head;
        }
        int length = length(head);

        LinkListNode<Integer> temp = head;
        LinkListNode<Integer> temp2 = head;

        int count = 0;
        while (count < length - n - 1) {
            temp = temp.next;
            count++;
        }

        head = temp.next;
        temp.next = null;

        LinkListNode<Integer> tHead = head;
        while (tHead.next != null) {
            tHead = tHead.next;
        }

        tHead.next = temp2;

        return head;
    }

    public static LinkListNode<Integer> appendLastNToFirst(LinkListNode<Integer> head, int n) {
        if (n == 0) {
            return head;
        }
        if (head == null) {
            return head;
        }
        LinkListNode<Integer> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        LinkListNode<Integer> secondlastnode = head;
        int count = 1;
        while (count <= n) {
            while (secondlastnode.next.next != null) {
                secondlastnode = secondlastnode.next;
            }

            tail.next = head;
            head = tail;
            tail = secondlastnode;
            tail.next = null;
            secondlastnode = head;
            count++;
        }
        return head;
    }

    public static LinkListNode EnterValuesforLinkList() {
        LinkListNode<Integer> currentNode;
        LinkListNode<Integer> head = null;
        LinkListNode<Integer> tail = null;
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        while (value != -1) {

            currentNode = new LinkListNode<>(value);

            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            value = scan.nextInt();
        }
        return head;
    }

    public static void PrintLinkedList(LinkListNode<Integer> head) {

//        if(head==null){              // LAST CASE
////            System.out.println(head.data);// PRINT FINAL ELEMENT
//            return;                       // return or else null point Exception After final element is printed
//        }
//        System.out.println(head.data);
//        GenericNode<Integer> temp = head.next;
//        PrintLinkedList(temp);

        //ITERATION ALTERNATIVE
        LinkListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int length(LinkListNode<Integer> head) {
        if (head == null) {
            return 0;
        }
        LinkListNode<Integer> temp = head.next;
        int ans = length(temp) + 1;
        return ans;
    }

    public static LinkListNode<Integer> removeDuplicates(LinkListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkListNode<Integer> temp = head;
        LinkListNode<Integer> temp2 = head.next;
        // int n=length(head);
        while (temp2.next != null) {
            if (!temp.data.equals(temp2.data)) {
                temp2 = temp2.next;
                temp = temp.next;
            } else {
                while (temp2.next != null && temp.data.equals(temp2.data)) {
                    temp.next = null;
                    temp2 = temp2.next;
                }
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        if (temp.data.equals(temp2.data)) {
            temp.next = null;
        }

        return head;
    }
}
