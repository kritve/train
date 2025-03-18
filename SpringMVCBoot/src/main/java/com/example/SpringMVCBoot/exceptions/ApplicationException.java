package com.example.SpringMVCBoot.exceptions;

public class ApplicationException extends RuntimeException {
  public ApplicationException(String message) {
    super(message);
  }
}
