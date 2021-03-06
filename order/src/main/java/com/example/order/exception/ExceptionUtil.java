package com.example.order.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.io.InputStream;

public class ExceptionUtil {
    public static ClientHttpResponse handleException(HttpRequest request, byte[] body, ClientHttpRequestExecution execution, BlockException exception) {

        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return null;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return 0;
            }

            @Override
            public String getStatusText() throws IOException {
                return null;
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return null;
            }

            @Override
            public HttpHeaders getHeaders() {
                return null;
            }
        };
    }

    /**
     * @Description: 普通阻塞错误
     * @param:
     * @return:
     */
    public static String exceptionHandler(BlockException ex) {
        System.err.println("错误发生: " + ex.getClass().getCanonicalName());
        return "error";
    }
}
