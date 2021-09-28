package by.Shauliuk.tasks.Firstlesson;

public class Tester {
    public static void testByte() {
        System.out.println("\n**********TEST BYTE**********");
        byte a = 5, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        // subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%d++ = %d\n", a,a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = (byte) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (byte) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (byte) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = (byte) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 5;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = (byte) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, 0);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, false);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, false);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, true);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, true);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, false);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, true);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                false);
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                false);

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                true);

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                true);

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                true);

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, true);


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                b);


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("byte = byte: c = %d --> c = %d\n", bt, c);
        c = (byte) sh;
        System.out.printf("byte = short: c = (byte) %d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = char: c = (byte) '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte) %d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte) %f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c =  (byte) %f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);
    }

    public static void testShort() {
        System.out.println("\n**********TEST SHORT**********");
        short a = 1, b = 2, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        // subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 4;
        // unary minus
        c = (short) -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = (short) +a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 8;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 3;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = (short) (a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) (a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (short) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);
        c = (short) sh;
        System.out.printf("short = short: c = (short) %d --> c = %d\n", sh, c);
        c = (short) ch;
        System.out.printf("short = char: c = (short) '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short) %d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short) %f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c =  (short) %f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);
    }

    public static void testChar() {

        System.out.println("\n**********TEST CHAR**********");
        char a = 5, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);

        // subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);

        // multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);

        // division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);

        // modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);

        // unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%c = %c\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%c++ = %c\n", a, a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%c = %c\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%c-- = %c\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = (char) (a & b); // bitwise AND
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char) (a | b); // bitwise OR
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char) (a ^ b); // bitwise XOR
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char) ~a; // bitwise unary compliment
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (char) (a << 1); // left shift
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (char) (a >> 1); // right shift
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = (char) -5;
        c = (char) (a >> 1); // right shift
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 5;
        c = (char) (a >>> 1); // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = (char) -5;
        c = (char) (a >>> 1); // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,
                a);


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char) bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char) %d --> c = %c\n", sh, c);
        c = (char) ch;
        System.out.printf("char = char: c = (char) '%c' --> c = %c\n", ch, c);
        c = (char) l;
        System.out.printf("char = long: c = (char) %d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char) %f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c =  (char) %f --> c = %c\n", d, c);
        // c = (int)bool;
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);
    }

    public static void testInt() {
        System.out.println("\n**********TEST INT**********");
        int a = 11, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void testLong() {
        System.out.println("\n**********TEST LONG**********");
        long a = 17, b = 5, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) b), Integer.toBinaryString((int) c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) b), Integer.toBinaryString((int) c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) b), Integer.toBinaryString((int) c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString((int) a),
                Integer.toBinaryString((int) c));


        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = (long) l;
        System.out.printf("long = long: c = (long)%d --> c = %d\n", l, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("int = double: c = (long)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (long)%b --> Compile Error\n",
                bool);

    }

    public static void testFloat() {
        System.out.println("\n**********TEST FLOAT**********");
        float a = 5, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (float) (a + b);
        System.out.printf("%f + %f = %f\n", a, b, c);

        // subtraction
        c = (float) (a - b);
        System.out.printf("%f - %f = %f\n", a, b, c);

        // multiplication
        c = (float) (a * b);
        System.out.printf("%f * %f = %f\n", a, b, c);

        // division
        c = (float) (a / b);
        System.out.printf("%f / %f = %f\n", a, b, c);

        // modulus
        c = ((float) (a % b));
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = (float) -a;
        System.out.printf("-%f = %f\n", a, c);

        // unary plus
        c = (float) +a;
        System.out.printf("+%f = %f\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%f = %f\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%f++ = %f\n", a, a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%f = %f\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%f-- = %f\n", a, a--);

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                (Math.max(a, b)));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("(float) = byte: c = %d --> c = %f\n", bt, c);
        c = (float) sh;
        System.out.printf("(float) = short: c = (byte) %d --> c = %f\n", sh, c);
        c = (float) ch;
        System.out.printf("(float) = char: c = (byte) '%c' --> c = %f\n", ch, c);
        c = (float) l;
        System.out.printf("(float) = long: c = (byte) %d --> c = %f\n", l, c);
        c = (float) f;
        System.out.printf("(float) = float: c = (byte) %f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("(float) = double: c =  (byte) %f --> c = %f\n", d, c);
        // c = (int)bool;
        System.out.printf("(float) = boolean: c = (byte)%b --> Compile Error\n", bool);

    }

    public static void testDouble() {
        System.out.println("\n**********TEST DOUBLE**********");
        double a = 5, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        // subtraction
        c = (double) (a - b);
        System.out.printf("%f - %f = %f\n", a, b, c);

        // multiplication
        c = (double) (a * b);
        System.out.printf("%f * %f = %f\n", a, b, c);

        // division
        c = (double) (a / b);
        System.out.printf("%f / %f = %f\n", a, b, c);

        // modulus
        c = (double) (a % b);
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = (double) -a;
        System.out.printf("-%f = %f\n", a, c);

        // unary plus
        c = (double) +a;
        System.out.printf("+%f = %f\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%f = %f\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%f++ = %f\n", a, a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%f = %f\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%f-- = %f\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f--> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        System.out.println("\n***** Relational Operators *****");

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                a > b);
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                true);

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                true);

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                !(a >= b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = (double) sh;
        System.out.printf("double = short: c = (double) %d --> c = %f\n", sh, c);
        c = (double) ch;
        System.out.printf("double = char: c = (double) '%c' --> c = %f\n", ch, c);
        c = (double) l;
        System.out.printf("double = long: c = (double) %d --> c = %f\n", l, c);
        c = (double) f;
        System.out.printf("double = float: c = (double) %f --> c = %f\n", f, c);
        c = (double) d;
        System.out.printf("double = double: c =  (double) %f --> c = %f\n", d, c);
        // c = (int)bool;
        System.out.printf("double = boolean: c = (double)%b --> Compile Error\n", bool);

    }

    public static void testBoolean() {
        System.out.println("\n**********TEST BOOLEAN**********");
        boolean a = true, b = false, c;

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%b > %b) && (%b > 0) --> %b\n", true, false, true,
                false);
        // bitwise logical AND
        System.out.printf("(%b > %b) & (%b > 0) --> %b\n", true, false, true,
                false);

        // bitwise logical OR
        System.out.printf("(%b >= %b) | (%b != 0) --> %b\n", true, false, false,
                false);

        // logical XOR
        System.out.printf("(%b >= %b) | (%b != 0) --> %b\n", true, false, false,
                false);

        // logical NOT
        System.out.printf("!(%b >= %b) --> %b\n", true, false, true);

    }

}