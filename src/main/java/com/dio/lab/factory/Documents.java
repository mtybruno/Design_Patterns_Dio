package com.dio.lab.factory;

/**
 * Product Interface: define o método que os documentos deverão implementar
 * open, save e close
 */
public interface Documents {
    void open();
    void save();
    void close();
}
