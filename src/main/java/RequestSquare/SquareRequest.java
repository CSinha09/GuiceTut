package RequestSquare;

import Square.DrawShape;
import com.google.inject.Inject;

public class SquareRequest {
    DrawShape d;

    @Inject
    public SquareRequest(DrawShape d){
        this.d=d;
    }

    public void makeRequest(){
        d.draw();
    }

    public DrawShape getSquare(){
        return d;
    }

}
