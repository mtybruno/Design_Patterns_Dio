package com.dio.lab.factory;

/**
 *  Aqui é utilizado o @override no método 'createDocuments()' para instanciar e retornar
 *  os objetos especificos em Documents
 */

class WordDocumentCreator extends DocCreator {
    @Override
    public Documents createDocument() {
        return new WordDocument();
    }
}

class PDFDocumentCreator extends DocCreator {
    @Override
    public Documents createDocument() {
        return new PdfDocument();
    }
}

