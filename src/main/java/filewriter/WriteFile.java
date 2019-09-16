package filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static File file = null;
    private static FileWriter Writer;

    public WriteFile() {}

    public static void createFile()
    {
        try
        {
            if ( file == null )
            {
                file = new File( "swingy.txt" );
                file.createNewFile();
            }
            Writer = new FileWriter( file, true );
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace();
        } 
    }

    public static void writeToFile( String str )
    {
        try
        {
            file = new File( "swingy.txt" );
            Writer = new FileWriter( file, true );
            
            Writer.append( str );
            Writer.append( '\n' );
            Writer.close();
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace();
        } 
    }

    public static void closeFile()
    {
        try
        {
            if ( Writer != null )
                Writer.close();
            else
                return;
        }
        catch ( IOException ioe )
        {
            ioe.printStackTrace();
        }
    }
}


