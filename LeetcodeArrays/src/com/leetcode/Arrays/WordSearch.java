package Leetcode79;

public class WordSearch {

	public static void main(String[] args) {

		char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
				{ 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
				{ 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };

		boolean value = exists(grid, "anda");
		System.out.println(value);

		// display(grid);

	}

	static boolean visited[][];

	private static boolean exists(char[][] board, String word) {
		// TODO Auto-generated method stub

		visited = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if ((word.charAt(0) == board[i][j]) && searchWord(board, word, i, j, 0)) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean searchWord(char[][] board, String word, int i, int j, int index) {
		// TODO Auto-generated method stub

		if (index == word.length()) {
			return true;
		}

		if (i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index)
				|| visited[i][j]) {
			return false;
		}

		visited[i][j] = true;
		if (searchWord(board, word, i - 1, j, index + 1) || searchWord(board, word, i + 1, j, index + 1)
				|| searchWord(board, word, i, j - 1, index + 1) || searchWord(board, word, i, j + 1, index + 1)) {
			return true;
		}

		visited[i][j] = false;

		return false;

	}

}
