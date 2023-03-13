package Sem2.Figures.Base;

public abstract class  Polygon  implements Figure, Perimeterable {
    protected int[] sides;
    protected Polygon(int[] sides){
        this.sides = sides;
    }
    public double perimeter(){
        int sum = 0;
        for(int side : sides)
            sum += side;
        return sum;
    }
}
