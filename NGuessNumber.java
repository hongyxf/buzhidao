//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class NGuessNumber {
    public NGuessNumber() {
    }

    public int[] generateAnswer() {
        int[] num = new int[0];

        int a;
        int b;
        int c;
        int d;
        do {
            do {
                a = (int)(Math.random() * 9.0D);
                b = (int)(Math.random() * 9.0D);
                c = (int)(Math.random() * 9.0D);
                d = (int)(Math.random() * 9.0D);
            } while(a == b);
        } while(a == c || a == d || b == c || b == d);

        num = new int[]{a, b, c, d};
        return num;
    }

    public int[] getPlayerInput() {
        int[] num = new int[0];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int one = scanner.nextInt();
        System.out.println("请输入第二个数");
        int two = scanner.nextInt();
        System.out.println("请输入第三个数");
        int three = scanner.nextInt();
        System.out.println("请输入第四个数");
        int four = scanner.nextInt();
        num = new int[]{one, two, three, four};
        return num;
    }

    public int isWin() {
        int[] answer = this.generateAnswer();
        int[] playerInput = this.getPlayerInput();
        int num = 0;

        for(int i = 0; i < answer.length - 1; ++i) {
            for(int j = 0; j < playerInput.length; ++j) {
                if (answer[i] == playerInput[j]) {
                    ++num;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        NGuessNumber GuessNumber = new NGuessNumber();
        int win = GuessNumber.isWin();
        if (win == 4) {
            System.out.println("获胜");
        } else {
            System.out.println("失败");
        }

    }
}
