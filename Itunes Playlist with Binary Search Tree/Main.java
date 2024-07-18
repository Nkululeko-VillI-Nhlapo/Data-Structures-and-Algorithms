// Surname:     Baker
// Name:        Clayton
// Student no.: -------
// Course:      CSC211 
// Year:        2023 
// Assignment:  Practical 1 Term 2
// File:        Main.java 


/* 
   The code below is an implementation of a driver program meant to test 
   the Track.java and Playlist.java classes for the practical assignment. 
   DO NOT modify the code here. When testing your code, execute only this file.
*/

class Main 
{
	public static void main(String [] args)
	{
		Playlist play = new Playlist();
		System.out.println("Let's build a playlist:");
		System.out.println();
		play.insert("11","Ordinary People","John Legend","Get Lifted",4,42);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot()) + "\t [ 2 marks]");
		play.insert("8","Strangers by Nature","Adele","30",3,56);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");	
		play.insert("6","Adore You", "Miley Cyrus", "Bangerz",4,39);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.insert("1","Natural","Imagine Dragons","Origins",3,10);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.insert("2","Bad Habits","Ed Sheeran","=",3,51);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.insert("4","This Town","Niall Horan","Flicker",3,54);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.insert("6","Levitating","Dua Lipa","Future Nostalgia",3,24);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");	
		play.delete("Bad Habits");
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.insert("1","Scorpionfish","Beatenberg","The Hanging Gardens of Beatenberg",3,28);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.insert("6","Africa","Toto","Toto IV",4,55);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");	
		play.insert("3","Photograph","Ed Sheeran","x",4,19);
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.delete("Scorpionfish");
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.delete("Africa");
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		play.delete(play.getRoot().getTitle());
		System.out.println("Playlist size: " + play.getSize() + "\t Playlist height: " + play.height(play.getRoot())+ "\t [ 2 marks]");
		System.out.println();
		System.out.println("Final playlist:");
		System.out.println();
		play.displayInOrder(play.getRoot());
		System.out.println("----End of program----");
	}
}
