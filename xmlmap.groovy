import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;        

import org.apache.commons.io.IOUtils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

f = new FileInputStream("C:\\temp\\cameoisgroovy\\packages.xml"); 
def list = new XmlParser().parse(f)


// work on inidividual elements of the map list.
