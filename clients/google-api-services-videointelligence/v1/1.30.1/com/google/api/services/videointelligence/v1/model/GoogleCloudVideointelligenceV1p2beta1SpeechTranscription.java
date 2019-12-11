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

package com.google.api.services.videointelligence.v1.model;

/**
 * A speech recognition result corresponding to a portion of the audio.
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
public final class GoogleCloudVideointelligenceV1p2beta1SpeechTranscription extends com.google.api.client.json.GenericJson {

  /**
   * May contain one or more recognition hypotheses (up to the maximum specified in
   * `max_alternatives`).  These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative> alternatives;

  static {
    // hack to force ProGuard to consider GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative.class);
  }

  /**
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most likelihood of being
   * spoken in the audio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * May contain one or more recognition hypotheses (up to the maximum specified in
   * `max_alternatives`).  These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative> getAlternatives() {
    return alternatives;
  }

  /**
   * May contain one or more recognition hypotheses (up to the maximum specified in
   * `max_alternatives`).  These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * @param alternatives alternatives or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1SpeechTranscription setAlternatives(java.util.List<GoogleCloudVideointelligenceV1p2beta1SpeechRecognitionAlternative> alternatives) {
    this.alternatives = alternatives;
    return this;
  }

  /**
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most likelihood of being
   * spoken in the audio.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Output only. The [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag of the
   * language in this result. This language code was detected to have the most likelihood of being
   * spoken in the audio.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1SpeechTranscription setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1SpeechTranscription set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p2beta1SpeechTranscription) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1SpeechTranscription clone() {
    return (GoogleCloudVideointelligenceV1p2beta1SpeechTranscription) super.clone();
  }

}
