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

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * Response for ListDevices method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalListDevicesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The devices that match the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SasPortalDevice> devices;

  static {
    // hack to force ProGuard to consider SasPortalDevice used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SasPortalDevice.class);
  }

  /**
   * A pagination token returned from a previous call to ListDevices method that indicates from
   * where listing should continue. If the field is missing or empty, it means there is no more
   * devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The devices that match the request.
   * @return value or {@code null} for none
   */
  public java.util.List<SasPortalDevice> getDevices() {
    return devices;
  }

  /**
   * The devices that match the request.
   * @param devices devices or {@code null} for none
   */
  public SasPortalListDevicesResponse setDevices(java.util.List<SasPortalDevice> devices) {
    this.devices = devices;
    return this;
  }

  /**
   * A pagination token returned from a previous call to ListDevices method that indicates from
   * where listing should continue. If the field is missing or empty, it means there is no more
   * devices.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token returned from a previous call to ListDevices method that indicates from
   * where listing should continue. If the field is missing or empty, it means there is no more
   * devices.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SasPortalListDevicesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public SasPortalListDevicesResponse set(String fieldName, Object value) {
    return (SasPortalListDevicesResponse) super.set(fieldName, value);
  }

  @Override
  public SasPortalListDevicesResponse clone() {
    return (SasPortalListDevicesResponse) super.clone();
  }

}
