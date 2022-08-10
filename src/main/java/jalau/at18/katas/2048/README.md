# 2048 Game

The 2048 game is a simple, but challenging game. How to win the game? create a 2048 tile!

## Game setup
The game consists of a 4x4 grid where each grid element is a tile. Empty tiles can be represented with value 0, and non-empty tiles can be integer numbers greater or equals to 2.
Game starts with 2 non-empty tiles in random grid positions with values 2 or 4, defined randonmly as well.

Player can move the grid up, right, left and down. Each time player moves the grid, all tiles "slide" in the direction that the player has moved the grid following rules below:

- A tile can move until a grid position before hits a grid position where another non-empty tile exists or until it reaches a grid limit
- If two tiles are "hit" and they have the same value, they "merge" becoming one single tile with a new value that is the result of sum of merged tiles values
- A tile cannot be merged twice in one single movement
- After a grid move is completed, a new non-empty tale with value 2 or 4 is added to the grid in a random position where empty tiles are set

Probably rules are not good enough to understand the game, so lets play it!
https://play2048.co/

## Task
Implement 2048!

Note: main focus should be to work on game's core functionality, user graphical interface is a secondary thing, hence, not need to worry about it for now.

## Instructions for this kata
This kata will be solved in teams of 4 people, each team will work in a single branch. Each team member will have 7 minutes to share his screen and be "pilot", this means, he/she will code and work on the solution, while the rest of the team can help suggesting ideas or changes. After the 7 minutes elapses, team member must commit work he has so far in the team branch, push it and pass the control to the next team member to be the "pilot".

The solution must follow code conventions enforced by checkstyle and unit test to validate all code implemented.