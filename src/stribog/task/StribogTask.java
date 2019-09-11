/*
 * Implementation of hash function Stribog (GOST R 34.11.2012)
 */
package stribog.task;

import java.util.Arrays;
import stribog.StribogImpl;

public class StribogTask extends StribogImpl {
    private boolean outputMode;
    public StribogTask(boolean _outputMode)
    {
        outputMode = _outputMode;
        super.init(_outputMode);
    }
    
    public void getHashPart(byte[] messagePart)
    {
        hashPart(messagePart);
    }

    public byte[] getH() {
        if(outputMode)
            return h;
        return Arrays.copyOf(h, 32);
    }
}
