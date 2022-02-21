package application;

import boardgame.Position;
<<<<<<< HEAD
import chess.ChessException;
=======
>>>>>>> fe53307246fe163666894f3e7fc3961012bcebcf
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

<<<<<<< HEAD
import java.util.InputMismatchException;
=======
>>>>>>> fe53307246fe163666894f3e7fc3961012bcebcf
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while (true) {
<<<<<<< HEAD
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
=======
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
>>>>>>> fe53307246fe163666894f3e7fc3961012bcebcf
        }

    }

}
