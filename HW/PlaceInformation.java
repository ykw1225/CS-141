// YEUNG KIT WONG
// ASSIGNMENT #7
// 11-16-2014

public class PlaceInformation
{
	public static final double RADIUS = 3963.1676;  // Earth radius in miles

	private String name;
	private String address;
	private String tag;
	private double latitude;
	private double longitude;
	GeoLocation place = new GeoLocation (latitude, longitude);

	//Constructs a place information object with given information
	public PlaceInformation (String name, String address, String tag, double latitude, double longitude)
	{
		this.name = name;
		this.address = address;
		this.tag = tag;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	//The following methods are the getters
	//Return the name of place
	public String getName ()
	{
		return this.name;
	}
	//Return the address of place
	public String getAddress ()
	{
		return this.address;
	}
	//Return the tags of place
	public String getTag ()
	{
		return this.tag;
	}

	//Return a string representation of the name and address of the place
	public String toString ()
	{
		return this.name+", "+this.address;
	}
	//Return the distance in miles between this place and the given place
	public double distanceFrom (GeoLocation given)
	{
		double latThis = Math.toRadians(this.latitude);
		double longThis = Math.toRadians(this.longitude);
		double latGiven = Math.toRadians(given.getLatitude());
		double longGiven = Math.toRadians(given.getLongitude());
		// apply the spherical law of cosines with a triangle composed of
		// the two locations and the north pole
		double theCos = Math.sin(latThis) * Math.sin(latGiven) + Math.cos(latThis) * Math.cos(latGiven) * Math.cos(longThis - longGiven);
		double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
	}
}