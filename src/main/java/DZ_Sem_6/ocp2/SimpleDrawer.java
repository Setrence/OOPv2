package DZ_Sem_6.ocp2;

public class SimpleDrawer {

    public void Draw(Shape shape){
        switch (shape.getType()){
            case Circle -> {
                drawCircle(shape);
            }
            case Square -> {
                drawSquare(shape);
            }
        }
    }

    private void drawCircle(Shape square){
        // ...
    }

    private void drawSquare(Shape square){
        // ...
    }

}
