package org.example;

import io.restassured.RestAssured;

public class test
{
    public static void main(String[] args)
    {
        RestAssured.baseURI= "http://localhost:3000/posts";
    }

}
