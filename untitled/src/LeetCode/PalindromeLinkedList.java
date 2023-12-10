package LeetCode;

import java.util.LinkedList;

public class PalindromeLinkedList {

      //Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public boolean isPalindrome(ListNode head) {
         LinkedList<Integer> nide = new LinkedList<>();
         head.val = 10;
         head.next = new ListNode(nide.get(1));


         return true;

    }

    public static void main(String[] args) {
         LinkedList<Integer> nide = new LinkedList<>();
         int[] arr = {10,20,30,40,50};

        for (int i: arr) {
            nide.add(i);

        }

        System.out.println(ReverLinkedList(nide));

        }

        public static LinkedList<Integer> ReverLinkedList(LinkedList<Integer> list){
            for (int i = list.size()-1; i>=0; i--) {
                int reve = list.get(i);
                int index = 0;
                list.add(reve,index);

                index++;

            };

            return list;
        }
    }
