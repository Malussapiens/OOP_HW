package Homework3.Program.Classes.Figures;

public class Square extends Rectangle{
    public Square(int length){
        super(length, length);

    }
    public Square(){
        this(2);
    }
    @Override
    public String toString(){
        return "Квадрат";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (!(o instanceof Square))
            return false;
        return true;
    }
}
