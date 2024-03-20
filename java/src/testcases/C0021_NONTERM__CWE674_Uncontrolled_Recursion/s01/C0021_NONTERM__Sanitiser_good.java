package testcases.C0021_NONTERM__CWE674_Uncontrolled_Recursion.s01;

import java.util.ArrayList;

public class C0021_NONTERM__Sanitiser_good {
    static ArrayList<String> pathRetDiagonal(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRetDiagonal(p, r-1, c-1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal1(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal1(p, r-1, c-1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal2(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        if (!(r > 1)) {
            list.addAll(pathRetDiagonal2(p, r-1, c-1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal3(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        while ((r > 1) && (c > 1)) {
            list.addAll(pathRetDiagonal3(p, r-1, c-1));
        }
        return list;
    }

    static ArrayList<String> pathRetDiagonal4(String p, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        for (int i =0; r > 1; r--) {
            list.addAll(pathRetDiagonal4(p, r-1, c-1));
        }

        return list;
    }

}
