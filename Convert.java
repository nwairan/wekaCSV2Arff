package Convert;

/**
 *
 * @author Nwairan
 */

import java.io.File;
import java.io.IOException;
import weka.*;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
public class Convert {

   public static void main(String[] args)
   {
		
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File("File.csv"));
 		Instances data = loader.getDataSet();
		ArffSaver saver = new ArffSaver();
		saver.setInstances(data);
		saver.setFile(new File("File.arff"));
		saver.writeBatch();
		
	}
}
