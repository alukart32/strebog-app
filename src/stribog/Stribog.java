/*
 * Implementation of hash function Stribog (GOST R 34.11.2012)
 */
package stribog;

import java.io.File;

public interface Stribog {
    /**
     * 
     * @param file файл, для которого надо получить хеш
     * @param outputSize выбор длины хеша: <br><blockquote> true - 512 <br> false - 256</blockquote>
     * @return 256 или 512 разрядный хеш
     */
    public byte[] getHash(File file, boolean outputSize);
    
    /**
     * 
     * @param file файл, для которого надо получить хеш
     * @param outputSize выбор длины хеша: <br><blockquote> true - 512 <br> false - 256</blockquote>
     * @return 256 или 512 разрядный хеш
     */
    public byte[] getHash(String file, boolean outputSize);
    
    /**
     * 
     * @param msg массив, для которого надо получить хеш
     * @param outputSize выбор длины хеша: <br><blockquote> true - 512 <br> false - 256</blockquote>
     * @return 256 или 512 разрядный хеш
     */
    public byte[] getHash(byte[] msg, boolean outputSize);
    
}
