// YEUNG KIT WONG
// ASSIGNMENT #7
// 11-16-2014

public class GeoLocationClient
{
	public static void main (String[]args)
	{
		//Construct the three GeoLocation objects
		//with their latitude and longitude
		GeoLocation stash = new GeoLocation (34.988889, -106.614444);
		GeoLocation studio = new GeoLocation (34.989978, -106.614357);
		GeoLocation fbi = new GeoLocation (35.131281, -106.61263);
		//Print out the latitude and longitude of
		//three GeoLocation objects by calling the toString method
		System.out.println ("the stash is at " + stash.toString ());
		System.out.println ("ABQ studio is at " + studio.toString ());
		System.out.println ("FBI building is at " + fbi.toString ());
		//Print out the distance between stash and
		//studio/fbi by calling the distanceFrom method
		System.out.println ("distance in miles between:");
		System.out.println ("   stash/studio = " + stash.distanceFrom (studio));
		System.out.println ("   stash/fbi    = " + stash.distanceFrom (fbi));
	}
}