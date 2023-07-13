# Tic Tac Toe Game

This is a simple implementation of the classic Tic Tac Toe game in Java. The game is played on a 3x3 grid, where two players take turns marking X and O on the board. 
The objective of the game is to get three of your symbols in a row, either horizontally, vertically, or diagonally, before the opponent does.

This project was developed as a practice exercise from Great Learning, an online platform that offers high-quality courses and programs in various domains.

## Features

- The game is played in the console/terminal.
- The game board is displayed after each move.
- The players can make their moves by entering a number from 1 to 9 corresponding to the position on the board.
- The game validates the moves and prevents players from choosing already occupied positions.
- The game checks for a winner after each move and declares the result (win, loss, or draw).
- The game continues until there is a winner or the board is filled.

## Getting Started

To run the game, follow these steps:

1. Ensure you have Java installed on your machine.
2. Download or clone the project code to your local machine.
3. Compile the Java source file `TicTacToe.java` using the following command:
   ```
   javac TicTacToe.java
   ```
4. Run the compiled Java program using the following command:
   ```
   java TicTacToe
   ```
5. The game will start in the console/terminal, and you can begin playing by following the instructions.

## How to Play

1. The game will display an empty game board at the beginning.
2. Players take turns making their moves by entering a number from 1 to 9, which corresponds to the position they want to mark on the board.
3. The game validates the move, and if it is valid, the board is updated with the player's symbol (X or O) in the chosen position.
4. After each move, the game checks for a winner. If a player has three symbols in a row, they win the game.
5. If no player has won and the board is filled, the game is declared a draw.
6. The game continues until there is a winner or a draw.
7. After the game ends, the result is displayed, and players can choose to play again or exit the game.

## Example Gameplay

```
Welcome to Tic Tac Toe!
Here is the initial game board:

 | | 
-----
 | | 
-----
 | | 

Enter a number from 1 to 9: 5

Player 1 (X) has made a move.
The updated game board:

 | | 
-----
 |X| 
-----
 | | 

Enter a number from 1 to 9: 1

Player 2 (O) has made a move.
The updated game board:

O| | 
-----
 |X| 
-----
 | | 

...

Player 1 (X) has made a move.
The updated game board:

O|X| 
-----
O|X| 
-----
X|O|X

Player 1 (X) wins! Congratulations!

Would you like to play again? (Y/N): N

Thank you for playing Tic Tac Toe!

```
#Contributions

Contributions to the project are welcome. If you find any issues or have suggestions for improvements, feel free to create a pull request or open an issue in the project repository.

Have fun playing Tic Tac Toe!

