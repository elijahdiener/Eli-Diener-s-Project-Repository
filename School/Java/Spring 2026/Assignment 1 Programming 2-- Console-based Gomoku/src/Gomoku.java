import java.util.Scanner;
import static java.lang.System.*;

public class Gomoku
{
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        char[][] board = new char[19][19];
        boolean endGame = false;
        boolean playAgain = false;
        boolean playerTurn = true;
        do {
            createBoard(board);
            while (!endGame) {
                displayBoard(board);
                updateBoard(board, playerTurn);
                if (hasPlayerWon(board, playerTurn)) {
                    displayBoard(board);
                    if (playerTurn)
                        out.print("\nPlayer 1 wins!");
                    else
                        out.print("\nPlayer 2 wins!");
                    endGame = true;
                }
                if (isBoardFull(board)) {
                    out.print("\nBoard is full!");
                    endGame = true;
                }
                playerTurn = !playerTurn;
            }
            out.print("\nPlay again?\n(y/n)\n>");
            String again = input.nextLine();
            if((again.equals("y")) || again.equals("Y") || again.equals("yes") || again.equals("Yes") || again.equals("YES"))
            {
                playAgain = true;
                endGame = false;
                playerTurn = true;
            }
            else
            {
                playAgain = false;
            }
        } while (playAgain);
    }

    private static void createBoard(char[][] board)
    {
        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                board[i][j] = '.';
            }
        }
    }

    private static void displayBoard(char[][] board)
    {
        int yAxis = 1;
        out.print("     COLUMNS\n     1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19\n");
        for (int i = 0; i < 19; i++)
        {
            if (i == 0)
                out.print("R ");
            else if (i == 1)
                out.print("O ");
            else if (i == 2)
                out.print("W ");
            else if (i == 3)
                out.print("S ");
            if (i < 4)
                out.printf("%2d ", yAxis);
            else
                out.printf("%4d ", yAxis);
            yAxis++;
            for (int j = 0; j < 19; j++)
            {
                out.printf("%c  ", board[i][j]);
            }
            out.print("\n");
        }
    }

    private static void updateBoard(char[][] board, boolean playerTurn)
    {
        Scanner input = new Scanner(in);
        boolean validityCheck = false;
        int row = 0;
        int column = 0;
        if (playerTurn)
        {
            do {
                out.print("Player 1's turn!\nEnter row: ");
                row = input.nextInt() - 1;
                out.print("Enter column: ");
                column = input.nextInt() - 1;
                if (!(isValidMove(board, row, column))) {
                    validityCheck = false;
                    out.print("Invalid move!\n");
                }
                else
                {
                    validityCheck = true;
                }
            } while (!validityCheck);
            board[row][column] = '●';
        }
        else
        {
            do {
                out.print("Player 2's turn!\nEnter row: ");
                row = input.nextInt() - 1;
                out.print("Enter column: ");
                column = input.nextInt() - 1;
                if (!(isValidMove(board, row, column))) {
                    validityCheck = false;
                    out.print("Invalid move!\n");
                }
                else
                {
                    validityCheck = true;
                }
            } while (!validityCheck);
            board[row][column] = '○';
        }
    }

    private static boolean isValidMove(char[][] board, int row, int column)
    {
        if ((row >= 0 && row <= 18) && (column >= 0 && column <= 18))
        {
            if (!(board[row][column] == '.'))
            {
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean isBoardFull(char[][] board)
    {
        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if (board[i][j] == '.')
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasPlayerWon(char[][] board, boolean player)
    {
        if (isHorizontalWin(board, player) || isVerticalWin(board, player) || isDiagonalWin(board, player))
            return true;
        return false;
    }

    private static boolean isHorizontalWin(char[][] board, boolean player)
    {
        char target = '○';
        if (player)
            target = '●';
        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 16; j++)
            {
                if (board[i][j] == target)
                {
                    if ((board[i][j+1] == target) && (board[i][j+2] == target) && (board[i][j+3] == target) && (board[i][j+4] == target) )
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isVerticalWin(char[][] board, boolean player)
    {
        char target = '○';
        if (player)
            target = '●';
        for (int i = 0; i < 16; i++)
        {
            for (int j = 0; j < 19; j++)
            {
                if (board[i][j] == target)
                {
                    if ((board[i+1][j] == target) && (board[i+2][j] == target) && (board[i+3][j] == target) && (board[i+4][j] == target) )
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isDiagonalWin(char[][] board, boolean player)
    {
        char target = '○';
        if (player)
            target = '●';
        for (int i = 0; i < 16; i++)
        {
            for (int j = 0; j < 16; j++)
            {
                if (board[i][j] == target)
                {
                    if ((board[i+1][j+1] == target) && (board[i+2][j+2] == target) && (board[i+3][j+3] == target) && (board[i+4][j+4] == target) )
                    {
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < 16; i++)
        {
            for (int j = 4; j < 19; j++)
            {
                if (board[i][j] == target)
                {
                    if ((board[i+1][j-1] == target) && (board[i+2][j-2] == target) && (board[i+3][j-3] == target) && (board[i+4][j-4] == target) )
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}