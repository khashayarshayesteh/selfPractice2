package day89_javaAdvance_genericsAdnEnums;

public class TestQuestion5 {


    Node<Circle> nc = new Node<>();
   // Node<Rectangle> ns = nc;
   Node<Circle> ns = nc;



}




//Given the following classes:
//class Shape { /* ... */ }
//class Circle extends Shape { /* ... */ }
//class Rectangle extends Shape { /* ... */ }
//class Node<T> { /* ... */ }
//    Will the following code compile? If not, why?
//        Node<Circle> nc = new Node<>();
//        Node<Shape> ns = nc;

