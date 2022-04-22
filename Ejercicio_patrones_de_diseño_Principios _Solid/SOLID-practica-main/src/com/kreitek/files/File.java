package com.kreitek.files;

import java.util.List;

public  class File extends FileSystemItemBase implements FileSystemItem {

    private int size = 0;
    private boolean isOpen = false;
    private int position = 0;

    public File(FileSystemItem parent, String name) {
        super(parent, name);
    }

    @Override
    public List<FileSystemItem> listFiles() {
        throw new UnsupportedOperationException("No es válido para ficheros");
    }

    @Override
    public void addFile(FileSystemItem file) {
        throw new UnsupportedOperationException("No es válido para ficheros");
    }

    @Override
    public void removeFile(FileSystemItem file) {
        throw new UnsupportedOperationException("No es válido para ficheros");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void open() {
        isOpen = true;
        // Aquí vendría código que actualizaría también this.size
    }

    @Override
    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        size += buffer.length;
        position += buffer.length;
    }

    @Override
    public void close() {
        isOpen = false;
    }



}
