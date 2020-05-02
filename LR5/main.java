package com.company;

import java.util.Scanner;

public class Main {
    enum specialty { none, сybersecurity, mathematics, management };
    static String[] specStr = { "не визначено", "кібербезпека", "математика", "менеджмент" };
    public String lastname;
    public int course;
    public specialty spec;
    public int math;
    public int physics;
    public int informatics;
    private static Scanner scan;

    static void Create(Main[] s)
    {
        scan = new Scanner(System.in);
        int spec;
        for (int i = 0; i < s.length; i++)
        {
            System.out.println("Студент №" + (i + 1) + ":");
            System.out.print(" Прізвище: ");
            s[i].lastname = scan.next();
            System.out.print(" Курс: ");
            s[i].course = scan.nextInt();
            System.out.print
                    (" Спеціальність (1 - кібербезпека, 2 - математика, 3 - менеджмент): ");
            spec = scan.nextInt();
            s[i].spec = specialty.values()[spec];
            System.out.print(" Оцінка з математики : ");
            s[i].math = scan.nextInt();
            System.out.print(" Оцінка з фізики : ");
            s[i].physics = scan.nextInt();
            System.out.print(" Оцінка з інформатики : ");
            s[i].informatics = scan.nextInt();
            System.out.println();
        }
    }

    static void Print(Main[] s)
    {
        System.out.println
                ("==========================================================================================================");
        System.out.println
                ("| № | Прізвище     | Курс | Спеціальність | Оцінка з математики | Оцінка з фізики | Оцінка з інформатики |");
        System.out.println
                ("----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < s.length; i++)
        {
            System.out.printf(
                    "| %d | %-13s|%3d   | %-14s| %9d           | %9d       | %9d            |\n",
                    (i + 1), s[i].lastname, s[i].course, specStr[s[i].spec.ordinal()], s[i].math, s[i].physics, s[i].informatics);

        }
        System.out.println
                ("==========================================================================================================");
        System.out.println();
    }

    static void SearchGoodMark(Main[] s)
    {
        System.out.println
                ("Кількість оцінок «Відмінно» з кожного предмету:");
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].math == 4) count1++;
            if (s[i].physics == 4) count2++;
            if (s[i].informatics == 4) count3++;
        }
        System.out.println();
        System.out.println("Кількість '5' з математики: " + count1);
        System.out.println("Кількість '5' з фізики: " + count2);
        System.out.println("Кількість '5' з інформатики: " + count3);
    }

    static double Summa(Main[] s)
    {
        int summa = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].math == 5 && s[i].physics == 5) count++;
        }
        return summa += count;
    }
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("Введіть кількість студентів N: ");
        int N = scan.nextInt();
        Main[] s = new Main[N];
        for (int i = 0; i < s.length; i++) s[i] = new Main();
        int menuItem;
        do
        {
            System.out.println();
            System.out.println("Виберіть дію:");
            System.out.println();
            System.out.println(" [1] - введення даних з клавіатури");
            System.out.println(" [2] - вивід даних на екран");
            System.out.println(" [3] - вивід кількості «Відмінних» оцінок");
            System.out.println(" [4] - вивід кількості студентів, які отримали");
            System.out.println("       і з математики і з фізики оцінку '5'");
            System.out.println();
            System.out.println(" [0] - вихід та завершення роботи програми");
            System.out.println();
            System.out.println();
            System.out.print("Введіть значення: ");
            menuItem = scan.nextInt();
            System.out.println();
            switch (menuItem)
            {
                case 1:
                    Create(s);
                    break;
                case 2:
                    Print(s);
                    break;
                case 3:
                    SearchGoodMark(s);
                    break;
                case 4:
                    System.out.println
                            ("Кількість які отримали і з фізики і з математики оцінку '5': " + Summa(s));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ви ввели помилкове значення! " +
                            "Слід ввести число - номер вибраного пункту меню");
                    break;
            }
        } while (menuItem != 0);
    }
}
