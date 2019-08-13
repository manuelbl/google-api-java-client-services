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
 * Type Information. Contains detailed information about a composite type, base type, or base type
 * with specific collection.
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
public final class TypeInfo extends com.google.api.client.json.GenericJson {

  /**
   * The description of the type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this field will be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentationLink;

  /**
   * Output only. Type of the output. Always deploymentManager#TypeInfo for TypeInfo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The base type or composite type name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * For base types with a collection, we return a schema and documentation link For template types,
   * we return only a schema
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TypeInfoSchemaInfo schema;

  /**
   * Output only. Self link for the type provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The title on the API descriptor URL provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The description of the type.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the type.
   * @param description description or {@code null} for none
   */
  public TypeInfo setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this field will be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentationLink() {
    return documentationLink;
  }

  /**
   * For swagger 2.0 externalDocs field will be used. For swagger 1.2 this field will be empty.
   * @param documentationLink documentationLink or {@code null} for none
   */
  public TypeInfo setDocumentationLink(java.lang.String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

  /**
   * Output only. Type of the output. Always deploymentManager#TypeInfo for TypeInfo.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Output only. Type of the output. Always deploymentManager#TypeInfo for TypeInfo.
   * @param kind kind or {@code null} for none
   */
  public TypeInfo setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The base type or composite type name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The base type or composite type name.
   * @param name name or {@code null} for none
   */
  public TypeInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * For base types with a collection, we return a schema and documentation link For template types,
   * we return only a schema
   * @return value or {@code null} for none
   */
  public TypeInfoSchemaInfo getSchema() {
    return schema;
  }

  /**
   * For base types with a collection, we return a schema and documentation link For template types,
   * we return only a schema
   * @param schema schema or {@code null} for none
   */
  public TypeInfo setSchema(TypeInfoSchemaInfo schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Output only. Self link for the type provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Self link for the type provider.
   * @param selfLink selfLink or {@code null} for none
   */
  public TypeInfo setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The title on the API descriptor URL provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title on the API descriptor URL provided.
   * @param title title or {@code null} for none
   */
  public TypeInfo setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public TypeInfo set(String fieldName, Object value) {
    return (TypeInfo) super.set(fieldName, value);
  }

  @Override
  public TypeInfo clone() {
    return (TypeInfo) super.clone();
  }

}
