// Helper Class: Bitstring
class bitstring {
    public bitstring(String nv) {
        boolean[] nb = new boolean[nv.length()] ;
        int i = 0;
        for (char c : nv.toCharArray()) {
            if (c == '0') {
                nb[i] = false;
            }
            else if (c == '1') {
                nb[i] = true;
            }
            i ++;
        }
        bits = nb;
    }
    private boolean[] bits = { };

    public String Value() {
        String ns = "";
        for (boolean b : bits) {
            if (b) {
                ns = ns.concat("1");
            }
            else {
                ns = ns.concat("0");
            }
        }
        return ns;
    }

    public void print() {
        System.out.println(Value());
    }

    public int smod(int value, int max) {
        if (value >= max) return value % max;
        return value;
    }
    public int smod(int value) {
        return smod(value, bits.length);
    }

    public String NOT() {
        boolean[] nb = new boolean[bits.length];
        for (int i = 0; i < nb.length; i ++) {
            nb[i] = !bits[i];
        }
        bits = nb;
        return Value();
    }

    public String LSHIFT(int mod) {
        boolean[] nb = new boolean[bits.length];
        for (int i = 0; i < nb.length; i ++) {
            if (i + mod < bits.length) nb[i] = bits[i + mod];
            else nb[i] = false;
        }
        bits = nb;
        return Value();
    }
    public String RSHIFT(int mod) {
        boolean[] nb = new boolean[bits.length];
        for (int i = 0; i < nb.length; i ++) {
            if (i - mod >= 0) nb[i] = bits[i - mod];
            else nb[i] = false;
        }
        bits = nb;
        return Value();
    }
    public String RCIRC(int mod) {
        boolean[] nb = new boolean[bits.length];
        for (int i = 0; i < nb.length; i ++) {
            nb[i] = bits[smod(i + (bits.length - mod))];
        }
        bits = nb;
        return Value();
    }
    public String LCIRC(int mod) {
        boolean[] nb = new boolean[bits.length];
        for (int i = 0; i < nb.length; i ++) {
            nb[i] = bits[smod(i + mod)];
        }
        bits = nb;
        return Value();
    }
}

// Helper Class: Solver
class bst_utils {
}

// Execution Class
class bst_main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        bitstring btst = new bitstring("100010");
        btst.print();
        btst.NOT();
        btst.print();
        btst.LSHIFT(1);
        btst.print();
        btst.RSHIFT(4);
        btst.print();
        btst.RCIRC(1);
        btst.print();

        btst.LCIRC(5);
        btst.print();
    }
}