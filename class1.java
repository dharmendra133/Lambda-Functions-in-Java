package LambdaExpression;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class class1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i);
        }

        arr.forEach((item)->{
            System.out.println(item*2);
        });

       /* Consumer<Integer> fun=((item)-> System.out.println(item*2));

        arr.forEach(fun);*/

        //both the above things will work in the same way

        Opeartion sum=(a,b)->a+b;
        Opeartion mul=(a,b)->a*b;
        Opeartion div=(a,b)->a/b;
        Opeartion diff=(a,b)->a-b;



        class1 mycalculator=new class1();
        System.out.println(mycalculator.operate(3,4,sum));
        System.out.println(mycalculator.operate(3,4,mul));
        System.out.println(mycalculator.operate(3,4,diff));
        System.out.println(mycalculator.operate(3,4,div));


    }

    private int operate(int a, int b, Opeartion op){
        return op.operation(a,b);
    }
}

interface Opeartion{
    int operation(int a, int b);
}
