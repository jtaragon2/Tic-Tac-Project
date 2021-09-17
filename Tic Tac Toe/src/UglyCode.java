
public class UglyCode
	{
		/*else if ((board[row][col][0] == 1) && (board[row][col][1]==0) && (board[row][col][2]==0)) {
			System.out.println((1 + col) + "  |         |    *    |         |");
		}
		else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 2
				&& (board[row][col][1 + 2] == 0 || board[row][col][1 + 2] == 1))
		{
			System.out.println("   |   ___   |   ___   |         |");
		} else if ((board[row][col][1] == 0 || board[row][col][1] == 1)
				&& board[row][col][1 + 1] == 2 && board[row][col][1] == 2)
		{
			System.out.println("   |         |   ___   |   ___   |");

		} else if (board[row][col][1] == 2
				&& (board[row][col][1 + 1] == 0 || board[row][col][1 + 1] == 1)
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |   ___   |         |   ___   |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |   ___   |   ___   |   ___    |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |         |         |         |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  *   *  |         |         |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |         |  *   *  |         |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |         |         |  *   *  |");

		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |         |         |  |   |  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  *   *  |  |   |  |         |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  |   |  |  *   *  |         |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  *   *  |  |   |  |  *   *  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  *   *  |         |  |   |  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  *   *  |  *   *  |  |   |  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  *   *  |  |   |  |  |   |  |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println((1 + col) + "  |  |   |  |  *   *  |        |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				|| board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  *   *  |  *   *  |         |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  *   *  |         |  *   *  |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |         |  *   *  |  *   *  |");

		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1

				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  *   *  |  *   *  |  *   *  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				|| board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  *   *  |  *   *  |         |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  |   |  |         |  *   *  |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |         |  *   *  |  *   *  |");

		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |   |  |   |   |  |   |   |  |   |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 0)
		{

		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  *   *  |         |         |");
			System.out.println((1 + col) + "  |    *    |         |         |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println((1 + col) + "  |    *    |    *    |         |");

		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |    *    |    *    |    *    |");

		
			

		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |         |         |    *    |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |    *    |         |    *    |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |         |    *    |    *    |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println((1 + col) + "  |    *    |  |   |  |         |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |    *    |  |   |  |    *    |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println((1 + col) + "  |    *    |  |   |  |  |   |  |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println((1 + col) + "  |  |   |  |         |         |");

		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |  |   |  |    *    |    *    |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println((1 + col) + "  |  |   |  |    *    |  |   |  |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println((1 + col) + "  |  |   |  |  |   |  |         |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println((1 + col) + "  |  |   |  |  |   |  |    *    |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 02
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println((1 + col) + "  |  |   |  |  |   |  |  |   |  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println((1 + col) + "  |    *    |    *    |  |   |  |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |         |         |         |");

		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  *   *  |  *   *  |         |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  *   *  |  *   *  |  *   *  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  *   *  |  *   *  |  |___|  |");
		} else if (board[row][col][1] == 1 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  *   *  |  |___|  |  |___|  |");

		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println((1 + col) + "  |  |   |  |    *    |         |");
			System.out.println("   |  |___|  |  *   *  |         |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 0
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  |___|  |         |  *   *  |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  |___|  |  *   *  |  *   *  |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 02
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |  |___|  |  |___|  |         |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 1)
		{
			System.out.println("   |  |___|  |  |___|  |  *   *  |");
		} else if (board[row][col][1] == 2 && board[row][col][1 + 1] == 02
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |  |___|  |  |___|  |  |___|  |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 0)
		{
			System.out.println("   |         |  *   *  |         |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 01)
		{
			System.out.println("   |         |  *   *  |  *   *  |");
		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 1
				&& board[row][col][1 + 2] == 2)
		{
			System.out.println("   |         |  *   *  |  |___|  |");

		} else if (board[row][col][1] == 0 && board[row][col][1 + 1] == 2
				&& board[row][col][1 + 2] == 02)
		{
			System.out.println("   |         |  |___|  |  |___|  |");
		} else if (board[row][col][0] == 1 && board[row][col][1] == 2
				&& board[row][col][2] == 0)
		{

			System.out.println("   |  *   *  |  |___|  |         |");
		}
		*/
	}
