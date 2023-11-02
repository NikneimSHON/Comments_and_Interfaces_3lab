package comments;

/**
 * Класс, представляющий точку в двумерном пространстве с координатами (x, y).
 */
public class Point {
    private int x; // Координата x
    private int y; // Координата y

    /**
     * Конструктор для создания объекта Point с заданными координатами (x, y).
     *
     * @param x Координата x точки.
     * @param y Координата y точки.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получает координату x точки.
     *
     * @return Координата x точки.
     */
    public int getX() {
        return x;
    }

    /**
     * Устанавливает новое значение координаты x точки.
     *
     * @param x Новое значение координаты x точки.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Получает координату y точки.
     *
     * @return Координата y точки.
     */
    public int getY() {
        return y;
    }

    /**
     * Устанавливает новое значение координаты y точки.
     *
     * @param y Новое значение координаты y точки.
     */
    public void setY(int y) {
        this.y = y;
    }
}