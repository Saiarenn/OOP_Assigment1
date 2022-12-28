import java.util.ArrayList;

public class Shape {
    public ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p){
        points.add(p);
    }

    public void getPoints() {
        for (int i=0; i< points.size(); i++) {
            System.out.println(points.get(i).getX() +" "+ points.get(i).getY());
        }
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i<points.size(); i++) {
            int j = i + 1;
            if( j == points.size()) j=0;
            perimeter += points.get(i).distance(points.get(j));
        }
        return perimeter;
    }

    public double longestSide() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i<points.size(); i++) {
            int j = i + 1;
            if( j == points.size()) j=0;
            if (points.get(i).distance(points.get(j))>max) max=points.get(i).distance(points.get(j));
        }
        return max;
    }

    public double avgLength() {
        return calculatePerimeter()/ points.size();
    }
}
