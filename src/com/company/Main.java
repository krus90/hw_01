package com.company;

public class Main {

    public static void main(String[] args) {
//з1
    byte a = 127;
    short b = 200;
    int c = 4000;
    long d = 10000000001L;

    float e = 3.5f;
    double f = 4.5;

    char g = 56;

    var h = a + b + c + d + e + f + g;

    boolean i = true;

    System.out.println("з1 " + h);

//з2
    float b1 = 78.2f;
    float b2 = 82.7f;
    float sum = b1 + b2;
    float diff = b2 - b1;

    System.out.println("з2 " + "Общий вес " + sum + "кг" + ", " + "Разница в весе " + diff + "кг");

//з3
    byte banana = 80;
    byte milk = 105;
    byte iceCream = 100;
    byte egg = 70;

    float breakfast = (float)((banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4)) / 1000;

    System.out.println("з3 " + "Завтрак - " + breakfast + " кг");

//з4
    int weight = 7000;
    int w1 = 250;
    int w2 = 500;
    int res1 = weight / w1;
    int res2 = weight / w2;
    int res = (res1 + res2) / 2;

    System.out.println("з4 " + "Минимум веса " + res1 + " дней " + ", " + "Максимум веса " + res2 + " дней" +
            ", " + "в среднем " + res + " день" );

//з5
    float masha = 67760;
    float denis = 83690;
    float kris = 76230;

    float percent = 10f;
    float coff = 1f + (percent / 100);

    float mashaNew = masha * coff;
    float denisNew = denis * coff;
    float krisNew = kris * coff;

    float mashaDiff = (mashaNew * 12) - (masha * 12);
    float denisDiff = (denisNew * 12) - (denis * 12);
    float krisDiff = (krisNew * 12) - (kris * 12);

    System.out.println("з5 Маша теперь получает " + mashaNew + ", Годовой доход вырос на " + mashaDiff);
    System.out.println("Денис теперь получает " + denisNew + ", Годовой доход вырос на " + denisDiff);
    System.out.println("Кристина теперь получает " + krisNew + ", Годовой доход вырос на " + krisDiff);
    }
}
