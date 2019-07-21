How to use

import com.saqqu.advanceddateformatter.AdvDateFormatter;


 String date = "01-01-1900";
 String currentFormat = "dd-MM-yyyy";
 
 String thFormattedDate = AdvDateFormatter.getThFormattedDate(date,currentFormat);
 String thFormattedDateYesterday = AdvDateFormatter.getDateThFormatBefore(1,date,currentFormat);
 String thFormattedDateNoYear = AdvDateFormatter.getThFormattedDate(date,currentFormat,false,true);
 String thFormattedDateNoYearNoMonth = AdvDateFormatter.getThFormattedDate(date,currentFormat,false,false);
 
 
 Add this to Project level build.gradle
 
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Add this to app level dependencies
  
  dependencies {
	        implementation 'com.github.SaqlainShohrab:adv-date-formatter:5bffb1a84d'
	}
