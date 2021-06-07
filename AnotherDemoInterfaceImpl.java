package com.anz.cobra.fileformat.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AnotherDemoInterfaceImpl implements DemoInterface{

    public String state;

    @Override
    public String print() {
        log.debug("State : {}", state);
        if (state == null) {
            state = "New state";
        }
        return "This is the Impl";
    }
}
