package ua.hillel.dskushnir.lesson20;

public class MyTreeSet {
}

   /* class  MyTreeNode<E extends Comparable> {
    private E data;
    private MyTreeNode<E> left;
    private MyTreeNode<E> right;
    private MyTreeNode<E> parent;

    public MyTreeNode( ) { left = right = parent = null; }
    public MyTreeNode(E d,
                      MyTreeNode<E> l,
                      MyTreeNode<E> r,
                      MyTreeNode<E> p) {
        data = d;
        left = l;
        right = r;
        parent = p;
    }

    public  E getData( ) { return data; }
    public void setData(E d) { data = d; }
    public MyTreeNode<E> getLeft( ) { return left; }
    public void setLeft(MyTreeNode<E> l) { left = l; }
    public MyTreeNode<E> getRight( ) { return right; }
    public void setRight(MyTreeNode<E> r) { right = r; }
    public MyTreeNode<E> getParent( ) { return parent; }
    public void setParent(MyTreeNode<E> p) { parent = p; }

    public String toString( ) {
        String answer = "";
        if (left != null) answer += left.toString( );
        answer += data + " ";
        if (right != null) answer += right.toString( );
        return answer;
    }


public class MyTreeSetyy<E extends Comparable> {
    private MyTreeNode<E> root = null;

    public MyTreeSetyy() {
    }

    public boolean add(E newData) {

        // System.out.println("I am in for add  ELEMENT ====>"+newData);
        if (root == null) {
            root = new MyTreeNode<E>(newData, null, null, null);
            return true;
        } else {
            //System.out.println("I am in ELSE:"+root);
            MyTreeNode<E> current = root;
            System.out.println("ROORT IS ::" + root);
            while (true) {
                // compare data in current with newData
                System.out.println(" urrent.getData( )" + current.getData() + "-----" + newData);
                int comp = current.getData().compareTo(newData);
                //System.out.println("I am in comp:"+comp);
                if (comp > 0) { // insert into left subtree

                    MyTreeNode<E> next = current.getLeft();

                    System.err.println("  I am in > 0 so Adding it to Left:" + newData + "    NExt Left Element is ::" + next);

                    if (next == null) {
                        current.setLeft(new MyTreeNode<E>(newData, null, null, current));
                        return true;
                    } else current = next;
                } else if (comp < 0) { // insert into right subtree

                    MyTreeNode<E> next = current.getRight();
                    System.out.println("  I am in < 0 so Adding it to RIGHT :" + newData + "   NExt Right  Element is ::" + next);
                    if (next == null) {
                        current.setRight(new MyTreeNode<E>(newData, null, null, current));
                        return true;
                    } else current = next;
                } else return false; // data already in tree
            }
        }
    }

    public String toString() {
        if (root == null) return "[ ]";
        return "[ " + root.toString() + "]";
    }

    // tree.remove( tree  );
//  public boolean remove(MyTreeSet<Integer> key) {
//      System.out.println("I am in for REMOVING ELEMENT ====>"+key);
//        return false;
//
//    }
    public boolean remove(E newData) {
        //System.out.println("I am in for REMOVING ELEMENT ====>"+key);

        if (root == null) {
            root = new MyTreeNode<E>(newData, null, null, null);
            System.out.println("IF   ====>" + root);
            return true;
        } else {
            MyTreeNode<E> current = root;
            System.out.println("ELSE   ====>" + root);
            System.out.println(" PARENT IS " + (root.getData().toString()));
            // System.out.println(" getLeft IS "+(root.getLeft().getData().toString()));
            //System.out.println(" getRight IS "+(root.getRight().getData().toString()));
//        if (root.getData().equals(key)){
//            System.out.println("Key Is found to be removed"+key);
//        }
            return false;
        }

    }





  /*  public Iterator iterator(E itr) {

        Iterator iterator;
        //  iterator = tree.iterator();

        // this method should return Iterator

        // List<Integer> list =   MyTreeNode<itr>


        return null;
    }

        // Use iterator to display the vsetes
//    System.out.println("\nTreeSet After: ");
//    for (Iterator i = set.iterator(); i.hasNext();) {
//      Integer integer = (Integer) i.next();
//      System.out.println(integer);
//    }




  /*  public static void main(String[ ]  args) {
        MyTreeSet<Integer> tree = new MyTreeSet<Integer>( );
        for (int i=0; i<5; i++) {
            int x = (int) (Math.random( ) * 100);
            tree.add(x);
            // System.out.print(x + " ");
        }
        System.out.println("Random Elements from the Binary Tree \n" + tree);
        //tree.remove(    new Integer(4)  );
        tree.remove(  new Integer(4)  );
        // E newData

    }*/

