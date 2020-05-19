package com.madjava.micro.exception.filestore;

public class MediaFolderExceedMaxDepthException extends Exception {
	private static final long serialVersionUID = -1190805377017549025L;
	
	public MediaFolderExceedMaxDepthException() {
        super();
    }
	public MediaFolderExceedMaxDepthException(String message) {
	    super(message);
	}
}
