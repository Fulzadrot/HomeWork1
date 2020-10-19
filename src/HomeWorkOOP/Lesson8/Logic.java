package HomeWorkOOP.Lesson8;
import java.util.Random;
import java.util.Scanner;

public class Logic {
    static int SIZE;
    static int DOTS_TO_WIN;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;
    static boolean finishedGame;

    static Random random = new Random();

    public static void go() {
        finishedGame = true;
        printMap();
        if (checkWinLines(DOT_X, DOTS_TO_WIN)) {
            System.out.println("Вы победили!");
            return;
        }
        if (isFull()) {
            System.out.println("Ничья!");
            return;
        }

        aiTurn();
        printMap();
        if (checkWinLines(DOT_O, DOTS_TO_WIN)) {
            System.out.println("Компьютер победил!");
            return;
        }
        if (isFull()) {
            System.out.println("Ничья!");
            return;
        }

        finishedGame = false;
    }


    static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn(int x, int y) {
        if(isCellValid(y, x)){
            map[y][x] = DOT_X;
            go();
        }
    }

    public static void aiTurn() {
        int x;
        int y;

        // РџРѕРїС‹С‚РєР° РїРѕР±РµРґРёС‚СЊ СЃР°РјРѕРјСѓ
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWinLines(DOT_O, DOTS_TO_WIN)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
// РЎР±РёС‚СЊ РїРѕР±РµРґРЅСѓСЋ Р»РёРЅРёРё РїСЂРѕС‚РёРІРЅРёРєР°, РµСЃР»Рё РѕСЃС‚Р°Р»РѕСЃСЊ 1 С…РѕРґ РґР»СЏ РїРѕР±РµРґС‹
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X, DOTS_TO_WIN)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

// РЎР±РёС‚СЊ РїРѕР±РµРґРЅСѓСЋ Р»РёРЅРёРё РїСЂРѕС‚РёРІРЅРёРєР°, РµСЃР»Рё РѕСЃС‚Р°Р»РѕСЃСЊ 2 С…РѕРґР° РґР»СЏ РїРѕР±РµРґС‹
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWinLines(DOT_X, DOTS_TO_WIN - 1) &&
                            Math.random() < 0.5) { //  С„Р°РєС‚РѕСЂ СЃР»СѓС‡Р°Р№РЅРѕСЃС‚Рё, С‡С‚РѕР±С‹ СЃР±РёРІР°Р» РЅРµ РІСЃРµ РІСЂРµРјСЏ РїРµСЂРІС‹Р№ РїРѕРїР°РІС€РёР№СЃСЏ РїСѓС‚СЊ.
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

// РЎС…РѕРґРёС‚СЊ РІ РїСЂРѕРёР·РІРѕР»СЊРЅСѓСЋ РЅРµ Р·Р°РЅСЏС‚СѓСЋ СЏС‡РµР№РєСѓ

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }


    static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkLine(int cy, int cx, int vy, int vx, char dot, int dotsToWin) {
        if (cx + vx * (dotsToWin - 1) > SIZE - 1 || cy + vy * (dotsToWin - 1) > SIZE - 1 ||
                cy + vy * (dotsToWin - 1) < 0) {
            return false;
        }

        for (int i = 0; i < dotsToWin; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) {
                return false;
            }
        }
        return true;
    }

    static boolean checkWinLines(char dot, int dotsToWin) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, dot, dotsToWin) ||
                        checkLine(i, j, 1, 0, dot, dotsToWin) ||
                        checkLine(i, j, 1, 1, dot, dotsToWin) ||
                        checkLine(i, j, -1, 1, dot, dotsToWin)) {
                    return true;
                }
            }
        }
        return false;
    }
}

