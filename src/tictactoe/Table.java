package tictactoe;

public class Table {
    
    private String winner;
    public void setWinner(String winner){
        this.winner = winner;
    }
    public String getWinner(){
        return winner;
    }
    
    private int turn = 0;
    
    public void resetTurn(){
        turn = 0;
    }
    
    public void addTurn(){
        turn++;
    }
    
    public int getTurn(){
        return turn;
    }
    
    /*Con el boolean playing iniciamos y reseteamos el tablero*/
   
    private boolean playing = false;
    
    public boolean isPlaying(){
        return playing;
    }
    
    public void setPlaying(boolean playing){
        this.playing = playing;
    }
        
    private boolean player1 = true;

    public boolean isPlayer1Playing() {
        return player1;
    }
    
    public boolean isPlayer2Playing() {
        return !player1;
    }
    
    public boolean changePlayer1(boolean player1){
        this.player1 = !player1;
        return !player1;
            }

    public void setPlayer1(boolean player1) {
        this.player1 = player1;
    }
    
    private String actualPlayer = "Player 1";
    private String chess = "O";
    private String A1 = "";
    private String A2 = "";
    private String A3 = "";
    private String B1 = "";
    private String B2 = "";
    private String B3 = "";
    private String C1 = "";
    private String C2 = "";
    private String C3 = "";
    
    public void resetAll(){
    chess = "O";
    A1 = "";
    A2 = "";
    A3 = "";
    B1 = "";
    B2 = "";
    B3 = "";
    C1 = "";
    C2 = "";
    C3 = "";
    }

    public String getActualPlayer() {
        return actualPlayer;
    }

    public void setActualPlayer(String actualPlayer) {
        this.actualPlayer = actualPlayer;
    }

    public String getChess() {
        return chess;
    }

    public void setChess(String chess) {
        this.chess = chess;
    }
    
    public String getA1() {
        return A1;
    }

    public void setA1(String A1) {
        this.A1 = A1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String A2) {
        this.A2 = A2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }

    public String getB1() {
        return B1;
    }

    public void setB1(String B1) {
        this.B1 = B1;
    }

    public String getB2() {
        return B2;
    }

    public void setB2(String B2) {
        this.B2 = B2;
    }

    public String getB3() {
        return B3;
    }

    public void setB3(String B3) {
        this.B3 = B3;
    }

    public String getC1() {
        return C1;
    }

    public void setC1(String C1) {
        this.C1 = C1;
    }

    public String getC2() {
        return C2;
    }

    public void setC2(String C2) {
        this.C2 = C2;
    }

    public String getC3() {
        return C3;
    }

    public void setC3(String C3) {
        this.C3 = C3;
    }
    
    public Table(){
        
    }
    
    
}
