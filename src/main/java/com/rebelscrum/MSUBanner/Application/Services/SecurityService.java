package com.rebelscrum.MSUBanner.Application.Services;

public interface SecurityService {
    String findLoggedInUsername();

        void autologin(String username, String password);
}
