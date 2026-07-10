public class intersection {
    public static Node getInters(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;

        int lenA = 0;
        int lenB = 0;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff-- > 0)
                tempA = tempA.next;
        } else {
            int diff = lenB - lenA;
            while (diff-- > 0)
                tempB = tempB.next;
        }

        while (tempA != null && tempB != null) {
            if (tempA == tempB)
                return tempA;

            tempA = tempA.next;
            tempB = tempB.next;

        }

        return null;
    }
}