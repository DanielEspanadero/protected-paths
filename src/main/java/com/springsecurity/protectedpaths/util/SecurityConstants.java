package com.springsecurity.protectedpaths.util;

public class SecurityConstants {
    public static final String SECRET = "YourSecretKey"; // Replace with your secret key for JWT
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days in milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
