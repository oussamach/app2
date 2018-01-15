package tictac;

	import java.util.ArrayList;
	import java.util.Random;
	import java.util.Scanner;
public class tictac2 {

		static Scanner sc = new Scanner(System.in);
		public static int d = 0;
		public static int comsn = 0;
		public static int arraysize = 2;
		public static int newsize =0;
		public static int sn[] = new int[arraysize];
		public static int sn1[] = new int[10];
		public static void   lvlname(int niv,int maxn) {
				System.out.println("Vous avez choisi le niveau "+ niv +" qui contient entre 1 et "+maxn);
			}
		public void testint(int nt) {
		}
		public static void sizearray() {	
		}
		public static void rest() {
			String que;
			do 
			{
				System.out.println("Vous voulez recommencer Oui/Non");
				que = sc.next();
				//boolean rest;
				if (que.equals("Oui")) 
				{
					lvl();
					jeux();

				}
				else if(que.equals("Non")) 
				{
				}	
			}while(que.equals("Oui")== false || que.equals("Non")  );	
		}
		public static void lvl() {
			//************************LEVEL*************************
			
			int level[] = new int [5];
			level[0] =100;
			level[1] =200;
			level[2] =300;
			level[3] =400;
			level[4] =500;
			//************************NAME LEVEL*************************
			String st[]=new String [5];
			st[0]="Facile";
			st[1]="Moyen";
			st[2]="Déficile";
			st[3]="Pro";
			st[4]="Master";
			//*************************************************
			int nl = 0;
			do {
				//if ()
				System.out.println("Chosissiez une level entre 0 et 4 SVP:");
				
				nl = sc.nextInt();
			}while(nl<0 || nl>=st.length);
			switch(nl){
			case 0:
				 d=level[0];
				 lvlname(nl,d);
				 break;
			case 1:
				d=level[1];
				lvlname(nl,d);
				break;
			case 2:
				 d=level[2];
				 lvlname(nl,d);
				 break;
			case 3:
				d=level[3];
				lvlname(nl,d);
				break;
			case 4:
				 d=level[4];
				 lvlname(nl,d);
				 break;
				
			}
		}
		public static void HelpPlayerWin() {
			
		}
		public static void jeux() {
			Random rd = new Random();
			int a = rd.nextInt(d) + 1;
			int g =a;
			System.out.println("numero random : "+g);
			int cmax =0;
			int cmin =0;
			int cerr =0;
			int totf =0;// cmax +cmin
			int nfmin =0 ; //nombre cherche
			int nfmax=0;
			String aide ="";
			int c;
			ArrayList<Integer> obj = new ArrayList<Integer>();
			do {
				//Saisi le nombre  lucky
				System.out.println("Entrez le nombre lucky :");
				c = sc.nextInt();
				//test win
				comsn++;
				obj.add(c);
				if (c>d || c<0 ) 
				{
					System.out.println("Error : vous devez  Saisi le lucky numero  entre 1"+" et "+d);
					cerr++;
				}
				else {
						if (c>g) 
						{
							System.out.println("Le nombre "+c+" que vous avez saisi est plus grand  que le nombre Random");
							
							cmax++;
							if (cmax==3) 
							{
								System.out.println("====================");
								System.out.println("Vous voulez une aide");
								System.out.println("====================");
								aide = sc.next();
										if (aide.equals("Oui"))
										{
											nfmin = g-10;
											nfmax =g+10;
											System.out.println("Le nombre que vous cherchez est entre"+nfmin+" et "+ nfmax);
										}
										else
											{
												System.out.println("OK, Vous continuez le jeu sans aide  Bon courage");
											}	
							}
							
						}
						else if (c==g)
						{
							System.out.println("Vous avez gagné");
								if (cmax==0 && cmin==0)
								{
									System.out.println("Felicitationns!! Vous avez trouvé le nombre  dans la premiere fois");
									rest();
								}
								else 
								{
									System.out.println("Vous avez saisi le nombre le plus grand que le nombre random "+cmax+" fois");
									System.out.println("Vous avez saisi le nombre le plus petit que le nombre random "+cmin+" fois");
									totf= cmax+cmin;
									System.out.println("Les nombres total de numero que vous avez saisi est "+totf);
									System.out.println("Les nombres total de numero error que vous avez saisi est "+cerr);
									System.out.println("Le jeu est terminée");
									System.out.println("Voici la liste des numero que vous avez saisi depuis le debut");
									for(int i=0;i<obj.size();i++) {
										System.out.println(obj.get(i));
									}
									rest();
									
								}
								break;
						}
						else 
						{
							System.out.println("Le nombre "+c+" que vous avez saisi est plus petit  que le nombre Random");
							cmin++;
							if (cmin==3) 
							{
								System.out.println("====================");
								System.out.println("Vous voulez une aide");
								System.out.println("====================");
								aide = sc.next();
										if (aide.equals("Oui"))
										{
											nfmin = g-10;
											nfmax =g+10;
											System.out.println("Le nombre que vous cherchez est entre"+nfmin+" et "+ nfmax);
										}else 
											{
												System.out.println("OK, Vous continuez le jeu sans aide  Bon courage");
											}
							}
							
						}
					}
			}while(c!=g);
		}
		public static void main(String[] args) {
			lvl();

			jeux();
			
		}

	}
