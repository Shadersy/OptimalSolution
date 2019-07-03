public class OptimalSolution {
//Оценка согласованности в МАИ. Маи для нескольких матриц парного сравнения

//Вычисление приритетов для матрицы Е, которые будут выражать ценность для каждого эксперта
    public double priorityFind(double MatrixE[][], int Number) {
        double result = 1;

        for (int i = 0; i < 5; i++) {
            result *= MatrixE[Number][i];

        }
        result = Math.pow(result, 1.0/5.0);
        return result;
    }

//Повторение той же операции для матриц W
    public double priorityFindForW(double MatrixW[][], int Number) {
        double result = 1;

        for (int i = 0; i < 4; i++) {
            result *= MatrixW[Number][i];

        }
        result = Math.pow(result, 1.0/4.0);
        return result;
    }


//Нахождение окончательного приоритета альтернатив (W_finish = e_i * w_i)
    public double finishPriority(double e1, double e2, double e3, double e4, double e5, double w1, double w2, double w3, double w4, double w5){

        double result = 0;
        result = e1*w1 + e2*w2 + e3*w3 +e4*w4+e5*w5;
        return result;
    }

  
  //Функция максимума для полученных альтернатив
    public double optimalAlternative(double f1, double f2, double f3, double f4){
        if(f1> f2 && f1>f3 && f1>f4){
            return f1;
        }
        if(f2> f1 && f2>f3 && f2>f4){
            return f2;
        }
        if(f3> f1 && f3>f2 && f3>f4){
            return f2;
        }
        else return f4;

    }



    };



