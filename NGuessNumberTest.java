//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import org.junit.Test;

public class NGuessNumberTest extends NGuessNumber {
    public NGuessNumberTest() {
    }

    @Test
    public void generateAnswerTest() {
        NGuessNumber GuessNumber = new NGuessNumber();
        int[] num = GuessNumber.generateAnswer();
        if (num.length == 4) {
            for(int i = 0; i < num.length - 1; ++i) {
                for(int j = num.length - 1; j > i; --j) {
                    if (num[i] != num[j] && 0 < num[i] && num[i] < 9) {
                        System.out.println("满足要求");
                    }
                }
            }
        }

        this.generateAnswer();
    }

    @Test
    public void getPlayerInputTest() {
        NGuessNumber GuessNumber = new NGuessNumber();
        int[] num = GuessNumber.getPlayerInput();
        if (num.length == 4) {
            System.out.println("玩家输入了四个数");
        }

    }

    @Test
    public void isWinTest() {
        NGuessNumber GuessNumber = new NGuessNumber();
        int i = GuessNumber.isWin();
        if (i == 4) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
