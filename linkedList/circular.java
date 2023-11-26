package linkedList;

public class circular {

    static class Node {
        int data;
        Node next;
    }

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;
        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;
        Node newNode, p;
        p = last.next;
        do {
            if (p.data == item) {
                newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;
                if (p == last)
                    last = newNode;
                return last;
            }
            p = p.next;
        } while (p != last.next);
        System.out.println(item + "The given node is not present in the list");
        return last;
    }

    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;
        Node curr = last.next, prev = null;

        // Case 1: If the node to be deleted is the only node in the list
        if (last == last.next && last.data == key) {
            last = null;
            return last;
        }

        // Case 2: If the node to be deleted is the first node
        if (curr.data == key) {
            while (curr.next != last.next) {
                curr = curr.next;
            }
            last.next = last.next.next;
            return last;
        }

        // Case 3: If the node to be deleted is in the middle or at the end
        do {
            if (curr.data == key) {
                prev.next = curr.next;
                if (curr == last)
                    last = prev; // If the last node is deleted, update 'last'
                return last;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != last.next);

        System.out.println(key + " not found in the list");
        return last;
    }

    static void traverse(Node last) {
        Node p;
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
    }

    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);
        traverse(last);
        System.out.println(" ");
        deleteNode(last, 8);
       
        traverse(last);
    }
}
