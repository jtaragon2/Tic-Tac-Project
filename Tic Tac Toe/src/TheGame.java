
import java.util.Scanner;

public class TheGame
	{
		public static int row;
		public static int col;
		public static int shelf;
		public static int a;
		public static boolean quiere;
		public static int move;
		public static int board[][][];
		public static int selectedLevel;
		public static int individual;

		public static void main(String[] args)
			{

				quiere = true;
				nameGet();
				boardMaker();
				while (quiere)
					{

						move();
						System.out.println("Would you like to play again? 1 for yes and 0 for no.");
						Scanner quiero = new Scanner(System.in);
						int quieren = quiero.nextInt();
						if (quieren == 0)
							{
								System.out.println("And I yeet");
								System.exit(0);
							}
						else if (quieren == 1)
							{
								System.out.println("Ok");
							}
						else
							{
								System.out.println("And I yeet");
								System.exit(0);
							}
					}
				;
			}

		public static void nameGet()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Ok " + name + ", Shall we play a game? 1 for yes and 0 for no.");
				Scanner userInput2 = new Scanner(System.in);
				int status = userInput2.nextInt();
				if (status == 0)
					{
						System.out.println("And I yeet");
						System.exit(0);
					}
				else if (status != 1)
					{
						System.out.println("and I yeet you and your mistake from this house.");
						System.exit(0);
					}

			}

		public static void boardMaker()
			{
				board = new int[3][3][3];
				for (row = 0; row < board.length; row++)
					{
						for (col = 0; col < board.length; col++)
							{
								for (shelf = 0; shelf < board.length; shelf++)
									{
										board[row][col][shelf] = 0;

									}
							}
					}
			}

		public static void board(int level)
			{

				if (level == 1)
					{
						System.out.println("Layer 1");
						selectedLevel = 1;
					}

				else if (level == 2)
					{
						System.out.println("Layer 2");
						selectedLevel = 2;
					}
				else if (level == 3)
					{
						System.out.println("Layer 3");
						selectedLevel = 3;
					}
				else
					{
						System.out.println("and I yeet you and your mistake from this house.");
						System.exit(0);
					}
				System.out.println("        1         2       	3");
				System.out.println("   _______________________________");
				
				for (col = 0; col < board.length; col++)
					{
						shelf = 0;
						for (individual = 0; individual <= 5; individual++)
							{

								if (individual == 1)
									{
										if ((board[level][col][shelf] == 0 || board[level][col][shelf] == 1)
												&& (board[level][col][shelf + 1] == 0
														|| board[level][col][shelf + 1] == 1)
												&& (board[level][col][shelf + 2] == 0
														|| board[level][col][shelf + 2] == 1))
											{
												System.out.println("   |         |         |         |");
											}
										else if (board[level][col][shelf] == 2
												&& (board[level][col][shelf + 1] == 0
														|| board[level][col][shelf + 1] == 1)
												&& (board[level][col][shelf + 2] == 0
														|| board[level][col][shelf + 2] == 1))
											{
												System.out.println("   |   ___   |         |         |");
											}
										else if ((board[level][col][shelf] == 0 || board[level][col][shelf + 1] == 1)
												&& board[level][col][shelf + 1] == 2
												&& (board[level][col][shelf + 2] == 0
														|| board[level][col][shelf + 2] == 1))
											{
												System.out.println("   |         |   ___   |         |");
											}
										else if ((board[level][col][shelf] == 0 || board[level][col][shelf] == 1)
												&& board[level][col][shelf + 2] == 2
												&& (board[level][col][shelf + 1] == 0
														|| board[level][col][shelf + 1] == 1))
											{
												System.out.println("   |         |         |   ___   |");
											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 2
												&& (board[level][col][shelf + 2] == 0
														|| board[level][col][shelf + 2] == 1))
											{
												System.out.println("   |   ___   |   ___   |         |");
											}
										else if ((board[level][col][shelf] == 0 || board[level][col][shelf] == 1)
												&& board[level][col][shelf + 1] == 2 && board[level][col][shelf] == 2)
											{
												System.out.println("   |         |   ___   |   ___   |");

											}
										else if (board[level][col][shelf] == 2
												&& (board[level][col][shelf + 1] == 0
														|| board[level][col][shelf + 1] == 1)
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |   ___   |         |   ___   |");
											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |   ___   |   ___   |   ___    |");
											}
									}
								else if (individual == 2)
									{
										if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |         |         |         |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |  *   *  |         |         |");
											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |         |  *   *  |         |");
											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 2
												|| board[level][col][shelf] == 1 && board[level][col][shelf + 2] == 0
												|| board[level][col][shelf + 1] == 1)
											{
												System.out.println("   |         |         |  *   *  |");
											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |  |   |  |         |         |");
											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |         |  |   |  |         |");
											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |         |         |  |   |  |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |  *   *  |  |   |  |         |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |  |   |  |  *   *  |         |");
											}

										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("   |  *   *  |  |   |  |  *   *  |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |  *   *  |         |  |   |  |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |  *   *  |  *   *  |  |   |  |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |  *   *  |  |   |  |  |   |  |");
											}

										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												|| board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |  *   *  |  *   *  |         |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("   |  *   *  |         |  *   *  |");
											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("   |         |  *   *  |  *   *  |");

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1

												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("   |  *   *  |  *   *  |  *   *  |");
											}

										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												|| board[level][col][shelf + 2] == 0)
											{
												System.out.println("   |  *   *  |  *   *  |         |");
											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("   |  |   |  |         |  *   *  |");
											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("   |         |  *   *  |  *   *  |");

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 2)
											{
												System.out.println("   |   |  |   |   |  |   |   |  |   |");
											}

									}
								else if (individual == 3)
									{
										if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("A  |         |         |         |  ");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("A   |         |         |         |");
											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("A   |         |         |         |");

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{
												System.out.println("A   |         |         |         |");

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{
												System.out.println("A   |         |         |         |");

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 01)
											{

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 2)
											{
// random
											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 2)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 02
												&& board[level][col][shelf + 2] == 2)
											{

											}
									}
								else if (individual == 4)
									{
										if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 2)
											{

											}
										else if (board[level][col][shelf] == 1 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 2)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 0
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 01
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 02
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 1)
											{

											}
										else if (board[level][col][shelf] == 2 && board[level][col][shelf + 1] == 02
												&& board[level][col][shelf + 2] == 2)
											{

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 0)
											{

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 01)
											{

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 1
												&& board[level][col][shelf + 2] == 2)
											{

											}
										else if (board[level][col][shelf] == 0 && board[level][col][shelf + 1] == 2
												&& board[level][col][shelf + 2] == 02)
											{

											}
									}
								else if (individual == 5)
									{
										System.out.println("   |_________|_________|_________|");
									}

							}
					}

//				System.out.println("   |  *   *  |	|   |  | 	     |");
//				System.out.println("A  |    *    |  |   |  |         |");
//				System.out.println("   |  *   *  |  |___|  |         |");
//				System.out.println("   |_________|_________|_________|");
//				System.out.println("   |         |         |         |");
//				System.out.println("   |	     |	   	   |		 |");
//				System.out.println("B  |         |         |         |");
//				System.out.println("   |         |         |         |");
//				System.out.println("   |_________|_________|_________|");
//				System.out.println("   |         |         |         |");
//				System.out.println("   |	     |		   |		 |");
//				System.out.println("C  |         |         |         |");
//				System.out.println("   |         |         |         |");
//				

			}

		public static void move()
			{
				System.out.println("Would you like to be X's or  O's?");
				Scanner xOrO = new Scanner(System.in);
				String xAndO = xOrO.nextLine();
				if (xAndO.equalsIgnoreCase("x"))
					{
						boolean xTrue = true;
					}
				else if (xAndO.equalsIgnoreCase("o"))
					{
						boolean xTrue;
					}
				else
					{
						System.out.println("and I yeet you and your mistake from this house.");
						System.exit(0);
					}
				System.out.println("Ok, where do you want to go? Layer 1, 2 or 3? (Just the number)");
				Scanner layer = new Scanner(System.in);
				int firstLC = layer.nextInt();
				board(firstLC);

			}
	}
