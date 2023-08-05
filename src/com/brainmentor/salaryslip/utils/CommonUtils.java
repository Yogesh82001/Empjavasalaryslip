package com.brainmentor.salaryslip.utils;
//import com.brainmentor.salaryslip.model.*;

public class CommonUtils {
    public String formatName(String name) {
			// logic to format name
    	   if (name == null || name.isEmpty()) {
    	        return name;
    	    }

    	    StringBuilder converted = new StringBuilder();

    	    boolean convertNext = true;
    	    for (char ch : name.toCharArray()) {
    	        if (Character.isSpaceChar(ch)) {
    	            convertNext = true;
    	        } else if (convertNext) {
    	            ch = Character.toTitleCase(ch);
    	            convertNext = false;
    	        } else {
    	            ch = Character.toLowerCase(ch);
    	        }
    	        converted.append(ch);
    	    }

    	    return converted.toString();
    	}
		}
	

