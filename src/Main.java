import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Nm1=0,Nm2=0;
        System.out.println("Выберите необходимую функцию, введя число:\n 1)Сложение\n 2)Умножение\n 3)Деление\n 4)Вычитание\n 5)Вычисление квадратного уравнения\n 0)Завершить программу");
        Scanner input = new Scanner(System.in);
        int nm = input.nextInt();
        while (nm!=0)
        {

            if (nm==1)
            {
                System.out.println("Введите первое число");
                Nm1 = input.nextDouble();
                System.out.println("Введите второе число");
                Nm2 = input.nextDouble();
                sum(Nm1,Nm2);
            }
            else if (nm==2)
            {
                System.out.println("Введите первое число");
                Nm1 = input.nextDouble();
                System.out.println("Введите второе число");
                Nm2 = input.nextDouble();
                umn(Nm1, Nm2);
            }
            else if (nm==3)
            {
                System.out.println("Введите первое число");
                Nm1 = input.nextDouble();
                System.out.println("Введите второе число");
                Nm2 = input.nextDouble();
                delen(Nm1,Nm2);
            }
            else if (nm == 4)
            {
                System.out.println("Введите первое число");
                Nm1 = input.nextDouble();
                System.out.println("Введите второе число");
                Nm2 = input.nextDouble();
                vich(Nm1,Nm2);
            }
            else if (nm == 5)
            {
                System.out.println("Квадратное уравнение имеет вид: ax² + bx + c");
                System.out.println("Введите последовательно a, b, c");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                kv(a, b, c);
            }
            else
            {
                if (nm<0|nm>5)
                {
                    System.out.println("Выбор не верный");
                    nm = input.nextInt();
                }
            }
        }
    }

    public static void sum(double Nm1, double Nm2) {
        System.out.println("Результат сложения равен\n" + (Nm1 + Nm2));
    }

    public static void vich(double Nm1, double Nm2) {
        System.out.println("Результат вычитания равен\n" + (Nm1 - Nm2));
    }

    public static void umn(double Nm1, double Nm2) {
        System.out.println("Результат умножения равен\n" + (Nm1 * Nm2));
    }

    public static void delen(double Nm1, double Nm2) {
        System.out.println("Результат деления равен\n" + (Nm1 / Nm2));
    }

    public static void kv(double a, double b, double c)
    {
        double x1 = 0, x2 = 0;
        double D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("Действительных корней нет");
        } else {
            if (D == 0) {
                System.out.println((-b) / (2 * a));
            } else {
                x1 = ((-b + Math.sqrt(D)) / (2 * a));
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения:\n x1=" + " " + x1 + "x2=" + " " + x2);
            }
        }

    }
}
