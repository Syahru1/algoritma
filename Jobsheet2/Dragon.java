package Jobsheet2;
public class Dragon {
    int x, y, width, height;

    public Dragon(int x1, int y1, int w, int h) {

    }
    void moveLeft() {
        if (x > 0)
            x = x - 1;
        else
            detecCollision();
        printPosition();
    }

    void moveRight() {
        if (x < width)
            x = x + 1;
        printPosition();
        detecCollision();
    }

    void moveUp() {
        if (y > 0)
            y = y - 1;
        printPosition();
        detecCollision();
    }

    void moveDown() {
        if (y < height)
            y = y + 1;
        printPosition();
        detecCollision();
    }

    void printPosition() {
        System.out.printf("(%d, %d)\n", x, y);
    }

    void detecCollision() {
        if (x <= 0 || y <= 0 || x >= width || y >= height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        Dragon d = new Dragon(10, 10, 25, 35);
        d.printPosition();
        d.moveRight();d.moveDown();
        d.moveLeft();
    }
}
