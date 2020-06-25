package com.gostep;

import lombok.Data;

import java.util.Map;

/**
 * A class that can be mapped to the GCF Pub/Sub Message event type. This is for use in
 * the background functions.
 *
 * <p>See the PubSubMessage definition for reference:
 * https://cloud.google.com/pubsub/docs/reference/rest/v1/PubsubMessage
 *
 * @author Mike Eltsufin
 */
@Data
public class PubSubMessage {

    private String data;
    private Map<String, String> attributes;
    private String messageId;
    private String publishTime;
}
