// Helper Class: Bitstring
class bitstring {
    public bitstring(String nv) {
        bits = new boolean[0];
        for (char c : nv.toCharArray()) {
            if (c == '0') {
                bits.add(false);
            }
            else if (c == '1') {
                bits.add(true);
            }
        }
    }
    private boolean[] bits;

    public string Value() {
        String ns = "";
        for (boolean b : bits) {
            if (b) {
                ns.concat("1");
            }
            else if (!b) {
                ns.concat("0");
            }
        }
    }
}

// Helper Class: Solver
class bst_utils {
    public string
}

// Execution Class
class bst_main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}