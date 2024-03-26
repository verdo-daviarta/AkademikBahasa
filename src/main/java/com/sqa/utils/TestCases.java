package com.sqa.utils;

public enum TestCases {

    T1("user berhasil login dengan username dan password yang valid");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
