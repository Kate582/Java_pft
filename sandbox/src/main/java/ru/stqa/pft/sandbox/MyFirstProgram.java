package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world"); //вызов функции hello с конкретным параметром
    hello("user");

    Square s = new Square(5); //создаем новый объект класса
                                  //переменные класса определены сразу потому что использовали конструктор
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s)); //возвращаем объект

//до использования конструктора
//    Rectangle r = new Rectangle(); //создаем новый объект класса
//    r.a = 4;                       //определяем переменные класса
//    r.b = 6;
    Rectangle r = new Rectangle(4,6); //создание объекта: длины сторон прямоугольника 4 и 6
                                           // передаются в качестве параметров в конструктор
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

  }

  public static void hello(String somebody) { //функция hello c параметром string
                                              //void - не возвращает значений
    System.out.println("Hello," + somebody + "!");
  }

  public static double area(Square s) { //функция которая обращается к классу квадрат
    return s.l*s.l;                     //используются переменные класса
  }

  public static double area(Rectangle r) {
    return r.a*r.b;
  }
}