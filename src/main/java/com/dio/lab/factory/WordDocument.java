package com.dio.lab.factory;

/**
 * Aqui é implementado a interface Document
 */

class WordDocument implements Documents {

    @Override
    public void open() {
        System.out.println("Opening word document...");

    }

    @Override
    public void save() {
        System.out.println("Saving word document...");

    }

    @Override
    public void close() {
        System.out.println("Closing word document...");

    }
}

class PdfDocument implements Documents {

    @Override
    public void open() {
        System.out.println("Opening PDF document...");

    }

    @Override
    public void save() {
        System.out.println("Saving PDF document...");

    }

    @Override
    public void close() {
        System.out.println("Closing PDF document...");

    }
}
