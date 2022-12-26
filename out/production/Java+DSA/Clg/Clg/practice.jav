VideoStore xyz = new VideoStore();
	xyz.addVideo("The Matrix");
	xyz.addVideo("Godfather II");
	xyz.addVideo("Star Wars Episode IV: A New Hope");
	Scanner sc = new Scanner(System.in);
	Boolean exit = true;
	while(exit){
	System.out.println("Enter 1 to add a new movie");
	System.out.println("Enter 2 to rent out a movie");
	System.out.println("Enter 3 to return a rented movie");
	System.out.println("Enter 4 to rate a video");
	System.out.println("Enter 5 to list all available");
	System.out.println("Enter 6 to exit the program\n");
Integer choice = Integer.parseInt(sc.nextLine());
String title;
Float ratings;
switch(choice){
case 1:
System.out.print("\nEnter the title of the video: ");
title = sc.nextLine();
xyz.addVideo(title);

choice = 0;
System.out.println(" ");
break;
case 2:
System.out.print("\nEnter the title of the video you want to rent: ");
title = sc.nextLine();
xyz.checkOut(title);
choice = 0;
System.out.println(" ");
break;
case 3:
System.out.print("\nEnter the title of the video youwant to return: ");
title = sc.nextLine();
xyz.returnVideo(title);
choice = 0;
System.out.println(" ");
break;
case 4:
System.out.print("\nEnter the title of the video you want to rate: ");
title = sc.nextLine();
System.out.print("Enter your ratings: ");
ratings = Float.parseFloat(sc.nextLine());
xyz.receiveRatings(title, ratings);
choice = 0;
System.out.println(" ");
break;
case 5:
System.out.println(" ");
xyz.listItems();
choice = 0;
System.out.println(" ");
break;
case 6:
sc.close();
exit = false;
}
}
}
}
class Video {
String title ;
Integer flag = 1;
Float rating = 0.0f;
Integer firstRating = 0;
void checkedOut() {
	flag = 0;
	}
	void returned() {
	flag = 1;
	}
	void receiveRating( Float val) {
	if(firstRating == 0){
	rating = val;
	firstRating++;
	}
	else{
	rating+=val;
	rating/=2;
	}
	}
	}
	class VideoStore {
	Video listVideos[] = new Video[10];
	Integer current = 0;
	void addVideo(String title) {
	Video temp = new Video();
	temp.title = title;
	listVideos[current] = temp;
	current++;
	}
	void checkOut(String title) {
		for(Integer i=0; i<current; i++) {
		if (listVideos[i].title.equals(title)) {
		listVideos[i].checkedOut();
		break;
		}
		}
		}
		void returnVideo(String title) {
		for(Integer i=0; i<current; i++) {
		if (listVideos[i].title.equals(title)) {
		listVideos[i].returned();
		break;
		}
		}
		}
		void receiveRatings(String title, Float rate) {
		for(Integer i=0; i<current; i++) {
		if (listVideos[i].title.equals(title)) {
		listVideos[i].receiveRating(rate);
		break;
		}
		}
		}
		void listItems() {
			for(Integer i=0; i<current; i++) {
			if (listVideos[i].flag == 1) {
			System.out.println("Video "+(i+1)+" is "+listVideos[i].title);
			System.out.println("Ratings: "+listVideos[i].rating);
			}
	      	}