package org.jvm.report.generate;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm_Report {
	
	
	//json report came from TestRunnerClass
	public static void jvmReportGeneration(String jsonReportPath) {
		
		
		//1.Mention the target folder location - file
		File f=new File("C:\\Users\\Deepika.LAPTOP-55ACCVSQ\\eclipse-workspace\\HealthCareProject\\target\\JvmReport");
		
		
		//2.add details to the report using congiguration class
		Configuration c=new Configuration(f, "HealthCareProject");
		c.addClassifications("platform", "Windows");
		c.addClassifications("platform Version", "10");
		c.addClassifications("Browser", "FireFox");
		c.addClassifications("Browser Version", "69");
		c.addClassifications("Sprit no", "2");
		
		
		//3.add json file paths into list<String>
		List<String> l=new ArrayList<String>();
		l.add(jsonReportPath);
		
		//4.create object for Report Builder class
		ReportBuilder r=new ReportBuilder(l,c);
		r.generateReports();
		
	}

}
