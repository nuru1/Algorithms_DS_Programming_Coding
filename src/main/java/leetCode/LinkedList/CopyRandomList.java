package leetCode.LinkedList;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/copy-list-with-random-pointer/?envType=study-plan-v2&envId=top-interview-150
public class CopyRandomList {
    Map<Node, Node> map = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {

        if(head == null)
            return null;
        if(map.containsKey(head))
            return map.get(head);
       
        Node newNode = new Node(head.val);
        map.put(head, newNode);
        newNode.next = copyRandomList(head.next);
        newNode.random = copyRandomList(head.random);
        return newNode;
    }
}
