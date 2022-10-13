import java.util.ArrayList;
import java.util.List;

public class Layer {
    private java.util.List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Get infos.
     * @return String info
     */
    public String getInfo() {
        StringBuilder res = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape s: shapes) {
            res.append(s.toString());
            res.append("\n");
        }
        return res.toString();
    }

    public void removeCircles() {
        shapes.removeIf(s -> s instanceof Circle);
    }

    /**
     * Remove duplicates.
     */
    public void removeDuplicates() {
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j)) && !index.contains(j)) {
                    index.add(j);
                }
            }
        }

        List<Shape> newShapes = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++) {
            if (!index.contains(i)) {
                newShapes.add(shapes.get(i));
            }
        }

        shapes.clear();
        shapes.addAll(newShapes);
    }
}
