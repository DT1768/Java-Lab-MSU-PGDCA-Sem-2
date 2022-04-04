import java.util.*;

class Player{
    String pname;
    static int count;
    Player(){
        pname="AAA";
        count++;
    }
    Player(String n,String c){
        this.pname=n;
    }
    void set_player(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter player name: ");
        pname=sc.nextLine();
    }
    void show_player(){
        System.out.println("Player: No: "+count+ " Name: "+pname);
    }
}
abstract class ChessPiece{
    String name,color;
    int x;
    int y;
    Scanner sc = new Scanner (System.in);
    ChessPiece(){
        name=" ";
        color=" ";
        x =0;
        y =0;
    }
    ChessPiece(String name,String color,int x_pos,int y_pos){
        this.name=name;
        this.color=color;
        this.x =x_pos;
        this.y =y_pos;
    }
    void set_color(String color){
        System.out.println("Chess piece color:"+color);
    }
    void move(){
        System.out.println("Move piece:-");
        System.out.print("x position: ");
        x =sc.nextInt();
        System.out.print("y position: ");
        y =sc.nextInt();
    }
    void draw(){
        System.out.println(name+" is drawn.");
    }
}
class ChessBoard{
    ChessBoard(){
        System.out.println("Chess board : ");
    }
    void display(){
        System.out.println("Game Loading....... ");
    }
}
class King extends ChessPiece{
    King(){
        name="king";
    }
    King(String name,String color,int x_pos,int y_pos){
        super(name,color,x_pos,y_pos);
    }
    void set_color(String color){
        super.set_color(color);
    }
    void move(){
        super.move();
    }
    void draw(){
        super.draw();
    }
}
class Queen extends ChessPiece{
    Queen(){
        name="queen";
    }
    Queen(String name,String color,int x_pos,int y_pos){
        super(name,color,x_pos,y_pos);
    }
    void set_color(String color){
        super.set_color(color);
    }
    void move(){
        super.move();
    }
    void draw(){
        super.draw();
    }
}
class Pawn extends ChessPiece{
    Pawn(){
        name="pawn";
    }
    Pawn(String name,String color,int x_pos,int y_pos){
        super(name,color,x_pos,y_pos);
    }
    void set_color(String color){
        super.set_color(color);
    }
    void move(){
        super.move();
    }
    void draw(){
        super.draw();
    }
}
class Knight extends ChessPiece{
    Knight(){
        name="knight";
    }
    Knight(String name,String color,int x_pos,int y_pos){
        super(name,color,x_pos,y_pos);
    }
    void set_color(String color){
        super.set_color(color);
    }
    void move(){
        super.move();
    }
    void draw(){
        super.draw();
    }
}
class Bishop extends ChessPiece{
    Bishop(){
        name="bishop";
    }
    Bishop(String name,String color,int x_pos,int y_pos){
        super(name,color,x_pos,y_pos);
    }
    void set_color(String color){
        super.set_color(color);
    }
    void move(){
        super.move();
    }
    void draw(){
        super.draw();
    }
}
public class Question3 {
    public static void main(String[] args) {
        ChessBoard b = new ChessBoard();
        b.display();
        System.out.println();
        Player[] p= new Player[2];
        for(int i=0;i<p.length;i++){
            p[i]= new Player();
            p[i].set_player();
            p[i].show_player();
            System.out.println("&&&&&&&&&&&");
        }
        ChessPiece King= new King();
        ChessPiece Queen= new Queen();
        ChessPiece Pawn= new Pawn();
        ChessPiece Knight= new Knight();
        Pawn.set_color("white");
        Pawn.move();
        Pawn.draw();
        Knight.set_color("white");
        Knight.move();
        Knight.draw();
        System.out.println();
    }
}