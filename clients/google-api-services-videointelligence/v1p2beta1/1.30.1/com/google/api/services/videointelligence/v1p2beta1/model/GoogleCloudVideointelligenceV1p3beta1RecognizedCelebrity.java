/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.videointelligence.v1p2beta1.model;

/**
 * The recognized celebrity with confidence score.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity extends com.google.api.client.json.GenericJson {

  /**
   * The recognized celebrity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p3beta1Celebrity celebrity;

  /**
   * Recognition confidence. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * The recognized celebrity.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1Celebrity getCelebrity() {
    return celebrity;
  }

  /**
   * The recognized celebrity.
   * @param celebrity celebrity or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity setCelebrity(GoogleCloudVideointelligenceV1p3beta1Celebrity celebrity) {
    this.celebrity = celebrity;
    return this;
  }

  /**
   * Recognition confidence. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Recognition confidence. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity clone() {
    return (GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity) super.clone();
  }

}
