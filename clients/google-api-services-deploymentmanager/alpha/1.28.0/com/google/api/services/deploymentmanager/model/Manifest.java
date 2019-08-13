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

package com.google.api.services.deploymentmanager.model;

/**
 * Model definition for Manifest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager Alpha API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Manifest extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The YAML configuration for this manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigFile config;

  /**
   * Output only. The fully-expanded configuration file, including any templates and references.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expandedConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Output only. The imported files for this manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImportFile> imports;

  static {
    // hack to force ProGuard to consider ImportFile used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ImportFile.class);
  }

  /**
   * Output only. Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertTime;

  /**
   * Output only. The YAML layout for this manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layout;

  /**
   * Output only.
   *
   * The name of the manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Self link for the manifest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Output only. The YAML configuration for this manifest.
   * @return value or {@code null} for none
   */
  public ConfigFile getConfig() {
    return config;
  }

  /**
   * Output only. The YAML configuration for this manifest.
   * @param config config or {@code null} for none
   */
  public Manifest setConfig(ConfigFile config) {
    this.config = config;
    return this;
  }

  /**
   * Output only. The fully-expanded configuration file, including any templates and references.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpandedConfig() {
    return expandedConfig;
  }

  /**
   * Output only. The fully-expanded configuration file, including any templates and references.
   * @param expandedConfig expandedConfig or {@code null} for none
   */
  public Manifest setExpandedConfig(java.lang.String expandedConfig) {
    this.expandedConfig = expandedConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Manifest setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. The imported files for this manifest.
   * @return value or {@code null} for none
   */
  public java.util.List<ImportFile> getImports() {
    return imports;
  }

  /**
   * Output only. The imported files for this manifest.
   * @param imports imports or {@code null} for none
   */
  public Manifest setImports(java.util.List<ImportFile> imports) {
    this.imports = imports;
    return this;
  }

  /**
   * Output only. Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertTime() {
    return insertTime;
  }

  /**
   * Output only. Creation timestamp in RFC3339 text format.
   * @param insertTime insertTime or {@code null} for none
   */
  public Manifest setInsertTime(java.lang.String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * Output only. The YAML layout for this manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getLayout() {
    return layout;
  }

  /**
   * Output only. The YAML layout for this manifest.
   * @param layout layout or {@code null} for none
   */
  public Manifest setLayout(java.lang.String layout) {
    this.layout = layout;
    return this;
  }

  /**
   * Output only.
   *
   * The name of the manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only.
   *
   * The name of the manifest.
   * @param name name or {@code null} for none
   */
  public Manifest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Self link for the manifest.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Self link for the manifest.
   * @param selfLink selfLink or {@code null} for none
   */
  public Manifest setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public Manifest set(String fieldName, Object value) {
    return (Manifest) super.set(fieldName, value);
  }

  @Override
  public Manifest clone() {
    return (Manifest) super.clone();
  }

}
