package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
                for (Object o : objectArray){
                    if (o.equals(objectToCount)){
                        count++;
                    }
                }
                return count;
    }

    /**
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Object[] objectArray, Object objectToRemove) {

        List<Object> removeList = new ArrayList<>(Arrays.asList(objectArray));
        while (removeList.remove(objectToRemove)){

        }

        return removeList.toArray(new Integer[removeList.size()]) ;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int maxCount = 0;
        Object mostCommon = null;
        for (Object  obj: objectArray) {
           int most =  getNumberOfOccurrences(objectArray, obj);
           if (most > maxCount) {
               maxCount = most;
               mostCommon = obj;
           }
        }
             return mostCommon;

        }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int minCount = 1;
        Object leastCommon = 0;
        for (Object  obj: objectArray) {
            int least =  getNumberOfOccurrences(objectArray, obj);
            if (least <= minCount) {
                minCount = least;
                leastCommon = obj;
            }
        }
        return leastCommon;

    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

            List merge = new ArrayList(Arrays.asList(objectArray));
            merge.addAll(Arrays.asList(objectArrayToAdd));
            Integer[] mergeAll = (Integer[]) merge.toArray(new Integer[merge.size()]);
            return mergeAll;
        }
    }

