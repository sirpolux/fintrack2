package com.project.fintrack2.utility;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Utility {
    public static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
}
