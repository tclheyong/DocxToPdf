package com.tcl.convert;

public class Test {

	public static void main(String[] args) {
		String docxFilePath = "D:/简单汇平台商业保理业务协议.docx";
		String pdfFilePath ="D:/简单汇平台商业保理业务协议.pdf";
		try {
			DocxToPdf.convertPdf(docxFilePath, pdfFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}