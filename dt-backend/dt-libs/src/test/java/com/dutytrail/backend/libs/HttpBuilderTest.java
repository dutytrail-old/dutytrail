package com.dutytrail.backend.libs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HttpBuilderTest {

    @Test
    public void shouldBuildStringResponse() {
        ResponseEntity errorResponse = HttpBuilder.build("{ response: \"ok\"}");
        Assert.assertEquals(HttpStatus.OK, errorResponse.getStatusCode());
    }

    @Test
    public void shouldBuildServerErrorResponse() {
        ResponseEntity errorResponse = HttpBuilder.build(new RuntimeException("My Error"));
        Assert.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, errorResponse.getStatusCode());
    }
}
