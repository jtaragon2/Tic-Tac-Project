
import java.util.Scanner;

public class TheGame
	{
		public static int row;
		public static int col;
		public static int a;

		public static int move;
		public static int board[][][];
		public static int selectedLevel;
		public static int individualRow;
		public static String name;
		public static String nameII;
		public static boolean win;
		public static int turn;
		private static boolean quiere;
		public static int layerC;
		public static int colC;
		public static int shelfC;
		public static int victory;
		public static int nameWins;
		public static int nameIIWins;
		public static int wins;
		private static Scanner getter = new Scanner(System.in);
		private static Scanner stringGetter = new Scanner(System.in);

		public static void main(String[] args)
			{

				nameGet();
				boardMaker();

				do
					{
						win = true;
						move();
						System.out.println("Would you like to play again? 1 for yes and 0 for no.");
						boardMaker();
						int quieren = getter.nextInt();
						if (quieren == 0)
							{
								quiere = false;
								System.out.println("And I yeet");
								System.exit(0);
							} else if (quieren == 1)
							{
								quiere = true;
								System.out.println("Ok");
								if (wins != 0)
									{
										if (nameWins == 1)
											{
												System.out.println(name + " has 1 win!");
											} else
											{
												System.out.println(name + " has " + nameWins + " wins!");
											}
										if (nameIIWins == 1)
											{
												System.out.println(nameII + " has 1 win!");
											} else
											{
												System.out.println(nameII + " has " + nameIIWins + " wins!");
											}
									}
							} else
							{
								System.out.println("And I yeet");
								System.exit(0);
							}
					} while (quiere);
				;
			}

		public static void nameGet()
			{

				System.out.println("First player, what is your name?");
				name = stringGetter.nextLine();

				System.out.println("Second player, what is your name?");
				nameII = stringGetter.nextLine();
				System.out
						.println("Ok " + name + " and " + nameII + " , Shall we play a game? 1 for yes and 0 for no.");

				int status = getter.nextInt();
				if (status == 0)
					{
						System.out.println("And I yeet");
						System.exit(0);
					} else if (status != 1)
					{
						System.out.println("and I yeet you and your mistake from this house.");
						System.exit(0);
					}
				System.out.println("Ok " + name + ", you will be X's and " + nameII + " will be O's.");
			}

		public static void boardMaker()
			{
				board = new int[3][3][3];
				for (row = 0; row < board.length; row++)
					{
						for (col = 0; col < board.length; col++)
							{
								for (int shelf = 0; shelf < board[row][col].length; shelf++)
									{
										board[row][col][shelf] = 0;

									}
							}
					}
			}

		public static void board()
			{

				for (row = 0; row < board.length; row++)
					{
						System.out.println("Layer " + (row + 1));
						System.out.println("        1         2         3");
						System.out.println("   _______________________________");
						for (col = 0; col < board.length; col++)
							{

								if (board[row][col][0] == 0 && board[row][col][1] == 0 && board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |         |         |  ");
										System.out.println((1 + col) + "  |         |         |         |  ");
										System.out.println("   |         |         |         |  ");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 0
											&& board[row][col][2] == 0)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |         |         |");
										System.out.println((1 + col) + "  |  |   |  |         |         |");
										System.out.println("   |  |___|  |         |         |");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 2
											&& board[row][col][2] == 0)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |         |  |   |  |         |");
										System.out.println((1 + col) + "  |         |  |   |  |         |");
										System.out.println("   |         |  |___|  |         |");

									} else if (board[row][col][0] == 0 && board[row][col][1] == 0
											&& board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |         |         |  |   |  |");
										System.out.println((1 + col) + "  |         |         |  |   |  |");
										System.out.println("   |         |         |  |___|  |");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 0
											&& board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |         |         |");
										System.out.println((1 + col) + "  |    *    |         |         |");
										System.out.println("   |  *   *  |         |         |");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 1
											&& board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |  *   *  |  *   *  |");
										System.out.println((1 + col) + "  |    *    |    *    |    *    |");
										System.out.println("   |  *   *  |  *   *  |  *   *  |");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 1
											&& board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |  *   *  |         |");
										System.out.println((1 + col) + "  |    *    |    *    |         |");
										System.out.println("   |  *   *  |  *   *  |         |");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 2
											&& board[row][col][2] == 0)
									{
										System.out.println("   |   ___   |   ___   |         |");
										System.out.println("   |  |   |  |  |   |  |         |");
										System.out.println((1 + col) + "  |  |   |  |  |   |  |         |");
										System.out.println("   |  |___|  |  |___|  |         |");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 2
											&& board[row][col][2] == 2)
									{
										System.out.println("   |   ___   |   ___   |   ___   |");
										System.out.println("   |  |   |  |  |   |  |  |   |  |");
										System.out.println((1 + col) + "  |  |   |  |  |   |  |  |   |  |");
										System.out.println("   |  |___|  |  |___|  |  |___|  |");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 0
											&& board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |         |  *   *  |  ");
										System.out.println((1 + col) + "  |         |         |    *    |  ");
										System.out.println("   |         |         |  *   *  |  ");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 1
											&& board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |  *   *  |  *   *  |  ");
										System.out.println((1 + col) + "  |         |    *    |    *    |  ");
										System.out.println("   |         |  *   *  |  *   *  |  ");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 1
											&& board[row][col][2] == 0)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |         |  *   *  |         |  ");
										System.out.println((1 + col) + "  |         |    *    |         |  ");
										System.out.println("   |         |  *   *  |         |  ");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 0
											&& board[row][col][2] == 1)
									{
										System.out.println("   |         |         |         |");
										System.out.println("   |  *   *  |         |  *   *  |  ");
										System.out.println((1 + col) + "  |    *    |         |    *    |  ");
										System.out.println("   |  *   *  |         |  *   *  |  ");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 2
											&& board[row][col][2] == 2)
									{
										System.out.println("   |         |   ___   |   ___   |");
										System.out.println("   |         |  |   |  |  |   |  |");
										System.out.println((1 + col) + "  |         |  |   |  |  |   |  |");
										System.out.println("   |         |  |___|  |  |___|  |");

									} else if (board[row][col][0] == 1 && board[row][col][1] == 1
											&& board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |  *   *  |  *   *  |  |   |  |");
										System.out.println((1 + col) + "  |    *    |    *    |  |   |  |");
										System.out.println("   |  *   *  |  *   *  |  |___|  |");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 2
											&& board[row][col][2] == 2)
									{
										System.out.println("   |         |   ___   |   ___   |");
										System.out.println("   |  *   *  |  |   |  |  |   |  |");
										System.out.println((1 + col) + "  |    *    |  |   |  |  |   |  |");
										System.out.println("   |  *   *  |  |___|  |  |___|  |");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 2
											&& board[row][col][2] == 1)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |  *   *  |  |   |  |  *   *  |  ");
										System.out.println((1 + col) + "  |    *    |  |   |  |    *    |  ");
										System.out.println("   |  *   *  |  |___|  |  *   *  |  ");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 2
											&& board[row][col][2] == 1)
									{
										System.out.println("   |   ___   |   ___   |         |");
										System.out.println("   |  |   |  |  |   |  |  *    * |");
										System.out.println((1 + col) + "  |  |   |  |  |   |  |    *    |");
										System.out.println("   |  |___|  |  |___|  |  *    * |");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 0
											&& board[row][col][2] == 2)
									{
										System.out.println("   |   ___   |         |   ___   |");
										System.out.println("   |  |   |  |         |  |   |  |");
										System.out.println((1 + col) + "  |  |   |  |         |  |   |  |");
										System.out.println("   |  |___|  |         |  |___|  |");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 1
											&& board[row][col][2] == 1)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |  *   *  |  *   *  |  ");
										System.out.println((1 + col) + "  |  |   |  |    *    |    *    |  ");
										System.out.println("   |  |___|  |  *   *  |  *   *  |  ");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 1
											&& board[row][col][2] == 2)
									{
										System.out.println("   |   ___   |         |   ___   |");
										System.out.println("   |  |   |  |  *   *  |  |   |  |");
										System.out.println((1 + col) + "  |  |   |  |    *    |  |   |  |");
										System.out.println("   |  |___|  |  *   *  |  |___|  |");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 1
											&& board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |         |  *   *  |  |   |  |  ");
										System.out.println((1 + col) + "  |         |    *    |   |   |  |  ");
										System.out.println("   |         |  *   *  |  |___|  |  ");
									} else if (board[row][col][0] == 0 && board[row][col][1] == 2
											&& board[row][col][2] == 1)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |         |  |   |  |  *   *  |  ");
										System.out.println((1 + col) + "  |         |  |   |  |    *    |  ");
										System.out.println("   |         |  |___|  |  *   *  |  ");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 0
											&& board[row][col][2] == 2)
									{
										System.out.println("   |         |         |   ___   |");
										System.out.println("   |  *   *  |         |  |   |  |  ");
										System.out.println((1 + col) + "  |    *    |         |  |   |  |  ");
										System.out.println("   |  *   *  |         |  |___|  |  ");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 0
											&& board[row][col][2] == 1)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |         |  *   *  |");
										System.out.println((1 + col) + "  |  |   |  |         |    *    |");
										System.out.println("   |  |___|  |         |  *   *  |");
									} else if (board[row][col][0] == 1 && board[row][col][1] == 2
											&& board[row][col][2] == 0)
									{
										System.out.println("   |         |   ___   |         |");
										System.out.println("   |  *   *  |  |   |  |         |  ");
										System.out.println((1 + col) + "  |    *    |  |   |  |         |  ");
										System.out.println("   |  *   *  |  |___|  |         |  ");
									} else if (board[row][col][0] == 2 && board[row][col][1] == 1
											&& board[row][col][2] == 0)
									{
										System.out.println("   |   ___   |         |         |");
										System.out.println("   |  |   |  |  *   *  |         |");
										System.out.println((1 + col) + "  |  |   |  |    *    |         |");
										System.out.println("   |  |___|  |  *   *  |         |");
									}
								System.out.println("   |_________|_________|_________|");

							}
						System.out.println();
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
		public static boolean hasWon()
			{
				if (board[1][1][1] + board[2][2][2] + board[0][0][0] == 3)
					{
						return true;
					}
				return false;
			}

		public static void move()
			{
				board();
				while (win)
					{
//			System.out.println("Would you like to be X's or  O's?");
//			Scanner xOrO = new Scanner(System.in);
//			String xAndO = xOrO.nextLine();
//			if (xAndO.equalsIgnoreCase("x"))
//				{
//					boolean xTrue = true;
//				} else if (xAndO.equalsIgnoreCase("o"))
//				{
//					boolean xTrue;
//				} else
//				{
//					System.out.println("and I yeet you and your mistake from this house.");
//					System.exit(0);
//				}
						if (turn % 2 == 0)
							{
								
								System.out.println("Ok " + name
										+ ", where do you want to go? Layer 1, 2, or 3? (Just the number)");

								layerC = getter.nextInt();
								System.out.println(
										"Ok " + name + ", where do you want to go? Row 1, 2, or 3? (Just the number)");

								colC = getter.nextInt();
								System.out.println("Ok " + name
										+ ", where do you want to go? Column 1, 2, or 3? (Just the number)");

								shelfC = getter.nextInt();
								board[layerC - 1][colC - 1][shelfC - 1] = 1;
								turn++;
							} else if (turn % 2 == 1)
							{
								
								System.out.println("Ok " + nameII
										+ ", where do you want to go? Layer 1, 2, or 3? (Just the number)");

								layerC = getter.nextInt();
								System.out.println("Ok " + nameII
										+ ", where do you want to go? Row 1, 2, or 3? (Just the number)");

								colC = getter.nextInt();
								System.out.println("Ok " + nameII
										+ ", where do you want to go? Column 1, 2, or 3? (Just the number)");

								shelfC = getter.nextInt();
								board[layerC - 1][colC - 1][shelfC - 1] = 2;
								turn++;
							}
						board();
						if (turn >= 5)
							{
								System.out.println("Has anyone won yet? 1 for yes and 0 for no.");

								victory = getter.nextInt();
								if (victory == 1)
									{
										win = false;
										wins++;
										System.out.println("Who won?");
										String winner = stringGetter.nextLine();
										if (winner.toLowerCase().equals(name.toLowerCase()))
											{
												nameWins++;
											} else if (winner.toLowerCase().equals(nameII.toLowerCase()))
											{
												nameIIWins++;
											}
									}
							}
					}
			}
	}
