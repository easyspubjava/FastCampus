package ch06.maze;

import java.util.Stack;


public class Robot{

	public static int NUMDIRECTIONS =  4;
	public static int WIDTH = 8;
	public static int HEIGHT = 8;
	
	Stack<Move> stack = new Stack<Move>();
	Move Move;
	Maze maze = new Maze();
	
	public int[][] DIRECTION_OFFSETS = 
	{
		{0, -1},		// 위쪽으로 이동.
		{1, 0},			// 오른쪽으로 이동.
		{0, 1},			// 아래쪽으로 이동.
		{-1, 0}			// 왼쪽으로 이동.
	};
	
	public static int NOTVISIT = 0;
	public static int WALL = 1;
	public static int VISIT = 2;
	int[][] markArray = new int[8][8];
		
	public void findPath( int startX, int startY, int endX, int endY) {
		
		boolean isEmpty = false; 
		boolean isFound = false;
		int i = 0;

		Move start = new Move(startX, startY);

		start.direction = 0;
		stack.push(start);
		
		while(isEmpty == false && isFound == false) {
			
				Move curPos = stack.pop();
				int x = curPos.x;
				int y = curPos.y;
				int direction = curPos.direction;

				while(isFound == false && direction < NUMDIRECTIONS) {
				
					int newX = x + DIRECTION_OFFSETS[direction][0];
					int newY = y + DIRECTION_OFFSETS[direction][1];

					if (newX >= 0 && newX < WIDTH
								&& newY >= 0 && newY < HEIGHT
								&& maze.myMaze[newY][newX] == NOTVISIT
								&& markArray[newY][newX] == NOTVISIT) {										
						Move newPosition = new Move(newX, newY);
						newPosition.direction = direction + 1;
						stack.push(newPosition);
						markArray[y][x] = VISIT;

						x = newX;
						y = newY;
						direction = 0;

						if (newX == endX && newY == endY) {
							isFound = true;
							newPosition.x = newX;
							newPosition.y = newY;
							newPosition.direction = 0;
							stack.push(newPosition);
							markArray[newY][newX] = VISIT;
						}
					}
					else direction++;
				}//end-of-while
			isEmpty = stack.isEmpty();
		}//end-of-while
	}

	
	public void showPath() {
		int[][] resultArray = new int[8][8];
		boolean isEmpty = false;
		
		
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				resultArray[i][j] = maze.myMaze[i][j];
			}
		}
		
		
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				if (maze.myMaze[i][j] == WALL) {
					System.out.print("*");
				}
				else if (maze.myMaze[i][j] == VISIT) {
					System.out.print(".");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		int i = 0;
		while(isEmpty == false) {
			Move move = stack.pop();
			int x = move.x;
			int y = move.y;
			resultArray[y][x] = VISIT;

			if (i > 0) {
				System.out.print("<-");
			}
			System.out.print("(" + x +"," + y + ") ");
			i++;
			isEmpty = stack.isEmpty();
		}
		System.out.println();
	}
}
