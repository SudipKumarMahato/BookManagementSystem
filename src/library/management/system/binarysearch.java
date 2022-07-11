/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.util.ArrayList;

/**
 *
 * @author 1234s
 */
public class binarysearch {
     
      public Data binarySearch(ArrayList<Data>list, int low, int high, double value)
    {
        if(low <= high)
        {
            int mid = (low + high) / 2;
            if(list.get(mid).price == value)
            {
                return list.get(mid);
            }
            else if (list.get(mid).price<value)
            {
                return binarySearch(list, mid + 1, high, value);
            }
            else 
            {
                return binarySearch(list, low, mid - 1, value);
            }
        }
        else
        {
            return null;
        }
    }
}
