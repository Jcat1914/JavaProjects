package RandomThings;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class PSD {
    static Random rd = new Random();
    static int [][] nums =
            {{0, 19, 12, 64, 14},
            {19, 0, 5, 35, 26},
            {12, 5, 0, 13, 38},
            {64, 35, 13, 0, 11},
            {14, 26, 38, 11, 0}};
    public static int[] getter(int[][] nums)
    {
        int counter = 0;
        int row = 0;
        int index = 0;
        int [] toReturn = new int[8];

        while(counter <9){


            counter++;
        }
        return toReturn;
    }

    public static List findSmallest(int [][] a, int row){
        int smallest = 100;
        int indx = 0;
        for(int i =0; i<a.length;i++){
            if(a[row][i]<smallest){
                smallest = a[row][i];
                indx = i;
            }
        }
        return new List() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public Object[] toArray(@NotNull Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NotNull Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @NotNull
            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
    public static void main(String[] args) {
       int[] numbers = getter(nums);

    }



}
