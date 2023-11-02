package comments;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Vector vector = new Vector(new Point(2,3),new Point(5,2));
        Vector vector1 = new Vector();

        vector.multiplyScalar(4); // умножил кординаты на 3
        Vector newVector = vector.differenceVector(new Vector(new Point(2,3),new Point(5,10))); // разность векторов
        Vector newVector2 = vector.summVector(new Vector(new Point(2,3),new Point(5,10))); //сумма векторов
        System.out.println(newVector2.length()); // длинна вектора
        System.out.println(newVector2.calculateCrossProduct(new Vector(new Point(2,3),new Point(5,10)))); // векторное произведение
        System.out.println(newVector2.calculateScalarProduct(new Vector(new Point(2,3),new Point(5,10)))); // скалярное произведение


    }
}