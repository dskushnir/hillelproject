package ua.hillel.dskushnir.lesson20;



import java.util.Iterator;


public class Tree implements Iterable <String>{

    public TreeNode root = null;
    private int size;



    public static class TreeNode {

        private String key;
        private TreeNode parent;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(String key, TreeNode parent, TreeNode left, TreeNode right) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        root = null;
        size = 0;
    }


    public boolean isEmpty() {
        return root == null;
    }


    public boolean add(String key) {
        if (key == null) {
            return false;
        }
        int lastElements = size;
        this.root = appendTo(key, root, null);
        return lastElements < size;
    }

    private TreeNode appendTo(String key, TreeNode node, TreeNode parent) {
        TreeNode result = node;
        if (node == null) {
            result = new TreeNode(key, null, null, null);
            result.parent = parent;
            this.size++;
        } else {
            int compare = key.compareTo(node.key);
            if (compare < 0) {
                result.left = appendTo(key, node.left, node);
            } else if (compare > 0) {
                result.right = appendTo(key, node.right, node);
            }
        }
        return result;
    }

    public boolean contains(String string) {

        return contains(root, string);
    }

    private boolean contains(TreeNode node, String string) {
        if (node == null) {
            return false;
        }
        int comp = string.compareTo(node.key);
        if (comp < 0) {
            return contains(node.left, string);
        } else if (comp > 0) {
            return contains(node.right, string);
        } else {
            return true;
        }
    }

    public boolean remove(String string) {
        if (this.contains(string)) {
            root = removeThis(root, string);
            --size;
            return true;
        }
        return false;
    }

    private TreeNode removeThis(TreeNode node, String string) {
        TreeNode p, p2, n;
        if (node.key.equals(string)) {
            TreeNode leftNode, rightNode;
            leftNode = node.left;
            rightNode = node.right;
            if (leftNode == null && rightNode == null)
                return null;
            else if (leftNode == null) {
                p = rightNode;
                return p;
            } else if (rightNode == null) {
                p = leftNode;
                return p;
            } else {
                p2 = rightNode;
                p = rightNode;
                while (p.left != null)
                    p = p.left;
                p.left = leftNode;
                return p2;
            }
        }
        if (string.compareTo(node.key) < 0) {
            n = removeThis(node.left, string);
            node.left = n;
        } else {
            n = removeThis(node.right, string);
            node.right = n;
        }
        return node;
    }

    @Override
    public Iterator<String> iterator() {
        return new BinarySearchTreeIterator(root);
    }

    public static class BinarySearchTreeIterator implements Iterator<String> {

        private TreeNode node;

        public BinarySearchTreeIterator(TreeNode node) {
            if (node != null) {
                this.node = smallestKey(node);
            }
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        private static TreeNode smallestKey(TreeNode n) {
            if (n.left != null) {
                return smallestKey(n.left);
            } else {
                return n;
            }
        }

        @Override
        public String next() {
            String result = node.key;
            if (node.right != null) {
                node = smallestKey(node.right);
            } else {
                while (node.parent != null && node.parent.left != node) {
                    node = node.parent;
                }
                node = node.parent;
            }
            return result;
        }

    }
    public void descOrder(TreeNode node) {
        if (node != null) {
            descOrder(node.right);
            System.out.print(node.key+"," );
            descOrder(node.left);
        }
    }
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (String data : this) stringBuffer.append(data + ",");
        return stringBuffer.toString();
    }

}











