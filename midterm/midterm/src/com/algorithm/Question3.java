package com.algorithm;


import java.util.HashMap;
import java.util.Map;

public class Question3 {
    int[] preOrder;
    int[] inOrder;
    Map<Integer,Integer> map = new HashMap<>();
    int preIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder){

        preOrder = preorder;
        inOrder = inorder;

        int size = inorder.length;

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        TreeNode root = constructTree(0, size - 1);

        return root;
    }

    private TreeNode constructTree(int start, int end) {
        if(start > end) return null;

        TreeNode root = new TreeNode(preOrder[preIndex]);
        preIndex++;

        int index = map.get(root.val);

        root.left = constructTree( start, index - 1);
        root.right = constructTree( index + 1, end);

        return root;
    }
}
