//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;

public class SequentialSearchST<Key, Value> {
    private int n;
    private SequentialSearchST<Key, Value>.Node first;

    public SequentialSearchST() {
    }

    public int size() {
        return this.n;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Key key) {
        return this.get(key) != null;
    }

    public Value get(Key key) {
        for(SequentialSearchST<Key, Value>.Node x = this.first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.val;
            }
        }

        return null;
    }

    public void put(Key key, Value val) {
        if (val == null) {
            this.delete(key);
        } else {
            for(SequentialSearchST<Key, Value>.Node x = this.first; x != null; x = x.next) {
                if (key.equals(x.key)) {
                    x.val = val;
                    return;
                }
            }

            this.first = new Node(key, val, this.first);
            ++this.n;
        }
    }

    public void delete(Key key) {
        this.first = this.delete(this.first, key);
    }

    private SequentialSearchST<Key, Value>.Node delete(SequentialSearchST<Key, Value>.Node x, Key key) {
        if (x == null) {
            return null;
        } else if (key.equals(x.key)) {
            --this.n;
            return x.next;
        } else {
            x.next = this.delete(x.next, key);
            return x;
        }
    }

    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue();

        for(SequentialSearchST<Key, Value>.Node x = this.first; x != null; x = x.next) {
            queue.enqueue(x.key);
        }

        return queue;
    }

    public static void main(String[] args) {
        SequentialSearchST<String, Integer> st = new SequentialSearchST();

        for(int i = 0; !StdIn.isEmpty(); ++i) {
            String key = StdIn.readString();
            st.put(key, i);
        }

        Iterator var5 = st.keys().iterator();

        while(var5.hasNext()) {
            String s = (String)var5.next();
            StdOut.println(s + " " + st.get(s));
        }

    }

    private class Node {
        private Key key;
        private Value val;
        private SequentialSearchST<Key, Value>.Node next;

        public Node(Key key, Value val, SequentialSearchST<Key, Value>.Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
}
