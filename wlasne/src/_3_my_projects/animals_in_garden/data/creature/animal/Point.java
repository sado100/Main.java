package _3_my_projects.animals_in_garden.data.creature.animal;

public class Point {
    private int xCord = 0;
    private int yCord = 0;

    @Override
    public String toString() {
        return "x = "+xCord +" y = "+ yCord ;
    }

    public Point() {

    }

    public Point(int xCord, int yCord) {
        this.xCord = 0;
        this.yCord = 0;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }
}
