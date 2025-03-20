package com.example.employee_service.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressResponse {

    private int id;

    public String city;

    public String state;
}
