package com.tcl.convert;

public class Test {

	public static void main(String[] args) {
		String docxFilePath = "D:/�򵥻�ƽ̨��ҵ����ҵ��Э��.docx";
		String pdfFilePath ="D:/�򵥻�ƽ̨��ҵ����ҵ��Э��.pdf";
		try {
			DocxToPdf.convertPdf(docxFilePath, pdfFilePath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}