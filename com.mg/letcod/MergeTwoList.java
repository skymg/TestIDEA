package letcod;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;

    }

    public String toString() {
        return val + " ";
    }
}

public class MergeTwoList {
    public static void main(String[] arg) {
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(2);
        ListNode l1_3 = new ListNode(4);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(1);
        ListNode l2_2 = new ListNode(3);
        ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        MergeTwoList mergeTwoList = new MergeTwoList();
        ListNode listNode = mergeTwoList.mergeTwoLists(l1_1, l2_1);
        ListNode temp = listNode;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode resList = new ListNode(0);
        ListNode tmp = resList;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                tmp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if (l1 == null) {
            tmp.next = l2;
        }
        if (l2 == null) {
            tmp.next = l1;
        }
        return resList.next;
    }


}
