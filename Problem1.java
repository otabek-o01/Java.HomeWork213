import java.util.Arrays;

public class Problem1 {
    static int n = 12;
    static int k = 8;

    static int quotient() {
        int res = 0;
        while (n >= k) {
            n = n - k;
            res++;
        }
        return res;
    }

    static int quotient2() {
        while (n >= k) {
            n = n - k;
        }
        return n;
    }
}

class Problem2 {
    static int n = 43;

    static boolean Even() {
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }
}

class Problem3 {
    static int n2 = 5;

    static void loop1() {
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int j = 1; j <= n2; j++) {
            System.out.println(j + " ");
        }
        System.out.println();
    }
}

class Problem4 {
    static int n3 = 5;

    static void loop2() {
        char c = (char) ('A' + n3 - 1);
        for (int i = 1; i <= n3; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
            c++;
        }
    }
}

class Problem5 {
    static int n5 = 5;

    static void loop4() {
        for (int i = 1; i <= n5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Problem6 {
    static int n6 = 5;

    static void loop5() {
        for (int i = 1; i <= n6; i++) {
            for (int j = i; j <= n6; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Problem7 {
    static int n7 = 5;

    static void loop7() {
        for (int i = 1; i <= n7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}

class Problem8 {
    static int n8 = 5;

    static void loop8() {
        for (int i = n8; i >= 1; i--) {
            for (int j = n8; j >= i; j--) {
                System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}

class Problem9 {
    static int n9 = 3;

    static void loop9() {
        if (n9 % 2 == 0) {
            System.out.print(" Bu son tub :  " + n9);
        } else if (n9 % 2 != 0) {
            System.out.print(" Bu son toq :  " + n9);
        }
    }
}

class Problem10 {
    static int n10 = 4;

    static void loop10() {
        for (int i = 1; i <= n10; i++) {
            if (n10 % i == 0) {
                System.out.println(i);
            }
        }
    }
}

class Problem11 {
    static int n11 = 2;
    static int d = 1;

    static void loop11() {
        while (n11 <= 9) {
            while (d <= 10) {
                System.out.println(n11 + " * " + d + " = " + (n11 * d));
                d++;
            }
            n11++;
        }
    }
}

class Problem12 {
    static int n12 = 3;

    static void loop12() {
        while (n12 <= 9) {
            int k = 1;
            while (k <= 10) {
                System.out.println(n12 + " * " + k + " = " + (n12 * k));
                k++;
            }
            n12 = n12 + 2;
        }
    }
}

class Problem13 {
    static int n112 = 2;

    static void loop13() {
        while (n112 <= 8) {
            int l = 1;
            while (l <= 10) {
                System.out.println(n112 + " * " + l + " = " + (n112 * l));
                l++;
            }
            n112 = n112 + 2;
        }
    }
}

class Problem14 {
    static int n14 = 5;

    static void loop14() {
        for (int i = 1; i <= n14; i++) {
            for (int j = 1; j <= n14; j++) {
                if (i == 1 || j == 1 || i == n14 || j == n14 || i == 3 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem15 {
    static int n15 = 4;

    static void loop15() {
        for (int i = 1; i <= n15; i++) {
            for (int j = 1; j <= n15; j++) {
                if (i == 1 || j == 1 || i == n15 || j == n15) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem16 {
    static int n16 = 5;

    static void loop16() {
        for (int i = 1; i <= n16; i++) {
            for (int j = 1; j <= n16; j++) {
                if (j == 1 || j == n16 || i == n16 / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem17 {
    static int n17 = 5;

    static void loop17() {
        for (int i = 1; i <= n17; i++) {
            for (int j = 1; j <= n17; j++) {
                if (i == j || i + j == n17 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem18 {
    static int n18 = 5;

    static void loop18() {
        for (int i = 1; i <= n18; i++) {
            for (int j = i; j <= (n18 - i); j++) {
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((n18 - i + 1) + " ");
            }
            System.out.println();
        }
    }
}

class Problem19 {
    static int n19 = 5;

    static void loop19() {
        int m = (n19 + 1) / 2;
        for (int i = 1; i <= n19; i++) {
            if (i == m) {
                System.out.println();
                continue;
            }
            for (int j = 0; j < n19; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}

class Problem20 {
    static int n20 = 5;

    static void loop20() {
        for (int i = 1; i <= n20; i++) {
            for (int j = i; j <= n20; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Problem21 {
    static int n21 = 5;

    static void loop21() {
        for (int i = 1; i <= n21; i++) {
            for (int j = i; j <= n21; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Problem22 {
    static int n22 = 5;

    static void loop22() {
        for (int i = 1; i <= n22; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n22; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Problem23 {
    static int n23 = 5;

    static void loop23() {
        for (int i = 1; i <= n23; i++) {
            for (int j = 1; j <= n23; j++) {
                if (i == 1 || j == 1 || i == n23 || j == n23 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem24 {
    static int loop24(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int EKUB(int a, int b) {
        return (a * b) / loop24(a, b);
    }
}

class Problem25 {
    static int loop25(int b) {
        int c = 0;

        while (true) {
            if (b <= 0) {
                break;
            }
            c++;
        }
        System.out.println(c);
        return b;
    }
}

class Problem26 {
    static int loop26(int a, int b) {
        int m = a * b;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int g = a;
        return m / g;
    }
}

class Problem27 {
    static int loop27(int a, int b) {
        int m = a * b;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int g = a;
        int l = m / g;
        System.out.println(" EKUB : " + g);
        System.out.println(" EKUK : " + l);
        return g;
    }
}

class Problem28 {
    static int loop28(double a) {
        double s = 0.0;

        for (int i = 1; i <= a; i++) {
            s = s + 1.0 / i;
        }

        return (int) s;
    }
}

class Problem29 {
    static void loop29(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i + " ");
            }
        }
    }
}

class Problem30 {
    static int n = 4;

    static void loop30() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}

class Problem31 {
    static void loop31(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem32 {
    static int n = 4;

    static void loop32() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem33 {
    static int n = 5;

    static void loop33() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == n - 1) || (i == n - 1 && j == 0) || (i == n - 1 && j == n - 1) || (i == n / 2 && j == n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Problem34 {
    static void loop34(int n) {
        int s = 0;

        while (true) {
            if (n == 0) {
                break;
            }
            if (n > 0) {
                s += n;
            }
        }

        System.out.println("Sum = " + s);
    }
}

class Problem35 {
    static void loop35(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                c++;
            }
        }
        System.out.println(c);
    }
}

class Problem36 {
    static void loop36(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println("Katta harf");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Kichik harf");
        } else {
            System.out.println("Harf emas");
        }
    }
}

class Problem37 {
    static void loop37(int a, int b, int c, int d, int e) {
        int[] arr = {a, b, c, d, e};
        Arrays.sort(arr);
        System.out.println(arr[3]);
    }
}

class Problem38 {
    static void loop38(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem39 {
    static void loop39(double n) {
        System.out.println(Math.round(n));
    }
}

class Problem40 {
    static void loop40(double n) {
        if (n > 0 && n == Math.floor(n)) {
            System.out.println("Natural son");
        } else {
            System.out.println("Natural son emas");
        }
    }
}

class Problem41 {
    static void loop41(String str, int i) {
        System.out.println(str.charAt(i));
    }
}

class Problem42 {
    static void loop42(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                c++;
            }
        }
        System.out.println(c);
    }
}

class Problem43 {
    static void loop43(String word) {
        String r = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a') {
                r += 'b';
            } else if (ch == 'b') {
                r += 'd';
            } else {
                r += ch;
            }
        }
        System.out.println(r);
    }
}

class Problem44 {
    static void loop44(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '5') {
                c++;
            }
        }
        System.out.println(c);
    }
}

class Problem45 {
    static int n1 = 12;
    static int n2 = 45;
    static int n3 = -5;
    static int n4 = 67;
    static int n5 = 0;
    static int n6 = 23;

    static void loop45() {
        int[] arr = {n1, n2, n3, n4, n5, n6};
        int mn = arr[0];
        int mx = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
            }
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        System.out.println("Min: " + mn);
        System.out.println("Max: " + mx);
    }
}

class Problem46 {
    static void loop46(double n) {
        System.out.println("Kvadrat ildiz: " + Math.sqrt(n));
        System.out.println("Kub ildiz: " + Math.cbrt(n));
    }
}

class Problem47 {
    static void loop47(String str) {
        char f = str.charAt(0);
        char l = str.charAt(str.length() - 1);
        System.out.println("" + f + l);
    }
}

class Problem48 {
    static void loop48(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                c++;
            }
        }
        if (c == str.length() / 2) {
            System.out.println("Ok");
        } else {
            System.out.println("error");
        }
    }
}

class Problem49 {
    static void loop49(String str) {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                r = ch + r;
                if (r.length() == 2) {
                    break;
                }
            }
        }
        System.out.println(r);
    }
}

class Problem50 {
    static void loop50(String str) {
        System.out.println(str.toUpperCase());
    }
}

class Problem51 {
    static String str = "a78rDfrttsd564";

    static void loop51() {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.print(ch + " ");
                c++;
                if (c == 4) {
                    break;
                }
            }
        }
        System.out.println();
    }
}

class Problem52 {
    static String s = "45ds4587d45ds6d54ds54d";

    static void loop52() {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                c++;
            }
        }
        if (c > 8) {
            System.out.println("PDP");
        } else {
            System.out.println("ACADEMY");
        }
    }
}

class Problem53 {
    static String str = "pdp2022foundation";

    static void loop53() {
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                s += (ch - '0');
            }
        }
        System.out.println(s);
    }
}

class Problem54 {
    static int y = 2024;

    static void loop54() {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Problem55 {
    static String str = "Hello123World!";

    static void loop55() {
        int d = 0;
        int l = 0;
        int u = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                d++;
            } else if (ch >= 'a' && ch <= 'z') {
                l++;
            } else if (ch >= 'A' && ch <= 'Z') {
                u++;
            }
        }
        System.out.println("Raqamlar: " + d);
        System.out.println("Kichik harflar: " + l);
        System.out.println("Katta harflar: " + u);
    }
}

class Problem56 {
    static int n = 6;

    static void loop56() {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            System.out.println("Mukammal Pro son");
        } else {
            System.out.println("Mukammal Elita son emas");
        }
    }
}

class Problem57 {
    static String str = "Hello Word";

    static void loop57() {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                r += (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                r += (char) (ch + 32);
            } else {
                r += ch;
            }
        }
        System.out.println(r);
    }
}

class Problem58 {
    static String p = "Pass*125";

    static void loop58() {
        if (p.length() < 8) {
            System.out.println("error");
            return;
        }
        boolean l = false;
        boolean s = false;
        boolean d = false;
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (ch >= 'a' && ch <= 'z') l = true;
            if (ch == '*') s = true;
            if (ch >= '0' && ch <= '9') d = true;
        }
        if (l && s && d) {
            System.out.println("Ok");
        } else {
            System.out.println("error");
        }
    }
}

class Problem59 {
    static String str = "ShardaUnivercity";

    static void loop59() {
        String r = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                r += '*';
            } else {
                r += ch;
            }
        }
        System.out.println(r);
    }
}

class Problem60 {
    static double a = 3;
    static double b = 4;

    static void loop60() {

        double c = Math.sqrt(a * a + b * b);

        double S = (a * b) / 2;
        double P = a + b + c;

        System.out.println("Gipotenuza: " + c);
        System.out.println("Yuza: " + S);
        System.out.println("Perimetr: " + P);
    }
}

class Problem61 {
    static String str = "Java253";

    static void loop61() {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                c++;
            }
        }
        System.out.println(c);
    }
}

class Problem62 {
    static double n = 25;

    static void loop62() {
        boolean f = false;
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                f = true;
                break;
            }
        }
        System.out.println(f);
    }
}

class Problem63 {
    static String str = "salom542alaykum@$%nime";

    static void loop63() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem64 {
    static int s = 2;
    static int n = 5;

    static void loop64() {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r *= s;
        }
        System.out.println(r);
    }
}

class Problem65 {
    static int n = 17;
    static int k = 5;

    static void loop65() {
        int t = n;
        int q = 0;
        while (t >= k) {
            t -= k;
            q++;
        }
        int r = t;
        System.out.println("Butun qismi: " + q);
        System.out.println("Qoldiq: " + r);
    }
}

class Problem67 {
    static String str = "founder";

    static void loop67() {
        String r = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            r += str.charAt(i);
        }
        System.out.println(r);
    }
}

class Problem68 {
    static String str = "JavaBACKEND";

    static void loop68() {
        int u = 0;
        int l = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') u++;
            else if (ch >= 'a' && ch <= 'z') l++;
        }
        if (u > l) {
            System.out.println("PDP");
        } else {
            System.out.println("ACADEMY");
        }
    }
}

class Problem69 {
    static int a = 10;
    static int b = 3;

    static void loop69() {
        if (a == 7 || b == 7 || (a + b) == 7 || (a - b) == 7 || (b - a) == 7) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Problem70 {
    static String str = "Salom134131@$199";

    static void loop70() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}


class Problem71 {
    static double a = 4;
    static double b = 9;


    static void loop71() {
        double c = (a + b) / 2;
        double d = Math.sqrt(a * b);
        System.out.println("O'rta arifmetik: " + c);
        System.out.println("O'rta geometrik: " + d);
    }
}

class Problem72 {
    static void loop72() {

        for (int i = 1000; i <= 9999; i++) {
            int n1 = i / 1000;
            int n2 = (i / 100) % 10;
            int n3 = (i / 10) % 10;
            int n4 = i % 10;
            if (n1 % 2 != 0 && n2 % 2 != 0 && n3 % 2 != 0 && n4 % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}

class Problem73 {
    static int a = 15;
    static int b = 42;
    static int c = 7;
    static int d = 23;

    static void loop73() {
        int[] arr = {a, b, c, d};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Problem74 {
    static double n = 625.0;

    static void loop74() {
        System.out.println("4-darajali ildiz: " + Math.pow(n, 0.25));
        System.out.println("5-darajali ildiz: " + Math.pow(n, 0.2));
    }
}

class Problem75 {
    static void loop75() {
        int[] arr = {0, 2, 4, 6, 8};

        for (int m = 1; m < arr.length; m++) {
            for (int y = 0; y < arr.length; y++) {
                for (int o = 0; o < arr.length; o++) {
                    for (int b = 0; b < arr.length; b++) {
                        int s = arr[m] * 1000 + arr[y] * 100 + arr[o] * 10 + arr[b];
                        System.out.print(s + " ");
                    }
                }
            }
        }
        System.out.println();

    }
}

class Problem76 {
    static String str = "a78rDfrttsd54";

    static void loop76() {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem77 {
    static String str = "a78rDfrttsd54";

    static void loop77() {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem78 {
    static String str = "a7586";

    static void loop78() {
        boolean res = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}

class Problem79 {
    static String str = "a78rDfrttsd54";

    static void loop79() {
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                System.out.print(Character.toUpperCase(ch));
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem80 {
    static int a = 15;
    static int b = 42;
    static int c = 7;
    static int d = 23;

    static void loop80() {
        int[] arr = {a, b, c, d};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Problem81 {
    static double n = 4.0;

    static void loop81() {
        System.out.println("Kvadrat: " + Math.pow(n, 2));
        System.out.println("Kub: " + Math.pow(n, 3));
    }
}

class Problem82 {
    static String str = "a1s85sr8";

    static void loop82() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int n = Character.getNumericValue(ch);
                System.out.print((int) Math.pow(n, 2) + " ");
            }
        }
        System.out.println();
    }
}

class Problem83 {
    static String str = "java2022foundation";

    static void loop83() {
        int s = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                s += Character.getNumericValue(ch);
            }
        }
        System.out.println("Yig'indi: " + s);
        System.out.println("Ildiz: " + Math.sqrt(s));
    }
}

class Problem84 {
    static String str = "AhmadKalish";

    static void loop84() {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }
}

class Problem85 {
    static String str = "A!k@b#a$r%";

    static void loop85() {
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                char ch = str.charAt(i);
                if (!Character.isLetterOrDigit(ch)) {
                    System.out.print(ch);
                }
            }
        }
        System.out.println();
    }
}

class Problem86 {
    static int n = 6;

    static void loop86() {
        long p = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                p *= i;
            }
        }
        System.out.println(p);
    }
}

class Problem87 {
    static int n = 121;

    static void loop86() {
        int t = n;
        int r = 0;
        while (t > 0) {
            r = r * 10 + t % 10;
            t /= 10;
        }
        if (n == r) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom emas");
        }
    }
}

class Problem88 {
    static String str = "Ali";

    static void loop88() {
        String v = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (v.indexOf(ch) != -1) {
                System.out.print('*');
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem89 {
    static String str = "Ahmadali";

    static void loop89() {
        String v = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && v.indexOf(ch) == -1) {
                System.out.print('+');
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
    }
}

class Problem90 {
    static String str = "afg";

    static void loop89() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.print((char) (ch + 1));
        }
        System.out.println();
    }
}

class Problem91 {
    static String str = "a2";

    static void loop91() {
        int l = 0, d = 0, s = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) l++;
            else if (Character.isDigit(ch)) d++;
            else s++;
        }
        if (l == d && d == s) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }
    }
}

class Problem92 {
    static String str = "Akbar";

    static void loop92() {
        if (str.length() >= 3 && str.length() % 2 != 0) {
            char f = str.charAt(0);
            char m = str.charAt(str.length() / 2);
            char l = str.charAt(str.length() - 1);
            System.out.println("" + f + m + l);
        }
    }
}

class Problem93 {
    static char ch = 'B';

    static void loop93() {
        if (Character.isDigit(ch)) {
            System.out.println("RAQAM");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("HARF");
        } else {
            System.out.println("SIMVOL");
        }
    }
}

class Problem94 {
    static int n = 5;
    static char ch = 'G';

    static void loop94() {
        for (int i = 0; i < n; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

class Problem95 {
    static int n = 65;

    static void loop95() {
        System.out.println((char) n);
    }
}

class Problem96 {
    static String str = "asdg4sadf8";

    static void loop96() {
        int r1 = -1, r2 = -1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                if (r1 == -1) r1 = Character.getNumericValue(ch);
                else if (r2 == -1) {
                    r2 = Character.getNumericValue(ch);
                    break;
                }
            }
        }
        if (r1 != -1 && r2 != -1) {
            int a = r1, b = r2;
            int m = a * b;
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            int g = a;
            int l = m / g;
            System.out.println("EKUB=" + g + ", EKUK=" + l);
        }
    }
}

class Problem195 {
    static String str = "abc123XYZ456";

    static void loop195() {
        int a = 0;
        int b = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                a++;
            } else if (ch >= '0' && ch <= '9') {
                b++;
            }
        }

        if (a == b) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }
}

class Problem196 {
    static String str = "ab12!@";

    static void loop196() {
        int c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                c++;
            }
        }

        if (c == str.length() / 2) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }
}

class Problem197 {
    static int n = 5;

    static void loop197() {
        int c = 65;
        for (int i = 0; i < n; i++) {
            System.out.print((char) c + " ");
            c++;
        }
        System.out.println();
    }
}

class Problem198 {
    static int n = 5;

    static void loop198() {
        int c = 97 + n - 1;
        for (int i = 0; i < n; i++) {
            System.out.print((char) c + " ");
            c--;
        }
        System.out.println();
    }
}

class Problem199 {
    static String str = "radar";

    static void loop199() {
        if (str.length() == 0) {
            System.out.println("error");
            return;
        }
        char a = str.charAt(0);
        char b = str.charAt(str.length() - 1);
        if (a == b) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }
}

class Problem200 {
    static int s = 22;

    static void loop200() {
        if (s < 1 || s > 99) {
            return;
        }

        String[] e = {"", "on", "yigirma", "ottiz", "qirq", "ellik", "oltmish", "yetmish", "sakkiz", "toqson"};
        String[] u = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};

        int o = s / 10;
        int b = s % 10;

        if (o > 0 && b > 0) {
            System.out.println(e[o] + " " + u[b]);
        } else if (o > 0) {
            System.out.println(e[o]);
        } else {
            System.out.println(u[b]);
        }
    }
}

class Problem201 {
    static void loop201() {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 != 0) {
                    s += i;
                }
            }
        }
        System.out.println(s);
    }
}

class Problem202 {
    static void loop202() {
        for (int i = 10; i <= 99; i++) {
            int a = i / 10;
            int b = i % 10;
            int d = a - b;
            if (d == 1 || d == -1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem203 {
    static void loop203() {
        for (int i = 200; i <= 800; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (a % 2 != 0) {
                if (b % 2 != 0) {
                    if (c % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
        System.out.println();
    }
}

class Problem204 {
    static void loop204() {
        for (int i = 10; i <= 99; i++) {
            int a = i / 10;
            int b = i % 10;
            if (a + b == 5) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem205 {
    static void loop205() {
        for (int i = 100; i <= 900; i++) {
            if (i % 3 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem206 {
    static int s = 12345;

    static void loop206() {
        int c = 0;
        int t = s;
        if (t == 0) {
            System.out.println(1);
            return;
        }
        while (t > 0) {
            c++;
            t = t / 10;
        }
        System.out.println(c);
    }
}

class Problem207 {
    static int n = 10;

    static void loop207() {
        for (int i = 0; i <= n; i++) {
            double d = Math.sqrt(i);
            System.out.println(i + " -> " + d);
        }
    }
}

class Problem208 {
    static void loop208() {
        int s = 0;
        for (int i = 100; i <= 900; i++) {
            if (i % 3 == 0 && i % 6 != 0) {
                s += i;
            }
        }
        System.out.println(s);
    }
}

class Problem209 {
    static void loop209() {
        for (int i = 100; i <= 999; i++) {
            int m = (i / 10) % 10;
            if (m == 7 || m == 9) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem210 {
    static int n = 4;

    static void loop210() {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += (1.0 / i);
        }
        System.out.println(s);
    }
}

class Problem211 {
    static void loop211() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem212 {
    static void loop212() {
        int k = 11300;
        for (int i = 10; i <= 40; i++) {
            int h = i * k;
            System.out.println(i + "$ = " + h + " so'm");
        }
    }
}

class Problem213 {
    static int n = 5;

    static void loop213() {
        for (int i = 1; i <= n; i++) {
            double d = Math.cbrt(i);
            System.out.println(i + " kub ildizi: " + d);
        }
    }
}

class Problem214 {
    static void loop214() {
        for (int i = 100; i <= 999; i++) {
            int x = i / 100;
            int y = (i / 10) % 10;
            int z = i % 10;
            if (x == y || x == z || y == z) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem215 {
    static void loop215() {
        for (int i = 10; i <= 99; i++) {
            int a = i / 10;
            int b = i % 10;
            int c = a + b;
            if (c == 9 || c == 15) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem216 {
    static void loop216() {
        for (int i = 100; i <= 999; i++) {
            int s1 = i / 100;
            int s2 = (i / 10) % 10;
            int s3 = i % 10;
            if (s1 + s2 + s3 == 5) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class Problem217 {
    static int s = 3;
    static int n = 4;

    static void loop217() {
        int d = 1;
        for (int i = 1; i <= n; i++) {
            d = d * s;
        }
        System.out.println(d);
    }
}

class Problem218 {
    static int n = 5;

    static void loop218() {
        for (int i = 0; i < 4; i++) {
            int c = n;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}

class Problem219 {
    static int n = 5;

    static void loop219() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("1");
        }
    }
}

class Problem220 {
    static double a = 3;
    static double b = 4;

    static void loop220() {
        double d = (a * a) + (b * b);
        double c = Math.sqrt(d);
        double p = a + b + c;
        System.out.println("C = " + c);
        System.out.println("P = " + p);
    }
}

class Problem221 {
    static void loop221() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int r = i * j;
                System.out.println(i + " * " + j + " = " + r);
            }
            System.out.println("-------------------------------------");
        }
    }
}

class Problem222 {
    static int n = 5;

    static void loop222() {
        int m = n / 2;
        for (int i = 0; i < n; i++) {
            if (i == m) {
                for (int j = 0; j < n; j++) {
                    System.out.print("+ ");
                }
                System.out.println();
            } else {
                System.out.println("+");
            }
        }
    }
}

class Problem223 {
    static int n = 7;

    static void loop223() {
        if (n <= 1) {
            System.out.println("Tub emas");
            return;
        }

        int c = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0) {
                c++;
            }
        }

        if (c == 2) {
            System.out.println("Tub son");
        } else {
            System.out.println("Tub emas");
        }
    }
}

class Problem224 {
    static int n = 15;

    static void loop224() {
        for (int x = 2; x <= n; x++) {
            int c = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }
}

class Problem225 {
    static int a = 5;
    static int b = 3;

    static void loop225() {
        for (int i = 1; i <= b; i++) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}