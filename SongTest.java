// Η προηγούμενη υποβολή την βδομάδα 4,είχε λάθη τα οποία διορθώθηκαν


import java.util.Scanner;

public class SongTest{
	public static void main (String [] args) {
		Scanner scanner= new Scanner (System.in);
		Singer sin[]= new Singer[10];
	    Song song[]= new Song[10];

		sin[0] = new Singer ("Frank Sinatra",0);
		song[0]= new Song("White Christmas",sin[0],"https://www.youtube.com/watch?v=q_XzZNCDWCA");


		sin[1]= new Singer ("Chris",1);
		song[1]= new Song("Driving home for christmas", sin[1],"https://www.youtube.com/watch?v=EvDxSW8mzvU");


		sin[2]= new Singer("Sia",2);
		song[2]=new Song ("Santa's Coming For Us",sin[2], "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		sin[3]= new Singer("Mariah",3);
		song[3]=new Song ("All I Want for Christmas Is You", sin[3], "https://www.youtube.com/watch?v=yXQViqx6GMY" );
		sin[4]= new Singer("Wham",4);
		song[4]=new Song ("Last Christmas", sin[4], "https://www.youtube.com/watch?v=E8gmARGvPlI" );

		while (true){
			System.out.println("************ Welcome to our DMST Christmas Music Application************ ");
			System.out.println("Menu");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("\nList of Singers ");
				for (Singer  singer: sin){
					if (singer!= null)
						System.out.println(singer.toString());
				}
			}

			else if (choice == 2 ){
				int count=0;
				for (int i=0; i < sin.length; i++){
					if (sin[i]!=null && sin[i].getName().equals("Frank Sinatra")) {
						for (int j=0; j < song.length; j++){
							if (song[j]!=null && song[j].getSinger().equals(sin[i])){
								count++;
								System.out.println(song[j].getΤitle());
								System.out.println(song[j].getUrl());
							}
						}
					}
				}
				System.out.println(count + " number of songs of Frank Sinatra");
			}
			else{
								System.out.println("wrong input");
								System.out.println("------------------\n");
			}
		}
	}
}


