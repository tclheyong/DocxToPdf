package com.tcl.convert;

import com.lowagie.text.FontFactoryImp;

public class ExtFontFactoryImp extends FontFactoryImp {
	public ExtFontFactoryImp(){
	     super();
	
}

public int registerDirectories(){
	    int i = 0;
       i += registerDirectory("c:/windows/fonts");
       i += registerDirectory("c:/winnt/fonts");
       i += registerDirectory("d:/windows/fonts");
       i += registerDirectory("d:/winnt/fonts");
       i += registerDirectory("/usr/share/X11/fonts", true);
       i += registerDirectory("/usr/X/lib/X11/fonts", true);
       i += registerDirectory("/usr/openwin/lib/X11/fonts", true);
       i += registerDirectory("/usr/share/fonts", true);
       i += registerDirectory("/usr/X11R6/lib/X11/fonts", true);
       i += registerDirectory("/Library/Fonts");
       i += registerDirectory("/System/Library/Fonts");
       i += registerDirectory(System.getenv("LICENSE_HOME"), true);			
       return i;

	}
}
