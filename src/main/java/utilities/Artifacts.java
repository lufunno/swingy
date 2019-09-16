package utilities;

import java.util.*;

public class Artifacts 
{
	private static final String artifacts[] = { "FIGHT", "ARMOR", "HELM" };

	public static String randomArtifact()
	{
		Random random = new Random();
		return ( artifacts[random.nextInt( 3 )] );
	}
}