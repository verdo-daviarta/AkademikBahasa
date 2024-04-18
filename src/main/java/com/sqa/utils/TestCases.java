package com.sqa.utils;

public enum TestCases {

    T1("User berhasil menambahkan Kursus baru");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
