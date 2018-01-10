module soudegesu.springboot.jdknine.main.demo {

//    requires static lombok;
//    requires java.xml.ws;
//    requires java.xml.ws.annotation;
//    requires java.xml.bind;
    requires spring.web;
    requires spring.beans;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;

    opens soudegesu.springboot.jdknine.main.demo;
    opens soudegesu.springboot.jdknine.main.demo.controller;
    opens soudegesu.springboot.jdknine.main.demo.model;
    opens soudegesu.springboot.jdknine.main.demo.service;
//    exports soudegesu.springboot.jdknine.main.demo;
}