package com.akasia.fizzbuzz.services;

import org.springframework.stereotype.Service;

@Service
public class FizzbuzzServices {
    public StringBuilder generateFizzbuzz(Integer los) {
        String string 	 	   = "";
        StringBuilder response = new StringBuilder(string);

        for (int i = 1; i <= los; i++) {
            // TODO: multiple
            if (i % 3 == 0 && i % 5 == 0) {
                response.append("FWD").append(", ");
            } else if (i % 3 == 0) {
                response.append("AKASIA").append(", ");
            } else if (i % 5 == 0) {
                response.append("OK").append(", ");
            } else {
                response.append(String.valueOf(i)).append(", ");
            }
        }

        return response;
    }
}
