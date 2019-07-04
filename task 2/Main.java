package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;

/**
 * Класс c записью и чтением массива объектов
 * @autor Кирилл Суслов
 * @version jdk1.8.0_211
 */


public class Main extends MasObj {
/** Объекты класса Figures, помещенные в массив
 * @see Figures#Figures(String, int, int)
 * @see MasObj
   */
        public static void main(String[] args)  {
            mas[0] = new Figures("Triangle", 16, 18);
            mas[1] = new Figures("Rectangle", 28, 15);
            mas[2] = new Figures("Circle", 16, 18);
/** Создание нового файла */
            try {
                File file = new File("newFile.txt");
                if(!file.exists())
                    file.createNewFile();
/** Запись в файл newFile.txt параметров фигур */
                PrintWriter pw = new PrintWriter(file);
                pw.println("Первая фигура:");
                pw.println(mas[0].name );
                pw.println(mas[0].x );
                pw.println(mas[0].y );
                pw.println("Вторая фигура:");
                pw.println(mas[1].name );
                pw.println(mas[1].x );
                pw.println(mas[1].y );
                pw.println("Третья фигура:");
                pw.println(mas[2].name );
                pw.println(mas[2].x );
                pw.println(mas[2].y );
                /** Закрытие потока PrintWriter */
                pw.close();
                /** Создание объекта FileReader для чтения файла */
                FileReader fr = new FileReader(file);
                char [] a = new char[200];
                fr.read(a);
                for (char c:a)
                    System.out.print(c);
                /** Закрытие потока FileReader */
                fr.close();
            }
            /** Обработка исключений */
            catch (IOException f) {
                System.out.print("Error:" + f );
            }
        }
    }

