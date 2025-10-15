package DFS;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lc144 {

    // Main class to run the test


        public static void main(String[] args) {
            // 1. Create a sample binary tree
            //        1
            //         \
            //          2
            //         /
            //        3
            TreeNode root = new TreeNode(1);
            root.left = null;
            root.right = new TreeNode(2);
            root.right.left = new TreeNode(3);

            // 2. Create an instance of the Solution class
            Solution solution = new Solution();

            // 3. Call the preorderTraversal method
            List<Integer> result = solution.preorderTraversal(root);

            // 4. Print the result
            // Expected output: [1, 2, 3]
            System.out.println("Preorder Traversal Result: " + result);
        }
    }

    // Definition for a binary tree node (as provided by LeetCode)
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // The LeetCode solution class
    class Solution {
        /**
         * Performs an iterative preorder traversal of a binary tree.
         * Order: Root -> Left -> Right
         * @param root The root node of the tree.
         * @return A list of integers representing the preorder traversal.
         */
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            // A stack is used to simulate the recursive call stack.
            Stack<TreeNode> nodeStack = new Stack<>();

            // If the tree is empty, return an empty list.
            if (root == null) {
                return result;
            }

            // Start the process by pushing the root node onto the stack.
            nodeStack.push(root);

            // Continue until there are no more nodes to visit.
            while (!nodeStack.isEmpty()) {
                // Pop the node from the top of the stack. This is the "visit" step.
                TreeNode currentNode = nodeStack.pop();
                result.add(currentNode.val);

                // IMPORTANT: Push the right child first, so the left child is on top of the stack.
                // Since a stack is LIFO (Last-In, First-Out), the left child will be processed next.
                if (currentNode.right != null) {
                    nodeStack.push(currentNode.right);
                }
                if (currentNode.left != null) {
                    nodeStack.push(currentNode.left);
                }
            }

            return result;
        }
}
