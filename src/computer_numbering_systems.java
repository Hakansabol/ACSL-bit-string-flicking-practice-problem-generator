enum base {
    BINARY,
    OCTAL,
    DECIMAL,
    HEXADECIMAL
}

public class number {
    public number (int num) {
        _sval = "" + enter;
    }
    public number (String num, base ibase) {
        _sval = num;
        _base = ibase;

    }
    public number (String num, int ibase) {
        _sval = num;

        switch (ibase) {
            case 2 :
                _base = base.BINARY;
                return;
            case 8 :
                _base = base.OCTAL;
                return;
            case 10 :
                _base = base.DECIMAL;
                return;
            case 16 :
                _base = base.HEXADECIMAL;
                return;
        }

    }
    public static Character[] nobs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    String _sval = "";
    base _base = base.DECIMAL;

    public String Value() {
        return _sval;
    }

    private toBin() {
        switch (_base) {
            case base.BINARY :
                return;
            case base.DECIMAL:
                return;
            case base.OCTAL:
                return;
            case base.HEXADECIMAL:
                return;
        }
    }

    private toBase(int base) {

    }
}

public class computer_numbering_systems {
    public static void main(String[] args) {

    }
}
