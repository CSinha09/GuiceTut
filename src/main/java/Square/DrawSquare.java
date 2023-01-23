package Square;

import com.google.inject.Inject;

public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;


    @Inject
    public DrawSquare(@ColorValue String color, @IntegerValue Integer edge){
        super();
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Sqaure of color: "+color+" " +
                "and edge length of: "+edge);
    }

}
