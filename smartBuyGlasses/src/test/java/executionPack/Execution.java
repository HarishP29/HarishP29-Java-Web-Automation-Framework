package executionPack;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import products.Glasses;
import products.Lenses;
import products.OpenBrowser;
import products.SunGlasses;

public class Execution {
	@Test
    public void testOpenBrowser() throws IOException, InterruptedException {
	    Logger log = Logger.getLogger(Execution.class);
        OpenBrowser open = new OpenBrowser();
        open.navigate();
        
        Glasses g=new Glasses();
        g.womensGlasses();
        g.mensGlasses();
        g.kidsGlasses();
        
        SunGlasses sg=new SunGlasses();
        sg.womensGlasses();
        sg.mensGlasses();
        sg.kidsGlasses();
        
        Lenses l=new Lenses();
        l.svGlasses();
        l.proGlasses();
        l.transitions();
        
        open.quit();
        
    }

}
