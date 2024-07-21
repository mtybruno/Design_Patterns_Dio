package com.dio.lab.factory;

/**
 * Aqui é declaro o Factory method 'createDocument' que recebe um @override
 * para cada tipo especifico de documento
 *
 */
public abstract class DocCreator {
    public abstract Documents createDocument ();

    public void newDocument () {
        Documents doc =  createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}
