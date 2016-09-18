/**
 * Created by dcurs_000 on 9/17/2016.
 */
public class Cell {

    Cell( int x, int y ){
        _x = x;
        _y = y;
    }

    private int _x;
    private int _y;

    boolean hit(int x, int y )
    {
        return ( x == _x && y == _y );
    }


}
