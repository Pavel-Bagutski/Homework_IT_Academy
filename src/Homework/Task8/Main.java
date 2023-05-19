package Homework.Task8;
//Имеется прямоуголтное отверстие размерами a и b, где a и b целые числа. Определить, можно ли его полностью закрыть
// круглой картонкой радиусом r (тоже целое число).

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isClose(4,3, 5));

    }
}
class Solution {
    boolean isClose (float a, float b, float r){
        float diagonal = (float) Math.sqrt((a * a)+(b * b));
        System.out.println( "diagonal = " + diagonal );
        if (r <= diagonal){
            return true;
        } else return false;
    }
}