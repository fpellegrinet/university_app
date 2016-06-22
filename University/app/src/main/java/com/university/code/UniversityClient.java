package com.university.code;

import android.net.http.AndroidHttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class UniversityClient {

    public JSONObject get(String uri) {
        JSONObject obj = null;
        AndroidHttpClient client = AndroidHttpClient.newInstance("Android");
        HttpGet request = new HttpGet(uri);
        HttpResponse response = null;
        try {
            request.setHeader("Content-Type", "application/json");
            response = client.execute(request);
            if (response!=null && response.getStatusLine().getStatusCode()== HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    InputStream is = null;
                    try {
                        is = entity.getContent();
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        byte[] buffer = new byte[1024];
                        int length = 0;
                        while ((length = is.read(buffer)) != -1) {
                            baos.write(buffer, 0, length);
                        }
                        obj = new JSONObject(new String(baos.toByteArray()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return null;
                    } finally {
                        if (is != null) {
                            is.close();
                        }
                        entity.consumeContent();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            client.close();
        }
        return obj;
    }
}
