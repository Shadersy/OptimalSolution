
import jdk.nashorn.internal.ir.IdentNode;

import java.lang.reflect.Array;
import java.util.*;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.ArrayList;


public class Main {

    public static void main(String args[]) {
        double matrixE[][] = {{1.0, 1.0/ 8.0, 1.0 / 7.0, 2.0, 1.0 / 2.0,},
                             {8.0, 1.0, 7.0, 6.0, 2.0},
                             {7.0, 1.0 / 7.0, 1.0, 3.0, 3.0},
                             {1.0 / 2.0, 1.0 / 6.0, 1.0/ 3.0, 1, 1.0 / 5.0},
                             {2.0, 1.0 / 2.0, 1.0 / 3.0, 5.0, 1.0}};



        double matrixW1[][] = {{1.0, 1.0 / 3.0, 1.0 / 4.0, 8.0},
                              {3.0, 1.0, 1.0 / 3.0, 5.0},
                              {4.0, 3.0, 1.0, 5.0},
                              {1.0 / 8.0, 1.0 / 5.0, 1.0 / 5.0, 1.0}};

        double matrixW2[][] = {{1.0, 6.0, 1.0 / 8.0, 1.0 / 3.0},
                              {1.0 / 6.0, 1.0, 7.0, 8.0},
                              {8.0, 1.0 / 7.0, 1.0, 1.0 / 7.0},
                              {3.0, 1.0 / 8.0, 7.0, 1.0}};

        double matrixW3[][] = {{1.0, 1.0 / 3.0, 1.0 / 4.0, 1.0},
                              {3.0, 1.0, 9.0, 8.0},
                              {4.0, 1.0 / 9.0, 1.0, 1.0 / 3.0},
                              {1.0, 1.0 / 8.0, 3.0, 1.0}};

        double matrixW4[][] = {{1.0, 4.0, 1.0 / 8.0, 1.0 / 5.0},
                              {1.0 / 4.0, 1.0, 1.0 / 9.0, 1.0 / 6.0},
                              {8.0, 9.0, 1.0, 5.0},
                              {5.0, 6.0, 1.0 / 5.0, 1.0}};
        double matrixW5[][] = {{1.0, 1.0 / 5.0, 1.0 / 8.0, 2.0},
                              {5.0, 1.0, 1.0 / 9.0, 1.0 / 2.0,},
                              {8.0, 9.0, 1.0, 2.0},
                              {1.0 / 2.0, 2.0, 1.0 / 2.0, 1.0}};

        lub1 obj0 = new lub1();
        lub1 obj1 = new lub1();
        lub1 obj2 = new lub1();
        lub1 obj3 = new lub1();
        lub1 obj4 = new lub1();


for(int i=0; i<5; i++){
    for(int j=0; j<5; j++){
        System.out.println(matrixE[i][j]);
    }
    System.out.print("\n");
}


//Решение для матрицы E
double e1_tilda = obj0.priorityFind(matrixE, 0);
double e2_tilda = obj0.priorityFind(matrixE, 1);
double e3_tilda = obj0.priorityFind(matrixE, 2);
double e4_tilda = obj0.priorityFind(matrixE, 3);
double e5_tilda = obj0.priorityFind(matrixE, 4);
double e_tilda = e1_tilda+e2_tilda+e3_tilda+e4_tilda+e5_tilda;


double e1 =  e1_tilda / e_tilda;
double e2 =  e2_tilda / e_tilda ;
double e3 =  e3_tilda / e_tilda;
double e4 =  e4_tilda / e_tilda;
double e5 =  e5_tilda / e_tilda;

        System.out.println("e1_tilda = "+ e1_tilda);
        System.out.println("e2_tilda = "+ e2_tilda);
        System.out.println("e3_tilda = "+ e3_tilda);
        System.out.println("e4_tilda = "+ e4_tilda);
        System.out.println("e5_tilda = "+ e5_tilda);
        System.out.println("e_tilda = " + e_tilda);

        System.out.println("e1 = " + e1);
        System.out.println("e2 = " + e2);
        System.out.println("e3 = " + e3);
        System.out.println("e4 = " + e4);
        System.out.println("e5 = " + e5);





//Решение для матрицы W1

        double w1_1_tilda = obj1.priorityFindForW(matrixW1, 0);
        double w1_2_tilda = obj1.priorityFindForW(matrixW1, 1);
        double w1_3_tilda = obj1.priorityFindForW(matrixW1, 2);
        double w1_4_tilda = obj1.priorityFindForW(matrixW1, 3);
        double w_1_tilda = w1_1_tilda + w1_2_tilda +w1_3_tilda +w1_4_tilda;
        double w1_1 = w1_1_tilda / w_1_tilda;
        double w1_2 = w1_2_tilda / w_1_tilda;
        double w1_3 = w1_3_tilda / w_1_tilda;
        double w1_4 = w1_4_tilda / w_1_tilda;




        System.out.println("w1_1 = " + w1_1);
        System.out.println("w1_2 = " + w1_2);
        System.out.println("w1_3 = " + w1_3);
        System.out.println("w1_4 = " + w1_4);
        System.out.println("\n");

        //Решение для матрицы W2

        double w2_1_tilda = obj1.priorityFindForW(matrixW2, 0);
        double w2_2_tilda = obj1.priorityFindForW(matrixW2, 1);
        double w2_3_tilda = obj1.priorityFindForW(matrixW2, 2);
        double w2_4_tilda = obj1.priorityFindForW(matrixW2, 3);
        double w_2_tilda = w2_1_tilda + w2_2_tilda +w2_3_tilda +w2_4_tilda;
        double w2_1 = w2_1_tilda / w_2_tilda;
        double w2_2 = w2_2_tilda / w_2_tilda;
        double w2_3 = w2_3_tilda / w_2_tilda;
        double w2_4 = w2_4_tilda / w_2_tilda;

        System.out.println("w2_1 = " + w2_1);
        System.out.println("w2_2 = " + w2_2);
        System.out.println("w2_3 = " + w2_3);
        System.out.println("w2_4 = " + w2_4);
        System.out.println("\n");


        //Решение для матрицы W3

        double w3_1_tilda = obj2.priorityFindForW(matrixW3, 0);
        double w3_2_tilda = obj2.priorityFindForW(matrixW3, 1);
        double w3_3_tilda = obj2.priorityFindForW(matrixW3, 2);
        double w3_4_tilda = obj2.priorityFindForW(matrixW3, 3);
        double w_3_tilda = w3_1_tilda + w3_2_tilda +w3_3_tilda +w3_4_tilda;
        double w3_1 = w3_1_tilda / w_3_tilda;
        double w3_2 = w3_2_tilda / w_3_tilda;
        double w3_3 = w3_3_tilda / w_3_tilda;
        double w3_4 = w3_4_tilda / w_3_tilda;

        System.out.println("w3_1 = " + w3_1);
        System.out.println("w3_2 = " + w3_2);
        System.out.println("w3_3 = " + w3_3);
        System.out.println("w3_4 = " + w3_4);
        System.out.println("\n");


        //Решение для матрицы W4

        double w4_1_tilda = obj3.priorityFindForW(matrixW4, 0);
        double w4_2_tilda = obj3.priorityFindForW(matrixW4, 1);
        double w4_3_tilda = obj3.priorityFindForW(matrixW4, 2);
        double w4_4_tilda = obj3.priorityFindForW(matrixW4, 3);
        double w_4_tilda = w4_1_tilda + w4_2_tilda +w4_3_tilda +w4_4_tilda;
        double w4_1 = w4_1_tilda / w_4_tilda;
        double w4_2 = w4_2_tilda / w_4_tilda;
        double w4_3 = w4_3_tilda / w_4_tilda;
        double w4_4 = w4_4_tilda / w_4_tilda;

        System.out.println("w4_1 = " + w4_1);
        System.out.println("w4_2 = " + w4_2);
        System.out.println("w4_3 = " + w4_3);
        System.out.println("w4_4 = " + w4_4);
        System.out.println("\n");

//Решение для матрицы W5

        double w5_1_tilda = obj4.priorityFindForW(matrixW5, 0);
        double w5_2_tilda = obj4.priorityFindForW(matrixW5, 1);
        double w5_3_tilda = obj4.priorityFindForW(matrixW5, 2);
        double w5_4_tilda = obj4.priorityFindForW(matrixW5, 3);
        double w_5_tilda = w5_1_tilda + w5_2_tilda +w5_3_tilda +w5_4_tilda;
        double w5_1 = w5_1_tilda / w_5_tilda;
        double w5_2 = w5_2_tilda / w_5_tilda;
        double w5_3 = w5_3_tilda / w_5_tilda;
        double w5_4 = w5_4_tilda / w_5_tilda;

        System.out.println("w5_1 = " + w5_1);
        System.out.println("w5_2 = " + w5_2);
        System.out.println("w5_3 = " + w5_3);
        System.out.println("w5_4 = " + w5_4);
        System.out.println("\n");





        double FinishW1 = obj0.finishPriority(e1,e2,e3,e4,e5,w1_1,w2_1,w3_1,w4_1,w5_1);
        double FinishW2 = obj0.finishPriority(e1,e2,e3,e4,e5,w1_2,w2_2,w3_2,w4_2,w5_2);
        double FinishW3 = obj0.finishPriority(e1,e2,e3,e4,e5,w1_3,w2_3,w3_3,w4_3,w5_3);
        double FinishW4 = obj0.finishPriority(e1,e2,e3,e4,e5,w1_4,w2_4,w3_4,w4_4,w5_4);

        System.out.println("Альтернатива W1 " +FinishW1);
        System.out.println("Альтернатива W2 " +FinishW2);
        System.out.println("Альтернатива W3 " +FinishW3);
        System.out.println("Альтернатива W4 " +FinishW4);


   double answer =    obj1.optimalAlternative(FinishW1, FinishW2, FinishW3, FinishW4);
        if(answer == FinishW1)
           System.out.println("Оптимальная альтернатива W1: = " + answer);
        if(answer == FinishW2)
           System.out.println("Оптимальная альтернатива W2: = " + answer);
        if(answer == FinishW3)
            System.out.println("Оптимальная альтернатива W3: = " + answer);
        if(answer == FinishW3)
            System.out.println("Оптимальная альтернатива W4: = " + answer);


    }
}
