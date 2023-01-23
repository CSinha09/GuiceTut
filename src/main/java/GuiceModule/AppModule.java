package GuiceModule;

import RequestSquare.SquareRequest;
import Square.ColorValue;
import Square.DrawShape;
import Square.DrawSquare;
import Square.IntegerValue;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SquareRequest.class).in(Scopes.SINGLETON);
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(IntegerValue.class).toInstance(50);
    }
}
