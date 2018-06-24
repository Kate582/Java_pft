package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world"); //вызов функции hello с конкретным параметром
    hello("user");

    Square s = new Square(5); //создаем новый объект класса
                                //переменные класса определены сразу потому что использовали конструктор
//но чтобы вместо функции вызвать метод,, делаем так:
//area(s)  -> s.area()
//то есть обращаемся к метода также как обращались к атрибуту. пример обращения в атрибуту:  s.l
//перед методом необходим объект, для которого метод вызывается
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area()); //возвращаем объект


//до использования конструктора
//    Rectangle r = new Rectangle(); //создаем новый объект класса
//    r.a = 4;                       //определяем переменные класса
//    r.b = 6;
    Rectangle r = new Rectangle(4,6); //создание объекта: длины сторон прямоугольника 4 и 6 передаются в качестве параметров в конструктор
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area()); //объект r типа  rectangle

    Point p1 = new Point();
    Point p2 = new Point();
    p1.x = 1;
    p1.y = 4;
    p2.x = 9;
    p2.y = 12;
    System.out.println("Pасстояние от (" + p1.x + "," + p1.y + ") до (" + p2.x + "," + p2.y + ") = " + distance(p1, p2));

  }

  public static void hello(String somebody) { //функция hello c параметром string
                                              //void - не возвращает значений
    System.out.println("Hello," + somebody + "!");
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x)) + ((p1.y-p2.y)*(p1.y-p2.y)));
  }

//функция находится тут пока она функция.
//как только создаем из нее метод, то есть привязываем к объекту, она переносится внутрь класса,
//а здесь удаляется
//  public static double area(Square s) { //функция которая обращается к классу квадрат
//    return s.l*s.l;                     //используются переменные класса
//  }

//эту функцию тоже переносим в класс и создаем метод
//  public static double area(Rectangle r) {
//    return r.a*r.b;
//  }
}