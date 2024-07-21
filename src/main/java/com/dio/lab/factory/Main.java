package com.dio.lab.factory;

/**
 * A classe Main é utilizada nas subclasses DocumentCreator
 * para criar e manipular objetos sem precisar saber seus tipos exatos
 *
 * @author mtyBruno
 */

public class Main {
    public static void main(String[] args) {
        DocCreator wordCreator = new WordDocumentCreator();
        wordCreator.newDocument();

        DocCreator pdfCreator = new PDFDocumentCreator();
        pdfCreator.newDocument();
    }
}
