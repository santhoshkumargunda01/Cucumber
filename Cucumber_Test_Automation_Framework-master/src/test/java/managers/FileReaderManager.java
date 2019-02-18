package managers;
 
import dataProvider.ConfigFileReader;

public class FileReaderManager {
 
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	ConfigFileReader configFileReader;
 
	private FileReaderManager() {
	}
 
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
 
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
}