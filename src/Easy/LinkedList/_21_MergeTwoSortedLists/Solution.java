package Easy.LinkedList._21_MergeTwoSortedLists;

/*
*   - Ban dc cho cac dau cua hai danh sach lien ket da dc sap xep list1 va list2
*   - Hop nhat 2 danh sach thanh 1 danh sach da dc sap xep. Danh sach moi nen dc tao bang cach noi cac
*   nut cua 2 danh sach ban dau.
*   - Tra ve dau cac danh sach lien ket da hop nhat.
*   VD1: list1 = [1,2,4], list2 = [1,3,4] => [1,1,2,3,4,4]
*   VD2: list1 = [], list2 = [0] => [0]
*   - Rang buoc
*       + So luong nut cua 2 danh sach nam trong pham vi [0, 50]
*       + -100 <= Node.val <= 100
*       + Ca list1 va list2 deu dc sap xep theo thu tu ko giam
*/

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){ this.val = val; }
        ListNode(int val, ListNode next){ this.val = val; this.next = next; }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dieu kien dung | DKCS
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        // THTQ
        if(list1.val <= list2.val) {
            ListNode nextL1 = list1.next;
            ListNode nextElement = mergeTwoLists(nextL1, list2);
            list1.next = nextElement;
            return list1;
        } else {
            mergeTwoLists(list2, list1);
            return list2;
        }
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(5);
        n1.next = n2; n2.next = n3;

        ListNode L1 = new ListNode(2);
        ListNode L2 = new ListNode(4);
        ListNode L3 = new ListNode(6);
        L1.next = L2; L2.next = L3;
        printLinkedList(n1);
        printLinkedList(L1);

        ListNode newList = mergeTwoLists(null, L3);
        printLinkedList(newList);

        ListNode newList1 = mergeTwoLists(n1, L1);
        printLinkedList(newList1);
    }
}
