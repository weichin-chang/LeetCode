public class AddTwoNumber {

    /***
     * An inner class for Singly-linked list.
     */
    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Used to save the temporary result
        ListNode temp = new ListNode(0);
        ListNode result = temp;

        int sum, carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            temp.next = new ListNode(sum % 10);
            carry = sum / 10;

            temp = temp.next;
        }
        return result.next;
    }

    private static void printNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.print(System.lineSeparator());
    }

    private static void print(ListNode l1, ListNode l2, ListNode sum) {
        printNode(l1);
        printNode(l2);
        printNode(sum);
    }

    private static ListNode arrayToList(int[] numbers) {
        ListNode root = null;
        for (int j : numbers) {
            root = insert(root, j);
        }
        return root;
    }

    private static ListNode insert(ListNode node, int value) {
        ListNode next = new ListNode(value, null);
        ListNode temp;

        if (node == null) {
            node = next;
        } else {
            temp = node;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = next;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode l1, l2, sum;
        l1 = arrayToList(new int[]{2, 3, 4});
        l2 = arrayToList(new int[]{5, 6, 4});
        sum = addTwoNumbers(l1, l2);
        print(l1, l2, sum);

        l1 = arrayToList(new int[]{0});
        l2 = arrayToList(new int[]{0});
        sum = addTwoNumbers(l1, l2);
        print(l1, l2, sum);

        l1 = arrayToList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = arrayToList(new int[]{9, 9, 9, 9});
        sum = addTwoNumbers(l1, l2);
        print(l1, l2, sum);
    }
}