package com.dutytrail.backend.libs;

import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.Collections;

public class HttpBuilder {

    public static ResponseEntity build(String data) {
        return build(jsonByDefault(), data);
    }

    private static ResponseEntity build(MultivaluedMap<String, String> headers, String data) {
        HttpHeaders springHeaders = new HttpHeaders();
        if(headers!=null && !headers.isEmpty()) {
            for (String key : headers.keySet()) {
                springHeaders.add(key, headers.getFirst(key));
            }
        }
        return ResponseEntity.ok().headers(springHeaders).body(data);
    }

    public static ResponseEntity build(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
    }

    private static MultivaluedMap<String, String> jsonByDefault() {
        MultivaluedMap<String, String> multivaluedResponseHeaders = new MultivaluedMapImpl();
        multivaluedResponseHeaders.put(HttpHeaders.CONTENT_TYPE, Collections.singletonList(MediaType.APPLICATION_JSON));
        return multivaluedResponseHeaders;
    }

}
