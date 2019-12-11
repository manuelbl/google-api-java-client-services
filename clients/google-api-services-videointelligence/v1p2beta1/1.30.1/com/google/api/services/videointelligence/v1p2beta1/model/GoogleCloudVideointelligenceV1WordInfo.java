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
 * Word-specific information for recognized words. Word information is only included in the response
 * when certain request parameters are set, such as `enable_word_time_offsets`.
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
public final class GoogleCloudVideointelligenceV1WordInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an
   * estimated greater likelihood that the recognized words are correct. This field is set only for
   * the top alternative. This field is not guaranteed to be accurate and users should not rely on
   * it to be always provided. The default of 0.0 is a sentinel value indicating `confidence` was
   * not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Time offset relative to the beginning of the audio, and corresponding to the end of the spoken
   * word. This field is only set if `enable_word_time_offsets=true` and only in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can vary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. A distinct integer value is assigned for every speaker within the audio. This
   * field specifies which one of those speakers was detected to have spoken this word. Value ranges
   * from 1 up to diarization_speaker_count, and is only set if speaker diarization is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer speakerTag;

  /**
   * Time offset relative to the beginning of the audio, and corresponding to the start of the
   * spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top
   * hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The word corresponding to this set of information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String word;

  /**
   * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an
   * estimated greater likelihood that the recognized words are correct. This field is set only for
   * the top alternative. This field is not guaranteed to be accurate and users should not rely on
   * it to be always provided. The default of 0.0 is a sentinel value indicating `confidence` was
   * not set.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Output only. The confidence estimate between 0.0 and 1.0. A higher number indicates an
   * estimated greater likelihood that the recognized words are correct. This field is set only for
   * the top alternative. This field is not guaranteed to be accurate and users should not rely on
   * it to be always provided. The default of 0.0 is a sentinel value indicating `confidence` was
   * not set.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1WordInfo setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Time offset relative to the beginning of the audio, and corresponding to the end of the spoken
   * word. This field is only set if `enable_word_time_offsets=true` and only in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can vary.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Time offset relative to the beginning of the audio, and corresponding to the end of the spoken
   * word. This field is only set if `enable_word_time_offsets=true` and only in the top hypothesis.
   * This is an experimental feature and the accuracy of the time offset can vary.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1WordInfo setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. A distinct integer value is assigned for every speaker within the audio. This
   * field specifies which one of those speakers was detected to have spoken this word. Value ranges
   * from 1 up to diarization_speaker_count, and is only set if speaker diarization is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSpeakerTag() {
    return speakerTag;
  }

  /**
   * Output only. A distinct integer value is assigned for every speaker within the audio. This
   * field specifies which one of those speakers was detected to have spoken this word. Value ranges
   * from 1 up to diarization_speaker_count, and is only set if speaker diarization is enabled.
   * @param speakerTag speakerTag or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1WordInfo setSpeakerTag(java.lang.Integer speakerTag) {
    this.speakerTag = speakerTag;
    return this;
  }

  /**
   * Time offset relative to the beginning of the audio, and corresponding to the start of the
   * spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top
   * hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Time offset relative to the beginning of the audio, and corresponding to the start of the
   * spoken word. This field is only set if `enable_word_time_offsets=true` and only in the top
   * hypothesis. This is an experimental feature and the accuracy of the time offset can vary.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1WordInfo setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The word corresponding to this set of information.
   * @return value or {@code null} for none
   */
  public java.lang.String getWord() {
    return word;
  }

  /**
   * The word corresponding to this set of information.
   * @param word word or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1WordInfo setWord(java.lang.String word) {
    this.word = word;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1WordInfo set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1WordInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1WordInfo clone() {
    return (GoogleCloudVideointelligenceV1WordInfo) super.clone();
  }

}
