import java.util.List;

public interface RectMaze{
    List<DirType> getDirections(int x, int y);
    int getMaxX();
    int getMaxY();
    String[][] CreateMaze(int x, int y);
    int StartPoint ();
    int EndPoint ();
}