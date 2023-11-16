public class interfacy {
    public static void main(String[] args) {
        Chessplayer q = new Queen();
        q.moves();
    }
}

/**
 * Chessplayer
 */
interface Chessplayer {
    void moves();
}

/**
 * Queen
 */
class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal in every direction");
    }   
}

class Rook implements Chessplayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }   
}

class Horse implements Chessplayer {
    public void moves() {
        System.out.println("one and a half steps");
    }   
}
