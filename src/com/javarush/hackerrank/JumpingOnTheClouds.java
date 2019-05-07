package com.javarush.hackerrank;
//Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads
// and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the
// current cloud plus 1  or 2.
// She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting
// position to the last cloud. It is always possible to win the game.
//It should return the minimum number of jumps required, as an integer.


import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheClouds {
    public int jumping(int arrayLength, int[] array) {
        int countSteps = 0;

        for (int i = 0; i < arrayLength - 1; i++) {
            if (i < arrayLength - 2 && array[i + 2] == 0) {
                i++;
            }
            countSteps++;

        }


        return countSteps;
    }

    @Test
    public void positiveResult() {
        Assert.assertEquals(3, jumping(6, new int[]{0, 0, 0, 1, 0, 0}));
    }

    @Test
    public void positiveResultTwo() {
        Assert.assertEquals(4, jumping(7, new int[]{0, 0, 1, 0, 0, 1, 0}));
    }
}
