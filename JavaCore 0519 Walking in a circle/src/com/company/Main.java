package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0519 Ходим по кругу

Создать класс (Circle) круг, с тремя конструкторами:
— centerX, centerY, radius
— centerX, centerY, radius, width
— centerX, centerY, radius, width, color

Требования:
1. У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
2. У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY,
radius и инициализирующий соответствующие переменные класса.
3. У класса должен быть конструктор, принимающий в качестве параметров centerX,
centerY, radius, width и инициализирующий соответствующие переменные класса.
4. У класса должен быть конструктор, принимающий в качестве параметров centerX,
centerY, radius, width, color и инициализирующий соответствующие переменные класса.

*/

// public class Circle
public class Main {
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public Main(int centerX, int centerY, int radius) {
          this.centerX = centerX;
          this.centerY = centerY;
          this.radius = radius;
    }

    public Main(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Main(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {
    }
}




