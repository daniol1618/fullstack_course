package com.tr.fs.designPrinciples.solid.segregacionInterfaces.incorrect;

public interface ImpresoraMultifuncional {
    void print(String document);
    void scan(String document);
    void fax(String document);

    class impresoraSimple implements ImpresoraMultifuncional {
        @Override
        public void print(String document) {
            // Logic to print document
        }

        @Override
        public void scan(String document) {
            // Not needed for SimplePrinter but forced to implement
        }

        @Override
        public void fax(String document) {
            // Not needed for SimplePrinter but forced to implement
        }
    }

    class scanner implements ImpresoraMultifuncional {

        @Override
        public void print(String document) {
            // Not needed for Scanner but forced to implement
        }

        @Override
        public void scan(String document) {
            // Logic to scan document
        }

        @Override
        public void fax(String document) {
            // Not needed for Scanner but forced to implement
        }
    }
}
