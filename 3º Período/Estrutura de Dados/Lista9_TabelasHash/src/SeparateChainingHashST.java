//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Iterator;

public class SeparateChainingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;
    private int n;
    private int m;
    private SequentialSearchST<Key, Value>[] st;

    public SeparateChainingHashST() {
        this(4);
    }

    public SeparateChainingHashST(int m) {
        this.m = m;
        this.st = new SequentialSearchST[m];

        for(int i = 0; i < m; ++i) {
            this.st[i] = new SequentialSearchST();
        }

    }

    /************ QUESTÃO 1 ****************/
    public void colocaNaLista(Key key, Value value, int i){
        this.st[i].put(key, value);
    }

    private void resize(int chains) {
        SeparateChainingHashST<Key, Value> temp = new SeparateChainingHashST(chains);

        for(int i = 0; i < this.m; ++i) {
            Iterator var5 = this.st[i].keys().iterator();

            while(var5.hasNext()) {
                Key key = (Key) var5.next();
                temp.put(key, this.st[i].get(key));
            }
        }

        this.m = temp.m;
        this.n = temp.n;
        this.st = temp.st;
    }

    private int hashTextbook(Key key) {
        return (key.hashCode() & Integer.MAX_VALUE) % this.m;
    }

    private int hash(Key key) {
        int h = key.hashCode();
        h ^= h >>> 20 ^ h >>> 12 ^ h >>> 7 ^ h >>> 4;
        return h & this.m - 1;
    }

    public int size() {
        return this.n;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("argument to contains() is null");
        } else {
            return this.get(key) != null;
        }
    }

    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("argument to get() is null");
        } else {
            int i = this.hash(key);
            return this.st[i].get(key);
        }
    }

    public void put(Key key, Value val) {
        if (key == null) {
            throw new IllegalArgumentException("first argument to put() is null");
        } else if (val == null) {
            this.delete(key);
        } else {
            if (this.n >= 10 * this.m) {
                this.resize(2 * this.m);
            }

            int i = this.hash(key);
            if (!this.st[i].contains(key)) {
                ++this.n;
            }

            this.st[i].put(key, val);
        }
    }

    public void delete(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("argument to delete() is null");
        } else {
            int i = this.hash(key);
            if (this.st[i].contains(key)) {
                --this.n;
            }

            this.st[i].delete(key);
            if (this.m > 4 && this.n <= 2 * this.m) {
                this.resize(this.m / 2);
            }

        }
    }

    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue();

        for(int i = 0; i < this.m; ++i) {
            Iterator var4 = this.st[i].keys().iterator();

            while(var4.hasNext()) {
                Key key = (Key) var4.next();
                queue.enqueue(key);
            }
        }

        return queue;
    }

    public static void main(String[] args) {
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST();

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
}
