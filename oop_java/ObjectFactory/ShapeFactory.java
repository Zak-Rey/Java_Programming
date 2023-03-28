public class ShapeFactory {
    public static Shape createShape(String shapeType){
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else{
            throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        }
    }

    Shape circle = ShapeFactory.createShape("circle");
    Shape rectangle = ShapeFactory.createShape("rectangle");
}
