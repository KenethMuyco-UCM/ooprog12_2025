public class DebugPen
{
    private String color;
    private String point;

    public DebugPen()
    {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point)
    {
        this.color = color;
        this.point = point;
    }

    public String getColor()
    {
        return color;
    }

    public String getPoint()
    {
        return point;
    }
}
