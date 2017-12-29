module soudegesu.springboot.jdk9.main {
    exports soudegesu.springboot.jdk9.main.demo;

    requires static lombok;
    requires java.xml.ws;
    requires java.xml.ws.annotation;
    requires java.xml.bind;

    requires spring.web;
    requires spring.beans;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;
}