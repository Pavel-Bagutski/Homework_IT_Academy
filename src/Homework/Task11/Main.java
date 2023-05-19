package Homework.Task11;
// Имеются два дома размерами a на b и c на d. Имеется участок размерами е на f . Проверить, помещаются ли эти дома на
// данном участке. Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым

public  class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        int c = 6;
        int d = 7;

        int e = 11;
        int f = 7;

        if (a + c <= f){
            if(b > d){
                if(b <= e) System.out.println("Дома вмещаются");
            }
            else if (d <= e) System.out.println("Дома вмещаются");
            else System.out.println("Дома не вмещаются");
        }
        else if (a + c <= e){
            if(b > d){
                if(b <= f) System.out.println("Дома вмещаются");
            }
            else if (d <= f) System.out.println("Дома вмещаются");
            else System.out.println("Дома не вмещаются");
        }
        else System.out.println("Участок мал");
    }
}
