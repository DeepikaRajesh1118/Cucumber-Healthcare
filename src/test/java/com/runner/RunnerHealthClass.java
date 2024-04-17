package com.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.generate.Jvm_Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/health1.feature",
                 glue="org.stepdefinition",
                 monochrome=true,
                 dryRun=false,
                 strict=true,
                 plugin={"pretty","html:target/html/HtmlReport.html","junit:target/JuniReports/JunitReports.xml","json:target/JsonReport/jsonReports.json"},
                 tags={"@Test1,@Test2,@Test3,@Test4"})
                 
  

public class RunnerHealthClass {
	
	@AfterClass
	public static void repGenerate() {
		
		Jvm_Report.jvmReportGeneration("C:\\Users\\Deepika.LAPTOP-55ACCVSQ\\eclipse-workspace\\HealthCareProject\\target\\JsonReport\\jsonReports.json");
        //Jvm_Report.jvmReportGeneration(System.getProperty("user.dir")+"\\JsReport.json");
		//instead of above that using this 
}
}
















//important synopis
//{"src/test/resources/adactin.feature",
//"src/test/resources/search.feature"},
//glue={"org.adactinstep","com.hooks"},
//tags={"@Test1,@Test2,@Test3,@Test4"}
//tags={"@Test1"}
