package comments;

/**
 * Класс, представляющий вектор в двумерном пространстве.
 * Каждый вектор определен двумя точками: начальной и конечной.
 * Класс предоставляет методы для вычисления различных операций с векторами,
 * таких как вычисление векторного и скалярного произведения, длины вектора,
 * умножение вектора на скаляр, а также операции сложения и вычитания векторов.
 */
public class Vector {
    Point pointStart;
    Point pointEnd;

    public Vector(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Vector() {
    }

    /**
     * Метод для вычисления векторного произведения между текущим вектором и другим вектором.
     *
     * @param otherVector Вектор, с которым производится вычисление векторного произведения.
     * @return Векторное произведение текущего вектора и указанного вектора.
     */
    public double calculateCrossProduct(Vector otherVector) {
        double x1 = this.pointEnd.getX() - this.pointStart.getX();
        double y1 = this.pointEnd.getY() - this.pointStart.getY();
        double x2 = otherVector.pointEnd.getX() - otherVector.pointStart.getX();
        double y2 = otherVector.pointEnd.getY() - otherVector.pointStart.getY();

        // Вычисление векторного произведения
        return (x1 * y2 - x2 * y1);
    }

    /**
     * Получает начальную точку вектора.
     *
     * @return Начальная точка вектора.
     */
    public Point getPointStart() {
        return pointStart;
    }

    /**
     * Устанавливает начальную точку вектора.
     *
     * @param pointStart Новая начальная точка вектора.
     */
    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    /**
     * Получает конечную точку вектора.
     *
     * @return Конечная точка вектора.
     */
    public Point getPointEnd() {
        return pointEnd;
    }

    /**
     * Устанавливает конечную точку вектора.
     *
     * @param pointEnd Новая конечная точка вектора.
     */
    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }

    /**
     * Метод для вычисления скалярного произведения между текущим вектором и другим вектором.
     *
     * @param otherVector Вектор, с которым производится вычисление скалярного произведения.
     * @return Скалярное произведение текущего вектора и указанного вектора.
     */
    public double calculateScalarProduct(Vector otherVector) {
        double x1 = this.pointEnd.getX() - this.pointStart.getX();
        double y1 = this.pointEnd.getY() - this.pointStart.getY();
        double x2 = otherVector.pointEnd.getX() - otherVector.pointStart.getX();
        double y2 = otherVector.pointEnd.getY() - otherVector.pointStart.getY();

        return (x1 * x2 + y1 * y2);
    }

    /**
     * Метод для вычисления длины текущего вектора.
     *
     * @return Длина текущего вектора.
     */
    public double length() {
        return Math.sqrt(Math.pow(pointEnd.getX() - pointStart.getX(), 2) + Math.pow(pointEnd.getY() - pointStart.getY(), 2));
    }

    /**
     * Метод для умножения текущего вектора на скаляр.
     *
     * @param scalar Значение, на которое умножается текущий вектор.
     */
    public void multiplyScalar(int scalar) {
        pointStart.setX(pointStart.getX() * scalar);
        pointStart.setY(pointStart.getY() * scalar);
        pointEnd.setX(pointEnd.getX() * scalar);
        pointEnd.setY(pointEnd.getY() * scalar);
    }

    /**
     * Метод для вычисления суммы текущего вектора с другим вектором.
     *
     * @param otherVector Вектор, с которым производится вычисление суммы.
     * @return Вектор, представляющий собой сумму текущего вектора и указанного вектора.
     */
    public Vector summVector(Vector otherVector) {
        int newX = this.pointStart.getX() + otherVector.pointStart.getX();
        int newY = this.pointStart.getY() + otherVector.pointStart.getY();
        Point newPointStart = new Point(newX, newY);

        int newEndX = this.pointEnd.getX() + otherVector.pointEnd.getX();
        int newEndY = this.pointEnd.getY() + otherVector.pointEnd.getY();
        Point newPointEnd = new Point(newEndX, newEndY);

        return new Vector(newPointStart, newPointEnd);
    }

    /**
     * Метод для вычисления разности текущего вектора с другим вектором.
     *
     * @param otherVector Вектор, с которым производится вычисление разности.
     * @return Вектор, представляющий собой разность текущего вектора и указанного вектора.
     */
    public Vector differenceVector(Vector otherVector) {
        int newX = this.pointStart.getX() - otherVector.pointStart.getX();
        int newY = this.pointStart.getY() - otherVector.pointStart.getY();
        Point newPointStart = new Point(newX, newY);

        int newEndX = this.pointEnd.getX() - otherVector.pointEnd.getX();
        int newEndY = this.pointEnd.getY() - otherVector.pointEnd.getY();
        Point newPointEnd = new Point(newEndX, newEndY);

        return new Vector(newPointStart, newPointEnd);
    }
}