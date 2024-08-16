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
    }
}