package com.solvd;

import com.solvd.generalpurpose.Hospital;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HospitalRunner {
    private static Logger LOGGER = LogManager.getLogger(HospitalRunner.class);

    public static void main (String[] args) {
        LOGGER.info("Starting program");

        Hospital hospital = new Hospital("Jhon Hopkins Hospital","123 Fake Street");


    }
}
