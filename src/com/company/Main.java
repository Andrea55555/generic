package com.company;
import java.lang.reflect.Array;

public class Main<M>  {
    private M[] m;
    public Main(Class<M> c,int s) {
        M[] m = (M[]) Array.newInstance(c, s);
        this.m = m;
    }
    public void changeElements(M[] array, int one, int two) {
        M temp = array[one];
        array[one] = array[two];
        array[two] = temp;
        for (int j = 0; j < array.length; j++)
            System.out.println(array[j]);

    }
    public void turning(M[] array) {
        for (int i = 0; i < array.length / 2; i++) {
           M temp = array[i];
           array[i] = array[array.length - i - 1];
           array[array.length - i - 1] = temp;
        }
        for (int j = 0; j < array.length; j++)
            System.out.println(array[j]); //

}
    public void allToString(M[] array, int i) {
        M out = array[i];
        System.out.println("номер элемента" + i + " = " + out.toString());

    }


    public static void main(String[] args) {
        System.out.println("Перевернем строковый массив:");
        Main<Integer> intArray = new Main<>(Integer.class,4);
        Integer[] garray = intArray.m;
        for(int i=0; i < garray.length; i++) {
            garray[i] = i;
        }


        intArray.turning(garray);
        System.out.println("поменял местами 2 элемента в массиве:");
        intArray.changeElements(garray,1,2);
        System.out.println("toString");
        intArray.allToString(garray, 3);

        System.out.println("Перевернем строковый массив:");
        Main<String> stringArray = new Main<>(String.class,4);
        String[] farray = stringArray.m;
      farray[0]="one";
      farray[1]="two";
      farray[2]="three";
      farray[3]="foure";

        stringArray.turning(farray);
        System.out.println("поменял местами 2 элемента в массиве:");
        stringArray.changeElements(farray,1,2);
        System.out.println("toString");
        stringArray.allToString(farray, 3);
    }
}