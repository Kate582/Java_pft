//класс для квадрата
package ru.stqa.pft.sandbox;

/**
 * Created by Екатерина on 6/23/2018.
 */
public class Square {

  public double l;

  public Square(double l) {//конструктор - g
    this.l = l;              //присваивание значения в атрибут
    //первая l - атрибут, вторая - переменная, которая объявлена как аргумент функции
    //просто l = l нельзя, тк тогда это будет переменная-аргумент функции
    //передача значения в атрибут обекта - ссылаемся с this на этот объект
  }

  //public Square(double len) {//конструктор
  //this.l = len;              //первая l - , вторая - объявлена в функции как аргумент
  //}

//делаем метод из функции.
//было:
////  public static double area(Square s) { //функция которая обращается к классу квадрат
//    return s.l*s.l;                     //используются переменные класса
//  }
//стало:

  public double area() {    //убрали static  и параметр - метод ассоциирован с объектом и потому передавать объект как параметр не нужно
    return this.l*this.l;   //обращаемся к ассоциированному объекту через ключевое слово this
                            //то есть указали объект с которым метод ассоциирован
                            //static - толкьо для функций, не ассоциированных с объектами
  }

}