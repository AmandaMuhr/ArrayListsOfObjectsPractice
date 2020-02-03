import java.util.ArrayList;

public class Song
	{
		static ArrayList <SongTwo> musicStore = new ArrayList <SongTwo>();

		public static void main(String[] args)
			{
			
				musicStore.add(new SongTwo("Homework Blues", "Lay-Z", 180));
				musicStore.add(new SongTwo ("Why Am I Still at School?", "Friday", 90));
				musicStore.add(new SongTwo ("Weekend Waltz", "Classical Cooper", 240));
				musicStore.add(new SongTwo("Quiz Next Period", "Senora Baldwin", 600));
				musicStore.add(new SongTwo("Song to Sound Epic While Coding", "That Nerd", 3600));
				musicStore.add(new SongTwo("Ch 19 Due on Monday", "Mr. DeNezza", 14400));
				
				printList();
				cutOffTenSeconds();
				printList();
				replaceName();
				printList();

			}
		
		public static void printList()
			{
				for (int x = 0; x < 6; x++)
					{
						{
							System.out.println("Song #" + (x + 1));
							System.out.println(musicStore.get(x).getTitle());
							System.out.println(musicStore.get(x).getArtist());
							System.out.println(musicStore.get(x).getLengthInSeconds());
							System.out.println(" ");
									
						}
					
					}
				System.out.println(" ");
			}
		
		public static void cutOffTenSeconds()
			{
				System.out.println("Here are the songs that have had 10 seconds removed:");
				
				for (int i = 0; i < 6; i++)
					{
						musicStore.get(i).getLengthInSeconds();
						musicStore.get(i).setLengthInSeconds(musicStore.get(i).getLengthInSeconds() - 10);
					
					}
				System.out.println(" ");
			}
		

		
		public static void replaceName()
			{
				System.out.println("BREAKING NEWS!!! Renowned artist Lay-Z didn't sing the hit 'Homework Blues.' It was actually performed by Amanda Muhr.");
				musicStore.get(0).getArtist();
				musicStore.get(0).setArtist("Amanda Muhr");
				
			}

		
	}