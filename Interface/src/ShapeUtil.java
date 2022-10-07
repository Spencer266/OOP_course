import java.util.List;

public class ShapeUtil {
    /**
     * Print infos of a list of Geometric Objects.
     * @param shapes List of Geometric Objects
     * @return A formatted string of info
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder result = new StringBuilder("Circle:\n");
        for (GeometricObject g: shapes) {
            if (g instanceof Circle) {
                result.append(g.getInfo());
                result.append("\n");
            }
        }
        result.append("Triangle:\n");
        for (GeometricObject g: shapes) {
            if (g instanceof Triangle) {
                result.append(g.getInfo());
                result.append("\n");
            }
        }
        return result.toString();
    }
}
