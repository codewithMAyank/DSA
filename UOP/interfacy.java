public class interfacy {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}
/**
 * chessplayer
 */
interface chessplayer {
    void moves();
}

/**
 * queen
 */
class queen implements chessplayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal in every directions");
    }
    
}
class rook implements chessplayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
    
}
class horse implements chessplayer {
    public void moves() {
        System.out.println("one and the half steps");
    }
    
}
